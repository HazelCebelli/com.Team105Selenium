package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class youtubeGetATTRIBUTE {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Polymoprhism
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.youtube.com/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        searchBox.sendKeys("justin biber");
        WebElement sb=driver.findElement(By.id("search-icon-legacy"));
        Thread.sleep(3000);
        sb.click();
        Thread.sleep(3000);
        List<WebElement> allSongs=driver.findElements(By.xpath("//a[@id='video-title']"));

        for (WebElement song:allSongs){
            System.out.println(song.getAttribute("title".trim()));
            if(song.getAttribute("title").equals("Justin Bieber - Ghost")){
                song.click();
            }
        }
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.close();
    }
}
