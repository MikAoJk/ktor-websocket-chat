[![build main branch](https://github.com/MikAoJk/ktor-websocket-chat/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/MikAoJk/ktor-websocket-chat/actions/workflows/build.yml)
![GitHub issues](https://img.shields.io/github/issues-raw/MikAoJk/ktor-websocket-chat)
![GitHub pull requests](https://img.shields.io/github/issues-pr-raw/MikAoJk/ktor-websocket-chat)
![GitHub](https://img.shields.io/github/license/MikAoJk/ktor-websocket-chat)

# ktor-websocket-chat
A simple chat application that uses WebSockets

## Technologies used
* JDK 21
* Kotlin
* Gradle
* Ktor

## Getting started

### Prerequisites
Make sure you have the Java JDK 21 installed
You can check which version you have installed using this command:
```bash script
java -version
```

#### Building the application
To build locally and run the integration tests you can simply run
```bash script
./gradlew clean build
```
or on windows `gradlew.bat clean build`

### Test local with
Start sever first
```bash script
./gradlew :ktor-websocket-chat-server:run
```
Then do this command two times to create two different clients
```bash script
./gradlew :ktor-websocket-chat-client:run -q --console=plain
```

### Upgrading the gradle wrapper
Find the newest version of gradle here: https://gradle.org/releases/ Then run this command:

```bash script
./gradlew wrapper --gradle-version $gradleVersjon
```

## 👥 Contact

This project is maintained by [CODEOWNERS](CODEOWNERS)

Questions and/or feature requests?
Please create an [issue](https://github.com/MikAoJk/ktor-websocket-chat/issues)

## ✏️ Contributing

To get started, please fork the repo and checkout a new branch. You can then build the library with the Gradle wrapper

```bash script
./gradlew build
```

See more info in [CONTRIBUTING.md](CONTRIBUTING.md)

