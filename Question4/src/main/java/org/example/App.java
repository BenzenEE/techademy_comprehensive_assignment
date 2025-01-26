package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.className("commonModal__close")).click();

        driver.findElement(By.xpath("//a[@class = 'headerIcons makeFlex hrtlCenter column active']")).click();

        driver.findElement(By.xpath("//li[@data-cy = 'oneWayTrip']")).click();

        driver.findElement(By.xpath("//input[@id = 'fromCity']")).click();

        driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("pune");
        Thread.sleep(1000);

        WebElement fromFirstOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")));
        fromFirstOption.click();

        driver.findElement(By.xpath("//input[@id = 'toCity']")).click();
        driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("kolkata");
        Thread.sleep(2000);
        WebElement toFirstOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")));
        toFirstOption.click();
    }
}
