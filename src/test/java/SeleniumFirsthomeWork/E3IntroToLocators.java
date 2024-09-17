package SeleniumFirsthomeWork;

import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3IntroToLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");
        driver.manage().window().maximize();

        WebElement fullName=driver.findElement(By.name("FullName"));
        fullName.sendKeys("Yigit NURVER");

        WebElement email=driver.findElement(By.id("yourEmail"));
        email.sendKeys("yigitusa01@gmail.com");

        WebElement clientName=driver.findElement(By.name("ClientName"));
        clientName.sendKeys("Jennifer Lawrance");

        WebElement clientId=driver.findElement(By.name("ClientId"));
        clientId.sendKeys("jennifer1548");

        WebElement clntFeedBack=driver.findElement(By.id("ClientfeedbackId"));
        clntFeedBack.sendKeys("I'm still living a couple issue but another way is this project is really creative and very make sense.I'm concented for being client and engineers working so hard");

        WebElement projectName=driver.findElement(By.name("ProjectName"));
        projectName.sendKeys("GreatSeleniumFall");


        WebElement projectDeadline=driver.findElement(By.name("ProjectTime"));
        projectDeadline.sendKeys("September 22,2024");

        WebElement currentAdres= driver.findElement(By.tagName("textarea"));
        currentAdres.sendKeys("1201 E Abingdon Dr Suite 500 , Alexandria,VA");

        WebElement permanentadress=driver.findElement(By.name("PermanentAddress"));
        permanentadress.sendKeys("1201 E Abingdon Dr Suite 500 , Alexandria,VA");


        WebElement sbmtbutton=driver.findElement(By.id("btn-submit"));
        sbmtbutton.click();
        Thread.sleep(2000);

        WebElement clckButton=driver.findElement(By.linkText("Click Here."));
        clckButton.click();
        Thread.sleep(2000);

        driver.close();



















    }

}
