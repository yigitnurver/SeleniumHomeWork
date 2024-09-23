package SeleniumThirdHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E1CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        WebElement radiobutton1=driver.findElement(By.xpath("//input[@id='newsletter']"));
        boolean stateOfRdb1=radiobutton1.isEnabled();
        if(stateOfRdb1){
            radiobutton1.click();
        }

        List<WebElement>hobbies=driver.findElements(By.xpath("//input[@class='cb-element']"));
        for (WebElement ClickHobbies:hobbies){
            if(ClickHobbies.getAttribute("id").equals("reading")){
                ClickHobbies.click();
                Thread.sleep(2000);
            }else if(ClickHobbies.getAttribute("id").equals("cooking")){
                ClickHobbies.click();
            }
        }
        WebElement ShowCheckBoxes=driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        ShowCheckBoxes.click();
        Thread.sleep(2000);

        WebElement MusicBox=driver.findElement(By.xpath("//input[@value='Music']"));
        MusicBox.click();

        WebElement ReceiveButtons=driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        boolean stateofRB1=ReceiveButtons.isEnabled();
        System.out.println("The state of Receive button enabled is "+ stateofRB1);

        Thread.sleep(2000);

        WebElement EnabledCheckBox=driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        EnabledCheckBox.click();


        Thread.sleep(2000);

        WebElement ReceiveNotButton=driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        ReceiveNotButton.click();
        Thread.sleep(2000);

        driver.close();
















    }
}
