package testNGAhmet.WindowHandle;

import BrowserUtils.BrowserUtilss;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class MultiWindows {

    private Object JavascriptExecutor;

    @Test
    public void multipleWindowspracticeGUZELLL() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.open('https://www.techtorialacademy.com/')");
        js.executeScript("window.open('https://www.techtorialacademy.com/about-us')");
        js.executeScript("window.open('https://www.techtorialacademy.com/Programs')");

        System.out.println(driver.getTitle());  //The internet... driver JS ile actigimiz icin diger sayfalari ilk sayfada kaldi

        Set<String> allIds=driver.getWindowHandles();
        for(String id:allIds){
            driver.switchTo().window(id);
            if(driver.getTitle().contains("About Us")){
                break;
            }
        }
        System.out.println(driver.getTitle());
    }
    @Test
    public void practice2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        WebElement button4=driver.findElement(By.id("newTabsBtn"));
        BrowserUtilss.scrollWithJS(driver,button4);
        button4.click();

        System.out.println(driver.getTitle()); // driver is at 1st page: Window Handles Practice - H Y R Tutorials

        Set<String> allIds=driver.getWindowHandles();
        for(String id: allIds){
            driver.switchTo().window(id);
            if(driver.getTitle().contains("Basic Controls")){
                break;
            }
        }
        System.out.println(driver.getTitle()); //2nd page: Basic Controls - H Y R Tutorials
        WebElement header=driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
        Assert.assertTrue(header.getText().trim().equals("Basic Controls"));

        for(String id: allIds){
            driver.switchTo().window(id);
            if(driver.getTitle().contains("AlertsDemo")){
                break;
            }
        }


    }

}
