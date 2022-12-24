package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_byNameLIST {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("nutella");
        searchBox.submit();

        // 2nd WAY:        searchBox.sendKeys("Nutella"+ Keys.ENTER);

        List<WebElement> fiyatlarListesi = driver.findElements(By.className("a-price-whole"));
        // Webelement bir obje oldugu icin direk yazirdamayiz
        System.out.println(fiyatlarListesi);


        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat=0;
        for (WebElement each: fiyatlarListesi
        ) {

            fiyatStr= each.getText();
            fiyatInt=Integer.parseInt(fiyatStr);

            if (fiyatInt>enYuksekFiyat){
                enYuksekFiyat=fiyatInt;
            }

        }
        System.out.println("");
        System.out.println("En yuksek urun fiyati : " + enYuksekFiyat);




        /*en yuksek fıyatı bulabılmek ıcın java bılgımızı kullanmalıyız.
         1 - web elementlerden getText ıle fıyatı strıng olarak alın
        2- Strıng fiyatı kıyaslama yapabılmek için Integer'a çevirin
        3- en yuksek fıyatı bulup yazdırın*/

       /* String sayi;
        int sayi1;
        int max=0;
        for (WebElement each: fiyatlarListesi
        ) {
            sayi= each.getText();
            sayi1=Integer.parseInt(sayi);
            if (sayi1>max){
                max=sayi1;
            }
        }

        System.out.println(max);*/



            Thread.sleep(3000);
            driver.close();


        }
    }
