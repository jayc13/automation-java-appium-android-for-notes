# Automation Project - Java Appium Tests 

>This is a basic Automation Java project that is part of o CI/CD project for an Android Mobile app
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
