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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DreamCarLIST_Collections_GUZEL {
    @Test
     public void test01() throws InterruptedException {

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
        Thread.sleep(2000);

       WebElement sortButton=driver.findElement(By.xpath("//select[@id='sort-dropdown']"));
       BrowserUtilss.selectBy(sortButton,"list_price", "value");
        Thread.sleep(2000);


        //GUZEL!!! VALIDATE ALL TITLES HAS LEXUS RX 350 has it
       List<WebElement> alltitles=driver.findElements(By.xpath("//h2[@class='title']"));  //20 titles
        Thread.sleep(2500);
       String expectedTitle="Lexus RX 350";
       for(WebElement title : alltitles){
           System.out.println(title.getText().trim());
           Assert.assertTrue(title.getText().trim().contains(expectedTitle));
       }

       //validate the prices are in ascending order

        List<WebElement> allprices=driver.findElements(By.xpath("//span[@class='primary-price']"));
        Thread.sleep(2500);
       List<Integer> actualPrice=new ArrayList<>();
       List<Integer> expectedPrice=new ArrayList<>();
       for(WebElement priceCar : allprices){
           actualPrice.add(Integer.parseInt(priceCar.getText().trim().substring(1).replace(",", "")));
           expectedPrice.add(Integer.parseInt(priceCar.getText().trim().substring(1).replace(",","")));

           Collections.sort(expectedPrice);
           Assert.assertEquals(actualPrice,expectedPrice);

       }









    }
}
