package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {

      /*  1-  https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin*/



        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

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
        }

        Thread.sleep(3000);
        driver.close();





    }
}

