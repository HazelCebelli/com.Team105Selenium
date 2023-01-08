package com.test.orangehrm.tests;

import com.test.orangehrm.pages.AdminPage;
import com.test.orangehrm.pages.LoginPage;
import com.test.orangehrm.pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdminTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    public void validateURLandAddButton() throws InterruptedException {

        LoginPage loginPage=new LoginPage(driver);
        loginPage.sendInformation("Admin","admin123");

        MainPage mainPage=new MainPage(driver);
        mainPage.clickAdmin();

        AdminPage adminPage=new AdminPage(driver);
        adminPage.clickAddButton();
        adminPage.sendEmployeeInformation( "Alice Duval", "ahmet123",  "12345678", "12345678");






    }
}
