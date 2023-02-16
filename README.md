# Automation Project - Java Appium Tests 

>This is a basic Automation Java project that is part of o CI/CD project for an Android Mobile app

![GitHub Workflow Status (with branch)](https://img.shields.io/github/actions/workflow/status/jayc13/automation-java-appium-android-for-notes/docker-image.yml?branch=main&label=TESTS%20-%20Build%20%26%20RUN&style=for-the-badge)

![Docker Image Version (latest semver)](https://img.shields.io/docker/v/caballerojavier13/automation-java-appium-notes?style=for-the-badge) ![GitHub last commit (branch)](https://img.shields.io/github/last-commit/jayc13/automation-java-appium-android-for-notes/main?label=Release%20date&style=for-the-badge)

![GitHub issues](https://img.shields.io/github/issues/jayc13/automation-java-appium-android-for-notes?style=for-the-badge) ![GitHub](https://img.shields.io/github/license/jayc13/automation-java-appium-android-for-notes?style=for-the-badge) ![GitHub Sponsors](https://img.shields.io/github/sponsors/jayc13?style=for-the-badge)

![Docker Pulls](https://img.shields.io/docker/pulls/caballerojavier13/automation-java-appium-notes?style=for-the-badge) ![Docker Image Size (tag)](https://img.shields.io/docker/image-size/caballerojavier13/automation-java-appium-notes/latest?label=Docker%20Image%20Size&style=for-the-badge)
---
## Technologies

 - Java
 - Gradle
 - Appium
 - Android
 - Docker
 - Browserstack
 - GitHub CI

## Diagram

---

## Test Documentation

### Environmental Variables

 - `RUN_ON_BROWSERSTACK`
    - **Default:** `False`
    - **Type:** `Boolean`
    - **Description:** Switch between a remote execution on Browserstack and a local configuration
 - `APP_PATH`
    - **Required**
    - **Type:** `String`
    - **Format allowed:** `apk` | `apk.zip`
    - **Description:** Local or remote path to the application to test
 - `DEVICE_NAME`
    - **Required:** Only for browserstack, not needed locally
    - **Type:** `String`
    - **Description:** For Browserstack the device name and the platform version has to match the availability. For mor details check the [official documentation.](https://www.browserstack.com/app-automate/capabilities?tag=w3c)
 - `PLATFORM_VERSION`
    - **Required:** Only for browserstack, not needed locally
    - **Type:** `String`
   - **Description:** For Browserstack the device name and the platform version has to match the availability. For mor details check the [official documentation.](https://www.browserstack.com/app-automate/capabilities?tag=w3c)
 - `BROWSERSTACK_USERNAME` ==Browserstack only==
    - **Required:** If `RUN_ON_BROWSERSTACK` is enabled
    - **Type:** `String`
    - **Description:**
 - `BROWSERSTACK_ACCESS_KEY` ==Browserstack only==
    - **Required:** If `RUN_ON_BROWSERSTACK` is enabled
    - **Type:** `String`
    - **Description:** Browser stack credentials
 - `BROWSERSTACK_BUILD_NAME` ==Browserstack only==
    - **Required:** If `RUN_ON_BROWSERSTACK` is enabled
    - **Type:** `String`
    - **Description:**
 - `BROWSERSTACK_PROJECT_NAME` ==Browserstack only==
    - **Required:** If `RUN_ON_BROWSERSTACK` is enabled
    - **Type:** `String`
    - **Description:**
