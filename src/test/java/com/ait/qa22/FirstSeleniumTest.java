package com.ait.qa22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
    //setUp(){}
    WebDriver driver;
    EdgeOptions options = new EdgeOptions();
    @BeforeMethod
    public void setUp(){
       // driver= new FirefoxDriver();
        //driver = new EdgeDriver(options);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver= new ChromeDriver(options);
        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
//test
    @Test
    public void openGoogleTest(){
        System.out.println("Site opened!!!");
    }
    //tearDown(){}
    @AfterMethod(enabled = false)
    public void tearDown(){
       driver.quit();
    }
}
