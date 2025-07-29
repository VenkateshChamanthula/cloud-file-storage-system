# ☁️ Cloud File Storage System  
**Upload -  View -  Download — built with Java 17 & Spring Boot**









▶️ **[Live Demo](https://glorious-cod-p5769j697qpc9r94-8080.app.github.dev/)** 
_Nothing to install. Try the app, hosted via GitHub Codespaces!_


## 🚀 About the Project

Your own mini-cloud: **store & manage files easily**!  
Upload, browse, and download files (PDFs, images, docs, etc.) with a slick UI.  
Built clean with Spring Boot (MVC), Thymeleaf, and safe local storage.

## 🖥️ Screenshots

| Upload File                       | Files List                        |
|-----------------------------------|-----------------------------------|
| ![Upload](storage/screens ![Files](storage/screens 🎯 Core Features

- **Universal Uploads**: Drop in PDFs, images, docs, and more.
- **File Listing**: Instantly see all your files with metadata (name, size, date).
- **Direct Downloads**: Click to download any stored file.
- **Secure Storage**: Files kept safe in a server-side `/storage/` folder—never in public web roots.
- **Clean MVC**: Clear separation (controller, service, repo, model).
- **Polished UI**: Responsive and minimalist, thanks to Thymeleaf.
- **Easy Build & Deploy**: One simple Maven build, ready for cloud IDEs.

## 🧑💻 Tech Stack

| Layer     | Technologies             |
|-----------|-------------------------|
| Backend   | Java 17, Spring Boot 3.2 |
| Frontend  | Thymeleaf                |
| Build     | Maven                    |
| Deploy    | GitHub Codespaces        |
| Storage   | Local File System        |

## 🗂️ Project Structure

```shell
cloud-file-storage-system/
├─ src/
│  └─ main/
│     ├─ java/com/example/cloud/
│     │   ├─ CloudFileStorageApplication.java
│     │   ├─ controller/FileController.java
│     │   ├─ service/FileStorageService.java
│     │   ├─ repository/FileRepository.java
│     │   └─ model/FileMetadata.java
│     └─ resources/
│         ├─ application.properties
│         └─ templates/
│             ├─ upload.html
│             └─ files.html
├─ storage/           # Local file uploads
├─ pom.xml
└─ README.md
```

## ⚡ Quickstart

```bash
# 1. Clone this repository
git clone https://github.com/VenkateshChamanthula/cloud-file-storage-system.git
cd cloud-file-storage-system

# 2. Build with Maven
mvn clean install

# 3. Run the application
mvn spring-boot:run

# 4. Open your browser
http://localhost:8080

# 🎉 Uploads appear in the /storage folder!
```

## 📚 What You’ll Learn

- 🌱 Modern Spring Boot (3+) MVC patterns
- 🗂️ Robust Java file I/O techniques
- 🎨 Dynamic template rendering with Thymeleaf
- 🛠️ Maven project navigation & build automation
- ☁️ Cloud IDE (Codespaces) best practices

## 🚀 Ideas for the Future

- 🔒 **User authentication** (multi-user support)
- ☁️ **Remote file storage** (AWS S3, GCP, Azure Blob, etc.)
- 📊 **Admin dashboard** with analytics
- 🧪 **Unit & integration tests**
- 📱 **Progressive Web App (PWA)** support

## 🙏 Credits

Created by [Venkatesh Chamanthula](https://www.linkedin.com/in/venkatesh-chamanthula/)  
**Solo project:** design, backend, UI, and deployment.

## 📬 Connect & Support

- Email: [venkateshchamanthula1@gmail.com](mailto:venkateshchamanthula1@gmail.com)
- LinkedIn: [@venkatesh-chamanthula](https://www.linkedin.com/in/venkatesh-chamanthula/)
- GitHub: [VenkateshChamanthula](https://github.com/VenkateshChamanthula)


  ⭐️ &nbsp;**Star this repo if it helped you!** &nbsp;⭐️
  Built with passion for the open-source community.


**Happy Coding!**

