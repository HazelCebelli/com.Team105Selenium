package testNGAhmet.A_Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContentClick {
    @Test
    public void contentClick(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement contextLink=driver.findElement(By.partialLinkText("Context Menu"));
        contextLink.click();
        WebElement box= driver.findElement(By.id("hot-spot"));
        Actions actions=new Actions(driver);
        actions.contextClick().perform();
    }

    @Test
    public void doubleClick2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClickButton=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions action=new Actions(driver);
        action.doubleClick().perform();
}




}


