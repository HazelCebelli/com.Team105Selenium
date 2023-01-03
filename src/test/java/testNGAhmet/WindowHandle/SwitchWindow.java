package testNGAhmet.WindowHandle;

import BrowserUtils.BrowserUtilss;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindow {
    @Test
    public void swithWindow(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickHereButton=driver.findElement(By.partialLinkText("Click Here"));
        clickHereButton.click();
        String mainID=driver.getWindowHandle();  //returns SET
        Set<String> allPagesId=driver.getWindowHandles();   //returns ID's .It is also Set
        String secondpageId="";
        for(String id:allPagesId){
            if(!id.equals(mainID)){
                secondpageId=id;
            }
        }
        driver.switchTo().window(secondpageId);
        WebElement headerOfNewPAge=driver.findElement(By.tagName("h3"));

        //print the text on the 2nd page.
        System.out.println(headerOfNewPAge.getText().trim());

        //we go back to main page
        driver.switchTo().window(mainID);
    }

    @Test
    public void switchWindowPractice() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String mainpageId=driver.getWindowHandle();

        WebElement  newButton= driver.findElement(By.id("newTabBtn"));
        BrowserUtilss.scrollWithJS(driver,newButton);
        newButton.click();

        Set<String> allPagesID=driver.getWindowHandles();
        String secondpageId="";
        for( String ideach: allPagesID){
            if(!ideach.equals(mainpageId)){
                secondpageId=ideach;
            }
        }
        driver.switchTo().window(secondpageId);
        WebElement alertsDemo=driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));

        Assert.assertEquals(alertsDemo.getText().trim(), "AlertsDemo");
        driver.close();

        //go back to main page with getWindowshandle method:
        driver.switchTo().window(mainpageId);

    }
}
