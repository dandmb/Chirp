# Chirp

Chirp is a Kotlin Multiplatform (KMP) project for a chat application similar to WhatsApp, targeting Android, Desktop and iOS.

**Status:** 🚧 In Progress

## Tech Stack
- **Architecture:** MVVM (Modular)
- **Dependency Injection:** Koin
- **UI:** Jetpack Compose (Compose Multiplatform)
- **Networking:** Ktor
- **Database:** SQLDelight (Planned/In Progress)

## Project Structure

This project follows a modular architecture to promote separation of concerns and scalability.

### Core Modules
- **`:composeApp`**: The main entry point for the application. It contains platform-specific setups (Android, iOS, Desktop) and orchestrates navigation.
- **`:core:domain`**: Base entities, business logic interfaces, and core domain models.
- **`:core:data`**: Shared data sources, networking, and repository implementations.
- **`:core:presentation`**: Common UI logic, base ViewModels, and state management.
- **`:core:designsystem`**: The project's theme (ChirpTheme), colors, typography, and reusable UI components.

### Feature Modules
- **`:feature:auth`**: Authentication flow, including login and registration.
- **`:feature:chat`**: Core chat functionality, message handling, and conversation management.

### Platform Modules
- **`iosApp`**: Xcode project for the iOS target, serving as a thin wrapper around the shared Compose logic.

## Getting Started

### Prerequisites
- Android Studio / IntelliJ IDEA
- Xcode (for iOS development)
- Kotlin Multiplatform Mobile plugin

### Running the Project
1. **Android:** Select `composeApp` and run on an emulator or physical device.
2. **iOS:** Open `iosApp/iosApp.xcodeproj` in Xcode or run from Android Studio if the KMP plugin is configured.
3. **Desktop:** Run the `./gradlew :composeApp:run` command.

---
