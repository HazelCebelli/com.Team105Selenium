package com.test.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    public PimPage(WebDriver driver){
        PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//a[.='Add Employee']")
    WebElement addButton;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName;

    @FindBy(xpath = "(//div//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement employeeID;

    @FindBy(xpath = "//img[@class='employee-image']")
    WebElement image;

    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    WebElement createLoginDetails;



    public void sendPi(String firstName, String lastName, String employeeId) throws InterruptedException {
        addButton.click();
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.employeeID.sendKeys(employeeId);
        //image.sendKeys(locationPicture);
        Thread.sleep(1500);
        createLoginDetails.click();
        Thread.sleep(1500);
    }






}
