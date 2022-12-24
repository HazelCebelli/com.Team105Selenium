package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class herokuappLIST {
public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://the-internet.herokuapp.com/");

        List<WebElement> linkListesi=driver.findElements(By.tagName("li")); ////By.xPath("//li")

        int count=0;
      for (WebElement parca : linkListesi) {
          if(parca.getText().trim().length()<12){
                  System.out.println(parca.getText().trim());
                  count++;
      }   }
          System.out.println(count);






}
}
