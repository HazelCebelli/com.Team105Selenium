package testNGAhmet.IFramePractice;

import BrowserUtils.BrowserUtilss;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

        // get back to parent frame
        driver.switchTo().parentFrame();
        WebElement header=driver.findElement(By.tagName("h3"));
        System.out.println(header.getText().trim());
    }

    @Test
    public void iFrameTest2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://skpatro.github.io/demo/iframes/");
        String mainId=driver.getWindowHandle();
        driver.findElement(By.linkText("Pavilion")).click();

        BrowserUtilss.switchByID(driver,mainId);
        Actions actions=new Actions(driver);
        WebElement seleniumButton=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[@class='menu-item-text']/span[.='Selenium' and @class='menu-text']"));
        actions.moveToElement(seleniumButton).perform();




    }


}

