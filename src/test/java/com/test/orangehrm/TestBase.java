package com.test.orangehrm;

import BrowserUtils.DriverHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver();
        //driver=new ChromeDriver(); //Polymoprhism
        driver= DriverHelper.getDriver(); // you centrilize your driver into one step.
        //This is Singelton Pattern Design
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();  // bu bazen sorun olabilir. Dikkatli olmak lazim
    }
}
