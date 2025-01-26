package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogoTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test
    public void closePopup(){
        WebElement closeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));
        closeButton.click();
    }

    @Test(dependsOnMethods = {"closePopup"})
    public void isLogoPresent(){
        WebElement logo = driver.findElement(By.xpath("//img[@alt = 'Make My Trip']"));
        Assert.assertTrue(logo.isDisplayed(), "MakeMyTrip logo is not displayed!");
    }
    @AfterMethod
    public void tearup(){
        driver.quit();
    }
}
