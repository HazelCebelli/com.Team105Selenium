package testNGAhmet.Selelctt;

import BrowserUtils.BrowserUtilss;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DreamCar {
    @Test
     public void test01(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cars.com/");
        WebElement newUsed=driver.findElement(By.id("make-model-search-stocktype"));
        BrowserUtilss.selectBy(newUsed,"new", "value");

        WebElement make=driver.findElement(By.id("makes"));
        BrowserUtilss.selectBy(make,"lexus", "value");

        WebElement model=driver.findElement(By.id("models"));
        BrowserUtilss.selectBy(model,"lexus-rx_350h", "value");

        WebElement price=driver.findElement(By.id("make-model-max-price"));
        Select selectPrice=new Select(price);

        Assert.assertEquals(selectPrice.getFirstSelectedOption().getText().trim(),"No max price");

       driver.findElement(By.xpath("(//button[@class='sds-button'])[1]")).click();

       WebElement sortBy=driver.findElement(By.id("sort-dropdown"));
       BrowserUtilss.selectBy(sortBy,"list_price", "value");

       List<WebElement> alltitles=driver.findElements(By.xpath("//h2[@class='title']"));
       for(WebElement title : alltitles){

       }









    }
}
