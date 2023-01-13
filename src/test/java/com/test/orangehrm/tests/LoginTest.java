package com.test.orangehrm.tests;

import BrowserUtils.ConfigReader;
import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends TestBase {

    @Test
    public void validatePositiveLoginTest() {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver(); //Polymoprhism
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage loginPage=new LoginPage(driver);
        loginPage.sendInformation(ConfigReader.readProperty("orangehrmusername"),ConfigReader.readProperty("orangehrmpassword"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

    }

    @Test
    public void validateNegativeLoginTest() {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver(); //Polymoprhism
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendInformation(ConfigReader.readProperty("orangehrmusername"), "....");
        Assert.assertEquals(loginPage.errorMessage(),"Invalid credentials");
        driver.close();
    }

    @Test
    public void validateNegativeLoginTest2() {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver(); //Polymoprhism
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendInformation("", "");
//        String actualMessage=loginPage.getColorOfMessage();
//        String expectedMessage="ghfh";
//        Assert.assertEquals(actualMessage, expectedMessage);
        //driver.close();

    }

    }
