package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) {

//        1. http://zero.webappsecurity.com sayfasina gidin
//2. Signin buttonuna tiklayin
//3. Login alanine  “username” yazdirin
//4. Password alanine “password” yazdirin
//5. Sign in buttonuna tiklayin
//6. navigate back yapip Online Banking mneusunden Pay Bills sayfasina gidin
//7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
//8. tarih kismina “2020-09-10” yazdirin
//9. Pay buttonuna tiklayin
//10. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://zero.webappsecurity.com");

       driver.findElement(By.id("signin_button")).click();
       driver.findElement(By.id("user_login")).sendKeys("username");
       driver.findElement(By.id("user_password")).sendKeys("password");
       driver.findElement(By.className("btn btn-primary"));

       driver.navigate().back();
       driver.findElement(By.id("onlineBankingMenu")).click();
       driver.findElement(By.id("pay_bills_link")).click();
       driver.findElement(By.id("sp_amount")).sendKeys("200");
       driver.findElement(By.id("sp_date")).sendKeys("2020-09-10");
       driver.findElement(By.id("pay_saved_payees")).click();
       WebElement succesfyullyElementi=driver.findElement(By.id("alert_content"));
      if(succesfyullyElementi.isDisplayed()){
          System.out.println("+");
      }else{
          System.out.println("-");
      }
        driver.close();

    }
}
