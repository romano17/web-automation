package com.company.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class DriverFactory {
    /**
     * Method to create an instance of WebDriver
     *
     * @return A specific implementation of WebDriver
     */
    public static WebDriver getDriver(Browser browser) {
        switch (browser) {
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                return new FirefoxDriver();
        }
        throw new RuntimeException(String.format("Browser %s not supported", browser));
    }
}
