package testNGAhmet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestNG_Collections {


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
          Assert.assertEquals(cb.isDisplayed(),true);  //  Assert.assertTrue(cb.isDisplayed());
          Thread.sleep(500);
          cb.click() ;}



          /*for(int i=1; i<checkBoxes.size(); i++){
              Assert.assertEquals(checkBoxes.get(i).isDisplayed(),true);
              checkBoxes.get(i).click();
              Assert.assertEquals(checkBoxes.get(i).isSelected(),true);
          }*/
    }

    @Test
    public void ascSort() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demo.opencart.com/admin/");
        WebElement userName = driver.findElement(By.id("input-username"));
        userName.sendKeys("demo");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("demo");

        WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        login.submit();

        driver.findElement(By.xpath("//button[@class='btn-close']")).click();

        WebElement catalog = driver.findElement(By.xpath("//a[.=' Catalog']"));  //a[@class='parent']
        catalog.click();


        WebElement products = driver.findElement(By.xpath("//a[.='Products']"));
        products.click();


        List<WebElement> allBrands = driver.findElements(By.xpath("//td[@class='text-start']"));

        List<String> actualBrand=new ArrayList<>();
        List<String> expectedBrand=new ArrayList<>();
        for(int i=1; i<allBrands.size(); i++){
            actualBrand.add(allBrands.get(i).getText().toLowerCase());
            expectedBrand.add(allBrands.get(i).getText().toLowerCase());

            Collections.sort(expectedBrand);
            Assert.assertEquals(actualBrand,expectedBrand);
        }
        System.out.println(expectedBrand);
        System.out.println(actualBrand);

    }
    }
