package com.test.openchart.tests;

import BrowserUtils.ConfigReader;
import com.test.openchart.TestBaseOpenChart;
import com.test.openchart.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBaseOpenChart {

    @Test
    public void validationOfLoginFunctionality(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginOpenChart(ConfigReader.readProperty("openchartusername"),ConfigReader.readProperty("openchartpassword"));




    }


}
