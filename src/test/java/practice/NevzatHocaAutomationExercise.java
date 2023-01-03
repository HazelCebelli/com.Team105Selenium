package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NevzatHocaAutomationExercise {

    @Test
    public void automationExerciseWebsite() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.automationexercise.com/");
        WebElement signUpButton= driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signUpButton.click();


    // https://www.automationexercise.com/ sayfasina gidelim
    // signUp linkine tiklayalim
    // name ve email adress kismina bilgiler gondererek uye olalim
    // uye olundugunu test edelim


}}
