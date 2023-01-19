package testNGAhmet.WindowHandle;

import com.test.orangehrm.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import testNGAhmet.DataProviderClass;

public class DataProviderSentrifugoPractice {

    @Test(dataProvider = "SentrifugoLogin", dataProviderClass = DataProviderClass.class)
    public void validateSentrifugotestLogin(String user, String pass){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate() .to("http://demo.sentrifugo.com/index.php/");
        driver.manage().window().maximize();

        WebElement username= driver.findElement(By.id("username"));
        WebElement password= driver.findElement(By.id("password"));
        WebElement loginButton= driver.findElement(By.id("loginsubmit"));
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();






    }

}
