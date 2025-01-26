package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement closeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));
        closeButton.click();

        WebElement logo = driver.findElement(By.xpath("//img[@alt = 'Make My Trip']"));
        if (logo.isDisplayed()){
            System.out.println("MakeMyTrip logo is displayed!");
        }else{
            System.out.println("MakeMyTrip logo is not displayed!");
        }

        driver.quit();
    }
}
