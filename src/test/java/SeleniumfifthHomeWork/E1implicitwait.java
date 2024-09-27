package SeleniumfifthHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class E1implicitwait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");

        //global implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement Clickbuttonn=driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        Clickbuttonn.click();

        WebElement clickbutton1=driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']"));
        clickbutton1.click();

        WebElement clickbutton3=driver.findElement(By.xpath("//input[@value='Option-1']"));
        clickbutton3.click();







    }
}
