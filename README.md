[![build main branch](https://github.com/MikAoJk/ktor-websocket-chat/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/MikAoJk/ktor-websocket-chat/actions/workflows/build.yml)
![GitHub issues](https://img.shields.io/github/issues-raw/MikAoJk/ktor-websocket-chat)
![GitHub pull requests](https://img.shields.io/github/issues-pr-raw/MikAoJk/ktor-websocket-chat)
![GitHub](https://img.shields.io/github/license/MikAoJk/ktor-websocket-chat)

# ktor-websocket-chat
A simple chat application that uses WebSockets

## Technologies used
* JDK 17
* Kotlin
* Gradle
* Ktor

## Getting started

### Prerequisites
Make sure you have the Java JDK 17 installed
You can check which version you have installed using this command:
``` bash
java -version
```

#### Building the application
To build locally and run the integration tests you can simply run
``` bash
./gradlew clean build
```
or on windows `gradlew.bat clean build`

### Upgrading the gradle wrapper
Find the newest version of gradle here: https://gradle.org/releases/ Then run this command:

``` bash
./gradlew wrapper --gradle-version $gradleVersjon
```

## 👥 Contact

This project is maintained by [CODEOWNERS](CODEOWNERS)

Questions and/or feature requests?
Please create an [issue](https://github.com/MikAoJk/ktor-websocket-chat/issues)

## ✏️ Contributing

To get started, please fork the repo and checkout a new branch. You can then build the library with the Gradle wrapper

```shell script
./gradlew build
```

See more info in [CONTRIBUTING.md](CONTRIBUTING.md)

