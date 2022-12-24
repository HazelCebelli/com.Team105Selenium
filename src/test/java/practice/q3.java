package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class q3 {
    public static void main(String[] args) throws InterruptedException {

/* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Europa
    choose your command  -> Browser Commands
    click submit button
 */
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("selen");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("framework");
        driver.findElement(By.id("sex-1")).click();

        driver.findElement(By.xpath("//input[@id='exp-4']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("01/01/2022");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();


        Thread.sleep(500);
      //  WebElement dropdown = driver.findElement(By.id("continents"));
   driver.findElement(By.id("continents")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(500);
       // dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();

        WebElement dropdown2 = driver.findElement(By.id("selenium_commands"));
        Thread.sleep(500);
        dropdown2.findElement(By.xpath("//option[. = 'Browser Commands']")).click();





        Thread.sleep(2000);
        driver.close();
}
}
