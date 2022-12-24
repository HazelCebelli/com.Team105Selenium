package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class katalonDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
       WebElement userNAme= driver.findElement(By.xpath("//input[@id='txt-username']"));
       userNAme.sendKeys("John Doe");
        WebElement pw= driver.findElement(By.xpath("//input[@id='txt-password']"));
        pw.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.xpath("//button[@id='btn-login']")).submit();
        WebElement facility=driver.findElement(By.xpath("//select[@id='combo_facility']"));
        facility.sendKeys("Hongkong CURA Healthcare Center");













Thread.sleep(3000);
driver.close();
    }
}
