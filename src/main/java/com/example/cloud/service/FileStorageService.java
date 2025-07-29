package com.example.cloud.service;

import com.example.cloud.model.FileMetadata;
import com.example.cloud.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class FileStorageService {

    private final Path storagePath = Paths.get("storage");

    @Autowired
    private FileRepository repo;

    public void saveFile(MultipartFile file) throws IOException {
        Path path = storagePath.resolve(file.getOriginalFilename());
        Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

        FileMetadata meta = new FileMetadata();
        meta.setFileName(file.getOriginalFilename());
        meta.setFileType(file.getContentType());
        meta.setSize(file.getSize());
        meta.setUploadTime(LocalDateTime.now());
        repo.save(meta);
    }

    public Resource loadFile(String filename) throws MalformedURLException {
        Path file = storagePath.resolve(filename);
        return new UrlResource(file.toUri());
    }

    public void deleteFile(String filename) throws IOException {
        Files.deleteIfExists(storagePath.resolve(filename));
        repo.delete(repo.findByFileName(filename).orElseThrow());
    }

    public List<FileMetadata> getAllFiles() {
        return repo.findAll();
    }
}
