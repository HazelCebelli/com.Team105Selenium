package com.test.orangehrm.tests;

import BrowserUtils.ConfigReader;
import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.LoginPage;
import com.test.orangehrm.pages.MainPage;
import com.test.orangehrm.pages.PimPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PimTest extends TestBase {

    @Parameters({"firstName","lastname", "birthdate"})
    @Test
    public void validatePi(String firstName,String lastname, String birthdate) throws InterruptedException {

        LoginPage loginPage=new LoginPage(driver);
        loginPage.sendInformation(ConfigReader.readProperty("orangehrmusername"), ConfigReader.readProperty("orangehrmpassword"));

        MainPage mainPage=new MainPage(driver);
        mainPage.clickPimButton();

        PimPage pimPage=new PimPage(driver);
        pimPage.sendPi(firstName,lastname, birthdate);
        System.out.println(".");




    }
}
