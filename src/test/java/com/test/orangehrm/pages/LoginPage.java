package com.test.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){  // constructor
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @FindBy(xpath="//p[.='Invalid credentials']")
        WebElement message;

    public void sendInformation(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }
    public String errorMessage(){
        return message.getText().trim();
    }

    public String getColorOfMessage(){
        return message.getCssValue("color");
    }
}
