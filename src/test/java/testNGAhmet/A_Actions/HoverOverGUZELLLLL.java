package testNGAhmet.A_Actions;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

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
    public void HoverOverPractice() throws InterruptedException {

            //Accaept ccookies, get all the prices and names and sort them
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demos.telerik.com/kendo-ui/fx/expand");
            WebElement cookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
            cookies.click();
            List<WebElement> names=driver.findElements(By.xpath("//div[@class='product k-listview-item']//h3"));
            List<WebElement> prices=driver.findElements(By.xpath("//div[@class='product k-listview-item']//p"));
            List<WebElement> pictures=driver.findElements(By.xpath("//div[@class='product k-listview-item']")); //30 images

            List<String> namesss=new ArrayList<>();
            List<Double> pricesss=new ArrayList<>();
            Actions actions=new Actions(driver);
            for(int i=0; i<pictures.size(); i++ ){
                actions.moveToElement(pictures.get(i)).perform();
                namesss.add(names.get(i).getText().trim());
                Thread.sleep(500);
                pricesss.add(Double.parseDouble(prices.get(i).getText().trim().substring(1)));
            }
            Collections.sort(namesss);
            Collections.sort(pricesss);
            System.out.println(namesss);
            System.out.println(pricesss);



            //If we make it with map, we will do it like that
          /*  Map<String, Double> allProducts=new HashMap<>();

            for(int i=0; i<pictures.size(); i++ ){
                actions.moveToElement(pictures.get(i)).perform();
                namesss.add(names.get(i).getText().trim());
                Thread.sleep(500);
                pricesss.add(Double.parseDouble(prices.get(i).getText().trim().substring(1)));
                allProducts.put(namesss.get(i), pricesss.get(i) );
            }
            System.out.println(allProducts); */








        }


}
