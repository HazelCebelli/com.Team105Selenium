package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q1 {
    public static void main(String[] args) throws InterruptedException {

         System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.amazon.com/");




        Thread.sleep(5000);
        driver.close();
} }
