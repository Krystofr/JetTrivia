# 🧠 Jetpack Compose Trivia App Template

A scalable, clean-architecture trivia app architecture template powered by **Jetpack Compose**, **Hilt**, and **Room** — built for rapid prototyping and scalable feature development. UI layers are intentionally left blank so developers can build their own frontends with flexibility.

---

## 🧱 Architecture

This project follows Clean Architecture principles and is organized into the following modules:

app.christopher.jettrivia
├── data
│   ├── local                # Room database, DAO, and entities
│   └── repository           # Repository implementation
│
├── domain
│   ├── model                # Domain models (e.g., Question.kt)
│   ├── repository           # Repository interfaces (abstractions)
│   └── usecase              # Business logic (UseCases)
│
├── di                      # Hilt dependency injection modules
│
├── presentation            # UI logic (currently empty — ready for Compose screens)
│
├── util                    # Seeder and utility functions
│
└── TriviaApp.kt            # Application class with @HiltAndroidApp


---

## ✅ Tech Stack

| Layer | Library |
|-------|---------|
| Language | Kotlin (1.9.23) |
| UI | Jetpack Compose (BOM 2025.04.00 / Compiler 1.5.10) |
| DI | Hilt (2.48) |
| DB | Room (2.6.1) |
| Navigation | Navigation Compose (2.6.0) |
| Lifecycle | ViewModel + Runtime KTX (2.6.2) |
| Coroutines | kotlinx-coroutines (1.6.1) |

---

## 📂 Core Features

- ✅ Clean Architecture separation of concerns  
- ✅ Room database with `QuestionEntity`  
- ✅ Hilt Dependency Injection  
- ✅ Domain-driven UseCases  
- ✅ ViewModel exposing `StateFlow` for question state  
- ✅ Seeder for 40 questions on first launch  
- ✅ Fully scalable backend architecture ready for UI integration  
- 🚫 No UI — build your own on top of a rock-solid backend

---

## 📦 Seeded Question Categories

On app launch, Room database is seeded with **40 trivia questions**:

- 🔬 10 Science questions  
- 🏛️ 10 History questions  
- 🎬 10 Movies questions  
- 🏅 10 Sports questions  

Accessible via:
```kotlin
viewModel.loadQuestionsByCategory("Science")

---

## 🚀 Getting Started

### 1. Clone the template
```bash
git clone https://github.com/Krystofr/JetTrivia.git


---

Let me know if you'd like:
- A matching GitHub `.gitignore`
- A preview GIF or placeholder screenshot
- A GitHub Actions workflow (CI/CD for builds/tests)
- Extension for API support
