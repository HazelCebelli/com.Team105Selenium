package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class yahooIQLIST {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       //yahooya gidin, newse tiklayip cikan headerlard akac tane "US" var yazdirin ve saydirin
        driver.navigate().to("https://www.yahoo.com/");

        driver.findElement(By.id("root_2")).click();
        List<WebElement> headers=driver.findElements(By.tagName("h3"));

        int count=0;
        for (WebElement head:headers){
            if(head.getText().contains("US")){
                System.out.println(head.getText().trim());
            count++;
        }}
            System.out.println(count);

        Thread.sleep(3000);
        driver.close();

    }
}
