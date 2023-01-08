package com.test.orangehrm.pages;

import BrowserUtils.BrowserUtilss;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    WebElement userRole;

//    @FindBy(xpath = "//div[@class='oxd-select-text-input' and .='Admin']")
//    WebElement adminOptionForUserRole;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    WebElement status;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active oxd-input--error'])[1]")
    WebElement userName;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active oxd-input--error'])[2]")
    WebElement password;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active oxd-input--error'])[3]")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[.=' Save ']")
    WebElement saveButton;


    public void clickAddButton(){
        addButton.click();
    }

    public void sendEmployeeInformation(String employeeName, String userName, String password, String confirmPasword) throws InterruptedException {
        //userRole.sendKeys("Admin");
        this.employeeName.sendKeys(employeeName);
        this.userName.sendKeys(userName);
       // this.status.sendKeys(status);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(confirmPasword);
        Thread.sleep(1000);
        saveButton.click();
        Thread.sleep(1000);
    }





}
