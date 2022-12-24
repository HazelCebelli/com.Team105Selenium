package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class deneme {
    public static void main(String[] args) {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
                System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
                WebDriver driver=new ChromeDriver(); //Polymoprhism
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin
                 driver.navigate().to("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.
                List<WebElement> linkListesi=driver.findElements(By.tagName("a"));
                if(linkListesi.size()==147){
                    System.out.println("+");
                }else {
                    System.out.println("-"+ linkListesi.size());
                }

        //4- Products linkine tiklayin
                driver.findElement(By.partialLinkText(" Products")).click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOffElement=driver.findElement(By.id("sale_image"));

        if(specialOffElement.isDisplayed()){
            System.out.println("+");
        }else {
            System.out.println("-");
        }


        //6- Sayfayi kapatin
        driver.close();










    }
}
