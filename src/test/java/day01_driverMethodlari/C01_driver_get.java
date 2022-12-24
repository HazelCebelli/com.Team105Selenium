package day01_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_driver_get {
    public static void main(String[] args) throws InterruptedException {

        /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        Thread.sleep(5000);
        driver.close();
        System.out.println("All ok on console");









    }
}
