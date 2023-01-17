package com.test.openchart;

import BrowserUtils.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseOpenChart {

   public WebDriver driver;
@BeforeMethod
    public void setup(){
    driver= DriverHelper.getDriver();
    driver.get("https://demo.opencart.com/admin/");
}

@AfterMethod
    public void tearDown(){
    //driver.quit();
}
}
