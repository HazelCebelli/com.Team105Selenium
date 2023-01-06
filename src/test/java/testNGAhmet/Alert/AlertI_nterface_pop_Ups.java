package testNGAhmet.Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertI_nterface_pop_Ups {
    @Test
    public void alertAccaptAndGetText(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsAlert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();
        Alert alert=driver.switchTo().alert();
        String actualMassage=alert.getText().trim();
        String expectedMessage="I am a JS Alert";
        Assert.assertEquals(actualMassage,expectedMessage);
        alert.accept();


    }

    @Test
    public void alertDismiss() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsConfirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirmButton.click();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();



    }
}
