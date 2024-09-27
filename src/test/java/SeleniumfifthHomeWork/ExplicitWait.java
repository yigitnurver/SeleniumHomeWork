package SeleniumfifthHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        WebElement clikbutton=driver.findElement(By.xpath("//button[@id='changetext_button']"));
        clikbutton.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));

        WebElement textmessage=driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(textmessage.getText());

        WebElement ClickEnableButton=driver.findElement(By.xpath("//button[@id='enable_button']"));
        ClickEnableButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

        WebElement ButtonClickEnabled=driver.findElement(By.xpath("//button[text()='Button']"));
        ButtonClickEnabled.click();



        WebElement CheckBox=driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        CheckBox.click();

        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        WebElement CheckBoxCondition=driver.findElement(By.xpath("//input[@id='checkbox']"));
        boolean StatusOfCheckbox=CheckBoxCondition.isSelected();
        boolean StatusOFcheckBoxEnabled=CheckBoxCondition.isEnabled();

        if(StatusOFcheckBoxEnabled){
            System.out.println("The status of check box selected is: "+StatusOfCheckbox);
        }
























    }
}
