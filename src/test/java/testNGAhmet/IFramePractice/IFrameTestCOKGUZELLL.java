package testNGAhmet.IFramePractice;

import BrowserUtils.BrowserUtilss;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameTestCOKGUZELLL {

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
    public void iFrameTest2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
/*Navigate to the website
Click Pavilion and click Selenium-Java and validate the header "Selenium-Java Tutorial-Basic to Advance"
Go back to main page and click category1 and valiudate the header "category Achchives: Selenium testing
Go back to main page and click category3 and valiudate the header "category Achchives: Software testing
and url " https://qavalidation.com/category/softwaretesting/"
close all tabs
 */
        driver.get("https://skpatro.github.io/demo/iframes/");

        //Click Pavilion and click Selenium-Java and validate the header "Selenium-Java Tutorial-Basic to Advance"
        driver.findElement(By.linkText("Pavilion")).click(); //click Pavilion

        BrowserUtilss.switchBytitle(driver,"Home - qavalidation");
        Actions actions=new Actions(driver);

        WebElement seleniumButton=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[@class='menu-item-text']/span[.='Selenium' and @class='menu-text']"));
        WebElement seleniumJavaDropDown= driver.findElement(By.xpath("//ul[@id='primary-menu']//span[.='Selenium-Java']"));
        actions.moveToElement(seleniumButton).perform();
        actions.click(seleniumJavaDropDown).perform();
        //I skip the header validation part...



        //Go back to main page and click category1 and valiudate the header "category Achchives: Selenium testing
        BrowserUtilss.switchBytitle(driver,"iframes");// my driver is pointing iframe page
        driver.switchTo().frame("Frame1");
        driver.findElement(By.linkText("Category1")).click();

        BrowserUtilss.switchBytitle(driver,"SeleniumTesting Archives - qavalidation");  //switch to window
        String actuaHeader=driver.findElement(By.xpath("//h1")).getText().trim();
        System.out.println(actuaHeader);  //gectim

        //Go back to main page and click category3 and valiudate the header "category Achchives: Software testing
        BrowserUtilss.switchBytitle(driver,"iframes");// my driver is pointing iframe page
        driver.switchTo().frame("Frame2");
        //driver.switchTo().parentFrame()   // also this one is working
        //click category3....

    }

    @Test
    public void nesetedFrame(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement message=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
        System.out.println(message.getText().trim());

        //get middle text
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        WebElement middle=driver.findElement(By.id("content"));
        System.out.println(middle.getText().trim());

        //get right text
        driver.switchTo().parentFrame(); //go back to main frame
        driver.switchTo().frame("frame-right");
        WebElement right=driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
        System.out.println(right.getText().trim());





    }







}

