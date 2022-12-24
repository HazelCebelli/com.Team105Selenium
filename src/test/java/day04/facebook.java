package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //facebook sign up:
        driver.get("https://www.facebook.com/");

        String actualURL=driver.getCurrentUrl();
        String expectedUrl="https://www.facebook.com/";
        if (actualURL.equals(expectedUrl)){
            System.out.println("+");
        }else{
            System.out.println("   -   and this is the actual URL: "+actualURL);
        }

        WebElement newAccount=driver.findElement(By.xpath("//a[.='Create new account']"));
        if(newAccount.isDisplayed()){
            System.out.println("2nd +");
        }else{
            System.out.println("2nd -");
        }
        newAccount.click();

       WebElement name=driver.findElement(By.xpath("//input[@placeholder='First name']"));
       name.click();
       name.sendKeys("aleyna");






    }
}
