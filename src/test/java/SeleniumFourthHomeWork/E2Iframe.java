package SeleniumFourthHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2Iframe {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");
        driver.manage().window().maximize();

        driver.switchTo().frame(1);
        driver.switchTo().frame(0);
        WebElement ageBtn= driver.findElement(By.xpath("//input[@class='cb1-element']"));
        ageBtn.click();

        driver.switchTo().defaultContent();// this code taking to the main page

        driver.switchTo().frame(1);
        WebElement CityDD=driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel=new Select(CityDD);
        sel.selectByValue("Chicago");

        driver.switchTo().defaultContent();// this code taking to main page
        driver.switchTo().frame(0);

        WebElement userName=driver.findElement(By.xpath("//input[@name='Username']"));
        userName.sendKeys("useraname14587414");










    }
}
