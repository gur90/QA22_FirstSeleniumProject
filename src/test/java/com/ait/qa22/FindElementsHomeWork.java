package com.ait.qa22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementsHomeWork {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://ilcarro.web.app/let-car-work");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findByCssLocator() {
        driver.findElement(By.id("class"));
        driver.findElement(By.tagName("input"));
        driver.findElement(By.className("address-data"));
        driver.findElement(By.cssSelector("[for='make']"));
        driver.findElement(By.cssSelector("[placeholder='Enter your address']"));
        driver.findElement(By.partialLinkText("Let"));
        driver.findElement(By.cssSelector("#model"));
        driver.findElement(By.cssSelector(".part-label"));
        driver.findElement(By.cssSelector("[type='text']"));
        driver.findElement(By.name("viewport"));
    }

    @Test
    public void findByXpath() {
        driver.findElement(By.xpath("//*[@id='class']"));
        driver.findElement(By.xpath("//input[@type='text']"));
        driver.findElement(By.xpath("//*[@class='address-data']"));
        driver.findElement(By.xpath("//*[@for='make']"));
        driver.findElement(By.xpath("//*[@placeholder='Enter your address']"));
        driver.findElement(By.xpath("//*[contains(.,'Let')]"));
        driver.findElement(By.xpath("//*[@id='model']"));
        driver.findElement(By.xpath("//*[@class='part-label']"));
        driver.findElement(By.xpath("//*[@type='text']"));
        driver.findElement(By.xpath("//*[@name='viewport']"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
