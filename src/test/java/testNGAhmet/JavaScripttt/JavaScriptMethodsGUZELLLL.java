package testNGAhmet.JavaScripttt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptMethodsGUZELLLL {
    @Test
    public void titleMethod(){

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techtorialacademy.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String title=js.executeScript("return document.title").toString();
        System.out.println(title +" with java scrip)");

    }

    @Test
    public void scrollIntoViewMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techtorialacademy.com/");
        WebElement applyNowButton=driver.findElement(By.xpath("//div[@class='eduaply-btn']//a"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
    //    js.executeScript("arguments[0].click",applyNowButton);

        WebElement copyRightText=driver.findElement(By.xpath("//section[@class='copyrightSec']//div//div//div//p"));
        String text=copyRightText.getText().trim();
        System.out.println(text);
        js.executeScript("arguments[0].scrollIntoView(true)",copyRightText);

}@Test
    public void practiceJSGuzelXPATHbulmaYONTEMI(){

        //click Browse Corse with JS.
        //get title with JS and validate it
        //scroll down until information of the page
        //scroll down "get Started from SDET course" and clcik with JS

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techtorialacademy.com/");
        WebElement browseCourse=driver.findElement(By.linkText("Browse Course"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",browseCourse);

        String actualTitle=js.executeScript("return document.title").toString();
        String expectedTitle="Programs - Techtorial";
        Assert.assertEquals(actualTitle, expectedTitle);


        WebElement informationButton=driver.findElement(By.xpath("//h2[.='information']"));
        js.executeScript("arguments[0].scrollIntoView(true)",informationButton);


        //ONEMLI XPATH BULMA YONTEMI!!
        WebElement getStarted=driver.findElement(By.xpath("//h4[.='SDET Course']//..//a[.='Get Started']"));
        js.executeScript("arguments[0].click()",getStarted);

    }
}
