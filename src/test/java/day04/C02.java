package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
//        2- https://www.amazon.com/ adresine gidin
//        3- Browseri tam sayfa yapin
//        4- Sayfayi “refresh” yapin
//        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
//        6- Gift Cards sekmesine basin
//        7- Birthday butonuna basin
//        8- Best Seller bolumunden ilk urunu tiklayin
//        9- Gift card details’den 25 $’i secin
//        10-Urun ucretinin 25$ oldugunu test edin
//        11-Sayfayi kapatin


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().refresh();
        String actualTitle=driver.getTitle();
        String expectedTitle="Spend less";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("+");
        }else{
            System.out.println("-");
        }

        driver.findElement(By.linkText("Gift Cards")).click();

        WebElement birthday=driver.findElement(By.xpath("//a[@aria-label='Birthday']"));
        birthday.click();

/*
        WebElement AddButton=driver.findElement(By.xpath("//button [@onclick='addElement()']"));  //    //*[text()=‘Add Element’]
        AddButton.click();

        WebElement deleteButton=driver.findElement(By.xpath("//button[@class='added-manually']"));      //*[text()=‘Delete’]
        if(deleteButton.isDisplayed()){
            System.out.println("+");
        }else{
            System.out.println("-");
        }

        Thread.sleep(3000);
        deleteButton.click();

        WebElement arElemet= driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        if(arElemet.isDisplayed()){
            System.out.println("+");
        }else{
            System.out.println("-");
        }  */

        Thread.sleep(3000);
        driver.close();






    }
}
