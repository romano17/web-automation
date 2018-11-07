package com.company.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *  Base class with commonly used methods by all the different web
 *  pages being automated
 */
public abstract class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return this.driver;
    }

    public void dispose() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}
