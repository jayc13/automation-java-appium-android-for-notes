package config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTestSuite {

    public static final String AUTOMATE_USERNAME = System.getenv("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_ACCESS_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
    public static final String BROWSERSTACK_BUILD_NAME = System.getenv("BROWSERSTACK_BUILD_NAME");
    public static final String BROWSERSTACK_PROJECT_NAME = System.getenv("BROWSERSTACK_PROJECT_NAME");
    public static final String RUN_ON_BROWSERSTACK = System.getenv("RUN_ON_BROWSERSTACK");
    public static final String APP_PATH = System.getenv("APP_PATH");
    public static final String DEVICE_NAME = System.getenv("DEVICE_NAME");
    public static final String PLATFORM_VERSION = System.getenv("PLATFORM_VERSION");

    public AndroidDriver driver;

    @BeforeAll
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        URL remoteServer;

        // Common capabilities
        capabilities.setCapability(MobileCapabilityType.APP, APP_PATH);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);

        if (RUN_ON_BROWSERSTACK != null && RUN_ON_BROWSERSTACK.equalsIgnoreCase("TRUE")) {
            // Browserstack configuration
            capabilities.setCapability("project", BROWSERSTACK_PROJECT_NAME);
            capabilities.setCapability("build", BROWSERSTACK_BUILD_NAME);
            // Set your access
            System.out.println(AUTOMATE_USERNAME);
            HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
            browserstackOptions.put("userName", AUTOMATE_USERNAME);
            browserstackOptions.put("accessKey", AUTOMATE_ACCESS_KEY);

            capabilities.setCapability("bstack:options", browserstackOptions);
            remoteServer = new URL("http://hub.browserstack.com/wd/hub");
        } else {
            // Local machine configuration
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3600);
            remoteServer = new URL("http://0.0.0.0:4723/wd/hub");
        }

        // Driver initialization
        driver = new AndroidDriver(remoteServer, capabilities);
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }
}