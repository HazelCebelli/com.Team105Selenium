package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com");

        Thread.sleep(5000);
        WebElement ggLink=driver.findElement(By.partialLinkText("Gift"));
                ggLink.click();

                String expectedKleime="Gift Cards";
                String actualKelime=driver.getTitle();

                if(actualKelime.contains(expectedKleime)){
                    System.out.println("+");
                }else{
                    System.out.println("-");
                }


    }
}
