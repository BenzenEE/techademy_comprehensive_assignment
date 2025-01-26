package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MakeMyTrip {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            clickElement(wait, "//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span");
        } catch (Exception e) {
            System.out.println("No login popup displayed.");
        }
        clickElement(wait, "//a[@class = 'headerIcons makeFlex hrtlCenter column active']");
        clickElement(wait, "//li[@data-cy = 'oneWayTrip']");
        clickElement(wait, "//input[@id = 'fromCity']");
        findElementByXpath(driver, "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input").sendKeys("pune");
        Thread.sleep(1000);
        clickElement(wait, "/html/body/div/div/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/ul/li[1]");

        clickElement(wait, "//input[@id = 'toCity']");
        findElementByXpath(driver, "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input").sendKeys("kolkata");
        Thread.sleep(1000);
        clickElement(wait, "//*[@id=\"react-autowhatever-1-section-0-item-0\"]");
        clickElement(wait, "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[7]");

        clickElement(wait, "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/p/a");
    }

    public static void clickElement(WebDriverWait wait, String xpath) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.click();
    }

    public static WebElement findElementByXpath(WebDriver driver, String xpath) {
        return driver.findElement(By.xpath(xpath));
    }
}
