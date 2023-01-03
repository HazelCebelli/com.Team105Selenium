package testNGAhmet.WindowHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class MultiWindows {

    private Object JavascriptExecutor;

    @Test
    public void multipleWindows() {

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
}
