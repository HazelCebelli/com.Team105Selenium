package testNGAhmet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNG_UrlValidation {


    @Test
        public void urlValidation(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demo.opencart.com/admin/");
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://demo.opencart.com/admin/";
        Assert.assertEquals(actualUrl,expectedUrl);


    }

    @Test
    public void catalogValidation() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demo.opencart.com/admin/index.php?route=common/dashboard&user_token=8c959b4b56ad85f3bda8d735122fb8e9");
        driver.findElement(By.xpath("//a[.=' Catalog']")).click();
        WebElement pro= driver.findElement(By.xpath("//a[.='Products']"));
      boolean actualResult= pro.isDisplayed();
      boolean expectedResult=true;

      Assert.assertEquals(actualResult,expectedResult);



    }
}
