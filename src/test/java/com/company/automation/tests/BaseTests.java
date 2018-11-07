package com.company.automation.tests;

import com.company.automation.pages.Browser;
import com.company.automation.pages.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTests {
    protected WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        this.driver = DriverFactory.getDriver(Browser.FIREFOX);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}
