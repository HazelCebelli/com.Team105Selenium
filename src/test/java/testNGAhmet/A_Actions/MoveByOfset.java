package testNGAhmet.A_Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveByOfset {


    @Test
    public void moveByOfsetPractice() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        WebElement slider=driver.findElement(By.xpath("//input"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(30,0).perform();
}

    @Test
    public void PointClassmoveByOfsetPractice() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("");
        WebElement slider=driver.findElement(By.xpath("//input"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(30,0).perform();
    }
}