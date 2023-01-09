package com.test.orangehrm.tests;

import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.LoginPage;
import com.test.orangehrm.pages.MainPage;
import com.test.orangehrm.pages.PimPage;
import org.testng.annotations.Test;

public class PimTest extends TestBase {

    @Test
    public void validatePi() throws InterruptedException {

        LoginPage loginPage=new LoginPage(driver);
        loginPage.sendInformation("Admin", "admin123");

        MainPage mainPage=new MainPage(driver);
        mainPage.clickPimButton();

        PimPage pimPage=new PimPage(driver);
        pimPage.sendPi("Ahmet","Ahmet3", "1991");
        System.out.println(".");




    }
}
