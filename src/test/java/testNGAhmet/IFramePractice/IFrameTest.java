package testNGAhmet.IFramePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameTest {

    @Test
    public void iFrameTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("iFrame")).click();

        //switchTo().frame();
        driver.switchTo().frame("mce_0_ifr");  // go to DOM and type//iframe and take the id

        WebElement message=driver.findElement(By.id("tinymce"));
        System.out.println(message.getText().trim());

        // get back to main frame
        driver.switchTo().parentFrame();
        WebElement header=driver.findElement(By.tagName("h3"));
        System.out.println(header.getText().trim());




    }}

