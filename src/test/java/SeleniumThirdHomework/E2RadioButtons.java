package SeleniumThirdHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E2RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        List<WebElement>beverageOPT=driver.findElements(By.xpath("//input[@name='beverage']"));

        for (WebElement beverages:beverageOPT){
            if(beverages.getAttribute("value").equals("Juice")){
                beverages.click();
            }
        }

        List<WebElement>PreffWork=driver.findElements(By.xpath("//input[@name='working_enviroment']"));

        for (WebElement WorkEnvironment:PreffWork){
            if(WorkEnvironment.getAttribute("value").equals("hybrid")){
                WorkEnvironment.click();
            }
        }

        WebElement radiobuttons=driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        radiobuttons.click();
        Thread.sleep(3000);

        WebElement SpringButton=driver.findElement(By.xpath("//input[@value='spring']"));
        SpringButton.click();

        WebElement HiddenButton=driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        HiddenButton.click();
        Thread.sleep(2000);

        WebElement WinterButton=driver.findElement(By.xpath("//input[@value='winter']"));
        WinterButton.click();

        Thread.sleep(2000);


        List<WebElement>favoriteMeal=driver.findElements(By.xpath("//input[@name='meal']"));
        for (WebElement lunchbutton:favoriteMeal){
            if(lunchbutton.getAttribute("value").equals("lunch")){
                lunchbutton.click();
            }
        }

        driver.close();










    }
}
