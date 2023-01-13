package com.test.orangehrm;

import BrowserUtils.BrowserUtilss;
import BrowserUtils.ConfigReader;
import BrowserUtils.DriverHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
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
        driver.get(ConfigReader.readProperty("urlorangehrm"));
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        if(!result.isSuccess()){
            BrowserUtilss.getScreenShot(driver,"OrangeHrmScreenShot");
           // driver.quit();  // bu bazen sorun olabilir. Dikkatli olmak lazim
        }
    }
}
