package testNGAhmet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNG_UrlValidation {


    @Test
        public void urlValidation(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demo.opencart.com/admin/");
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://demo.opencar.com/admin/";
        Assert.assertEquals(actualUrl,expectedUrl);



    }
}
