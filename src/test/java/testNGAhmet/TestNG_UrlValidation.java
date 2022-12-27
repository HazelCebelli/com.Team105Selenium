package testNGAhmet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

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
    public void catalogValidation() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demo.opencart.com/admin/");
        WebElement userName=driver.findElement(By.id("input-username"));
        userName.sendKeys("demo");

        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("demo");

        WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        login.submit();

        driver.findElement(By.xpath("//button[@class='btn-close']")).click();

         WebElement catalog= driver.findElement(By.xpath("//a[.=' Catalog']"));  //a[@class='parent']
         catalog. click();


          WebElement products= driver.findElement(By.xpath("//a[.='Products']"));
          products.click();

          List<WebElement> checkBoxes=driver.findElements(By.name("selected[]"));
          for (WebElement cb:checkBoxes){
            Assert.assertTrue(cb.isDisplayed());}

         for (WebElement cb2: checkBoxes){
             cb2.click();
             Thread.sleep(500);
         }




//      boolean actualResult= pro.isDisplayed();
//      boolean expectedResult=true;
//
//      Assert.assertEquals(actualResult,expectedResult);



    }
}
