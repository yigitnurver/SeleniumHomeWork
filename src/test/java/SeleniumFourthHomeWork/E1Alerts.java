package SeleniumFourthHomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        WebElement alertButton=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertButton.click();
        Thread.sleep(2000);

        Alert alerts=driver.switchTo().alert();
        alerts.accept();

        WebElement alert2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(2000);
        alerts.dismiss();

        WebElement appearaction=driver.findElement(By.xpath("//p[@id='confirm-demo']"));
        String button=appearaction.getText();
        System.out.println("The status of action is: "+button);


        WebElement alert3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();

        alerts.sendKeys("Yigit");
        alerts.accept();

        WebElement EnteredName=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        String appearName=EnteredName.getText();
        System.out.println("The appeared name after entered is: "+appearName);

        if(appearName.equals("You have entered 'Yigit' !")){
            System.out.println("The appeared name is correct!");
        }else {
            System.out.println("The appeared name is unfortunately wrong");
        }









    }
}
