package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
            //windiws kullananlarin sonuna exe olamli mac icin gerek yok

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);
        driver.close();







    }
}