package testNGAhmet.A_Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HoverOverGUZELLLLL {

        @Test
        public void hoverOver() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/hovers");
            WebElement user1=driver.findElement(By.xpath("(//h5)[1]"));
            WebElement picture1=driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));
            Actions actions=new Actions(driver);
            actions.moveToElement(picture1).perform();
            String actualText1= user1.getText().trim();
            System.out.println(actualText1);

            //For Loop ile yapmak:
            List<WebElement> allUsers=driver.findElements(By.xpath("//h5"));
            List<WebElement> allPictures=driver.findElements(By.xpath("//img[@src='/img/avatar-blank.jpg']"));

            List<String> expectedNames= Arrays.asList("name: user1","name: user2","name: user3");
            List<String> actualNames=new ArrayList<>();
            for(int i=0; i<allPictures.size(); i++){
                Thread.sleep(1000);
                actions.moveToElement(allPictures.get(i)).perform();
                Thread.sleep(1000);
                actualNames.add(allUsers.get(i).getText().trim());
                System.out.println(actualNames);
            }
            Assert.assertEquals(actualNames,expectedNames);
        }
        @Test
    public void HoverOverPractice(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demos.telerik.com/kendo-ui/fx/expand");
            WebElement cookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
            cookies.click();
            List<WebElement> names=driver.findElements(By.xpath("//div[@class='product k-listview-item']//h3"));
            List<WebElement> prices=driver.findElements(By.xpath("//div[@class='product k-listview-item']//p"));
            List<WebElement> pictures=driver.findElements(By.xpath("//div[@class='product k-listview-item']")); //30 images






        }


}
