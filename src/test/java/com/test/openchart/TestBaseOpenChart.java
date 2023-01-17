package com.test.openchart;

import BrowserUtils.BrowserUtilss;
import BrowserUtils.ConfigReader;
import BrowserUtils.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseOpenChart {

   public WebDriver driver;
@BeforeMethod
    public void setup(){
    driver= DriverHelper.getDriver();
    driver.get(ConfigReader.readProperty("urlopenchart"));
}

@AfterMethod
    public void tearDown(ITestResult result){
    if(!result.isSuccess()) {
        BrowserUtilss.getScreenShot(driver, "openchart");
    }
    //driver.quit();
}
}
