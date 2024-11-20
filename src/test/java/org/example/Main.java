package org.example;


import io.appium.java_client.AppiumClientConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.en.When;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.ClientConfig;

import java.io.ObjectInputFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Main<MobileElement> {
    @When( "test lambdatest" )
    public void testLambdatest() throws MalformedURLException {
//        UiAutomator2Options capabilities = new UiAutomator2Options();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();

        // android app
        ltOptions.put("app", "lt://APP10160522181729759612344309");

        // device
        ltOptions.put("deviceName", "Galaxy A21s");
        ltOptions.put("platformVersion", "10");
        ltOptions.put("platformName", "android");
        ltOptions.put("isRealMobile", true);

        // Set other Lambdatest capabilities
        ltOptions.put("build", "lambdatest");
        ltOptions.put("name", "lambdatest-AndroidWebDriver-1");

        // language and region
        ltOptions.put("language", "de");
        ltOptions.put("locale", "de");
        ltOptions.put("region", "EU");
        ltOptions.put("unicodeKeyboard", true);
        ltOptions.put("resetKeyboard", true);

        // queue
        ltOptions.put("queueTimeout", 600);
        ltOptions.put("idleTimeout", 600);
        ltOptions.put("w3c", true);
        capabilities.setCapability("lt:options", ltOptions);

        System.out.println(LocalDateTime.now() + " start init AppiumDriver");

//
//        AppiumClientConfig config = AppiumClientConfig.defaultConfig().baseUrl(new URL(LambdaTest.getHubUrl()))
//                .connectionTimeout(Duration.ofMinutes(20))
//                .readTimeout(Duration.ofMinutes(20));

        // Initialize the Appium driver with the specified configuration
//
//        AppiumDriver driver = new AndroidDriver(config,capabilities);
        AppiumDriver driver;
        driver = new AppiumDriver(new URL(LambdaTest.getHubUrl()), capabilities);

//

        System.out.println(LocalDateTime.now() + " end init webdriver");
        ((JavascriptExecutor) driver).executeScript("lambda-hook: {\"action\": \"setTestStatus\",\"arguments\": {\"status\":\"passed\"}} ");

        driver.quit();
    }

    protected void initProxy() {
        System.setProperty("https.proxyHost", "62.192.194.114");
        System.setProperty("https.proxyPort", "8080");
        System.setProperty("http.proxyHost", "62.192.194.114");
        System.setProperty("http.proxyPort", "8080");
    }
}