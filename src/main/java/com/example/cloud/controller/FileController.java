package com.example.cloud.controller;

import com.example.cloud.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class FileController {

    @Autowired
    private FileStorageService service;

    @GetMapping("/")
    public String index() {
        return "upload";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, Model model) {
        try {
            service.saveFile(file);
            model.addAttribute("message", "Upload successful!");
        } catch (Exception e) {
            model.addAttribute("message", "Upload failed: " + e.getMessage());
        }
        return "upload";
    }

    @GetMapping("/files")
    public String listFiles(Model model) {
        model.addAttribute("files", service.getAllFiles());
        return "files";
    }

    @GetMapping("/download/{filename}")
    public ResponseEntity<Resource> download(@PathVariable String filename) throws IOException {
        Resource resource = service.loadFile(filename);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"")
                .body(resource);
    }

    @GetMapping("/delete/{filename}")
    public String delete(@PathVariable String filename) throws IOException {
        service.deleteFile(filename);
        return "redirect:/files";
    }
}
