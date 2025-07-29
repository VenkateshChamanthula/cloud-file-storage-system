<div align="center">
  <h1>☁️ Cloud File Storage System</h1>
  <p><i>Upload, view & download your files — built with Java + Spring Boot</i></p>
  <img src="https://img.shields.io/badge/Java-17-blue?style=flat-square" />
  <img src="https://img.shields.io/badge/SpringBoot-3.2.5-brightgreen?style=flat-square" />
  <img src="https://img.shields.io/github/languages/top/VenkateshChamanthula/cloud-file-storage-system?style=flat-square" />
</div>

---

## 🔥 Live Demo

👉 **[Click here to try the app](https://glorious-cod-p5769j697qpc9r94-8080.app.github.dev/)**  
> Hosted via GitHub Codespaces – no local setup needed!

---

## 📸 Screenshots

| Upload Page | File List Page |
|-------------|----------------|
| ![Upload](storage/screenshots/upload.png) | ![Files](storage/screenshots/files.png) |

---

## 🚀 Features

- 📁 Upload any file (PDFs, Docs, Images, etc.)
- 📜 View all uploaded files with download links
- 🧠 File metadata stored and displayed (filename, size, timestamp)
- 📂 Secure local storage (`/storage/` directory)
- 🧩 Cleanly separated controller, service, model, repository layers
- 🎨 Simple, responsive UI using **Thymeleaf**

---

## 🛠️ Tech Stack

| Layer        | Technologies Used |
|--------------|-------------------|
| Backend      | Java 17, Spring Boot |
| Frontend     | Thymeleaf Templates |
| Build Tool   | Maven |
| Deployment   | GitHub Codespaces |
| Storage      | Local File System |

---

## 🧠 Project Structure
cloud-file-storage-system/
│
├── src/
│ ├── main/
│ │ ├── java/com/example/cloud/
│ │ │ ├── CloudFileStorageApplication.java
│ │ │ ├── controller/FileController.java
│ │ │ ├── service/FileStorageService.java
│ │ │ ├── repository/FileRepository.java
│ │ │ └── model/FileMetadata.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── templates/
│ │ ├── upload.html
│ │ └── files.html
├── storage/
├── pom.xml
└── README.md


---

## ⚙️ Setup & Run Locally

```bash
# 1. Clone the repo
git clone https://github.com/VenkateshChamanthula/cloud-file-storage-system.git
cd cloud-file-storage-system

# 2. Build the project
mvn clean install

# 3. Run the app
mvn spring-boot:run

# 4. Visit in browser
http://localhost:8080

🗂️ Uploaded files will be stored in the /storage folder.

📌 Learning Outcomes
✅ MVC Architecture in Spring Boot
✅ File I/O handling in Java
✅ Thymeleaf templating
✅ Maven project management
✅ GitHub Codespaces workflow

💡 Future Enhancements
🔐 Add user login/authentication

☁️ Connect to AWS S3 / Google Cloud for remote storage

📊 Admin dashboard with analytics

🧪 Unit and integration tests

🙌 Acknowledgements
This project was designed, developed, and deployed by Venkatesh Chamanthula
as part of an open-source challenge by myself.
Every aspect of the project — from architectural planning, backend logic, and UI integration to Git and deployment — was handled independently.

📬 Contact
📧 venkateshchamanthula1@gmail.com
🔗 https://www.linkedin.com/in/venkatesh-chamanthula/
📂 For More Projects Visit Github:https://github.com/VenkateshChamanthula

<div align="center"> <strong>✨ Star this repo if you found it helpful!</strong> </div> ```
