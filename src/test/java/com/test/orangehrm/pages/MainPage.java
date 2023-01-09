package com.test.orangehrm.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class MainPage {

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[@class='oxd-main-menu-item']//span[.='Admin']")
    WebElement adminButton;

    @FindBy(xpath = "//span[.='PIM']")
    WebElement pimButton;

    public void clickAdmin(){
        adminButton.click();
    }

    public void clickPimButton(){
        pimButton.click();
    }




}
