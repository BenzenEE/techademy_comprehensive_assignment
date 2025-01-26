package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class MakeMyTripTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement closeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));
        closeButton.click();
    }

    @Test(priority = 1)
    public void selectFlightOption(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class = 'headerIcons makeFlex hrtlCenter column active']")));
        element.click();
    }
    @Test(priority = 2)
    public void selectOneWay(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-cy = 'oneWayTrip']")));
        element.click();
    }
    @Test(priority = 3)
    public void selectFromCity(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id = 'fromCity']")));
        element.click();
    }
    @Test(priority = 4)
    public void enteringFromValue() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")));
        element.sendKeys("pune");
    }
    @Test(priority = 5)
    public void selectingFromCity() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/ul/li[1]")));
        element.click();
    }

    @Test(priority = 6)
    public void selectToCity(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id = 'toCity']")));
        element.click();
    }

    @Test(priority = 7)
    public void enteringToValue() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")));
        element.sendKeys("kolkata");
    }
    @Test(priority = 8)
    public void selectingToCity() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")));
        element.click();
    }
    @Test(priority = 9)
    public void selectingDate(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[7]")));
        element.click();
    }
    @Test(priority = 10)
    public void search(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/p/a")));
        element.click();
    }
    @AfterClass
    public void tearup() {
        driver.quit();
    }
}
