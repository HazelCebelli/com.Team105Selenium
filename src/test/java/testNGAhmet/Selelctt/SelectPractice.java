package testNGAhmet.Selelctt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class SelectPractice {
    @Test
    public void validateTripButton(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement oneWButton=driver.findElement(By.xpath("//input[@value='oneway']"));
        oneWButton.click();
        Assert.assertTrue(oneWButton.isDisplayed());
        Assert.assertTrue(oneWButton.isSelected());

    }

    @Test
    public void task01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement roundButton=driver.findElement(By.xpath("//input[@value='roundtrip']"));
        roundButton.click();

        WebElement passanger= driver.findElement(By.xpath("//select[@name='passCount']"));
        Select select=new Select(passanger);
        select.selectByValue("3");


        WebElement departingFrom= driver.findElement(By.xpath(" //select[@name='fromPort']"));
        Select selectDF=new Select(departingFrom);
        String actualFrom=selectDF.getFirstSelectedOption().getText().trim();
        String expectedFrom="Acapulco";
        Assert.assertEquals(actualFrom,expectedFrom);
        selectDF.selectByValue("Paris");

        WebElement month=driver.findElement(By.xpath("//select[@name='fromMonth']"));
        Select selectMonth=new Select(month);
        selectMonth.selectByValue("8");

        WebElement day=driver.findElement(By.xpath("//select[@name='fromDay']"));
        Select selectDay=new Select(day);
        selectDay.selectByValue("13");

        WebElement arriveIn=driver.findElement(By.xpath("//select[@name='toPort']"));
        Select selectArrive=new Select(arriveIn);
        selectArrive.selectByValue("New York");

        WebElement monthReturn=driver.findElement(By.xpath("//select[@name='toMonth']"));
        Select selectReturnMonth=new Select(monthReturn);
        selectReturnMonth.selectByValue("9");

        WebElement dayReturn=driver.findElement(By.xpath("//select[@name='toDay']"));
        Select selectreturnDay=new Select(dayReturn);
        selectreturnDay.selectByValue("28");

       driver.findElement(By.xpath("//input[@value='First']")).click();

        WebElement airlines=driver.findElement(By.name("airline"));
        Select selectAirlines=new Select(airlines);
        List<WebElement> allOptions=selectAirlines.getOptions();




    }
}
