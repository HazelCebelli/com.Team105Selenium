package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/");

        WebElement horizontalSlider=driver.findElement(By.linkText("Horizontal Slider"));
        horizontalSlider.click();

        WebElement headerOfSlider=driver.findElement(By.tagName("h3"));

        String actualHeader=headerOfSlider.getText();
        String expectedHeader="Horizontal Slider";

        if(actualHeader.equals(expectedHeader)){
            System.out.println("+");
        }else{
            System.out.println("-");
            System.out.println(actualHeader);
        }

        WebElement headerOfSliderText=driver.findElement(By.className("subheader"));
        System.out.println(headerOfSliderText.getText().trim());

        Thread.sleep(3000);
        driver.close();





    }
}
