package com.ait.qa22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    //setUp(){}
    WebDriver driver;
    EdgeOptions options = new EdgeOptions();
    @BeforeMethod
    public void setUp(){
       // driver= new FirefoxDriver();
        driver = new EdgeDriver(options);
        driver.get("https://www.google.com");
    }
//test
    @Test
    public void openGoogleTest(){
        System.out.println("Site opened!!!");
    }

    //tearDown(){}
}
