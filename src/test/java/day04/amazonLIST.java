package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class amazonLIST {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 1- https://www.amazon.com/ sayfasina gidelim
        driver.navigate().to("https://www.amazon.com/");

        //2- arama kutusunu locate edelim
        //3- “Samsung headphones” ile arama yapalim
        WebElement searcBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Thread.sleep(4000);
        searcBox.sendKeys("Samsung headphones", Keys.ENTER);

        //4- Bulunan sonuc sayisini yazdiralim




        //5- Ilk urunu tiklayalim
    driver.findElement(By.xpath("(//span[@class=‘a-size-medium a-color-base a-text-normal’])[1]")).submit();



        //6- Sayfadaki tum basliklari yazdiralim
        driver.navigate().back();
        List<WebElement> allHeaders= driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
        for(WebElement header:allHeaders){
            System.out.println(header.getText().trim());
        }





        Thread.sleep(4000);
        driver.close();

 }

}
