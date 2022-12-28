package testNGAhmet.Selelctt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AH_Selectt {

@Test
    public void practiceSelect(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get("https://the-internet.herokuapp.com/");
    driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

    Select select =new Select( driver.findElement(By.id("dropdown")));
    //GET OPTIONS:
    List<WebElement> allOptions=select.getOptions();

    for(WebElement option: allOptions){
        System.out.println(option.getText());
    }
    //"Please sleect an option oldugunu ilk secenegin validate ediniz

    String expected="Please select an option";
    String actual=select.getFirstSelectedOption().getText();
    Assert.assertEquals(actual,expected);




}
}
