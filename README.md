# 📦 Media Collection Tracker – Backend

This is the **Spring Boot** backend for the Media Collection Tracker project. It provides RESTful APIs to manage media items (books, movies, games, etc.) and supports AI-enhanced features when integrated with the frontend.

---

## 🚀 Features

- CRUD operations for media items
- Categorization and status handling
- Cross-origin support for frontend integration
- Ready for AI integration via OpenAI (optional)
- Lightweight setup with in-memory storage (or easily swappable to database)

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- CORS Configuration
- OpenAI Integration (optional)
- Maven

---



---

## 🔧 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/HassanHammoud9/media-collection-tracker-BE.git
cd media-collection-tracker-BE


./mvnw spring-boot:run
   

| Method | Endpoint          | Description               |
| ------ | ----------------- | ------------------------- |
| GET    | `/api/media`      | Get all media items       |
| POST   | `/api/media`      | Add a new media item      |
| PUT    | `/api/media`      | Update an existing item   |
| DELETE | `/api/media/{id}` | Delete a media item by ID |
