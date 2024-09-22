package SeleniumThirdHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3WebElementCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        WebElement attributeElement=driver.findElement(By.xpath("//div[@id='textattr']"));
        String attributeVal=attributeElement.getAttribute("data-text-attr");
        System.out.println("The value of attribute is "+attributeVal);

        WebElement radiobutton1=driver.findElement(By.xpath("//input[@value='music_festival']"));
        boolean stateOfButton1=radiobutton1.isEnabled();
        System.out.println("The state of radio button is enabled "+stateOfButton1);

        WebElement radiobutton2=driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean stateOfButton2=radiobutton2.isEnabled();
        System.out.println("The state Of Tech Talk button is enabled "+stateOfButton2);
        Thread.sleep(2000);

        WebElement clikcbutton=driver.findElement(By.xpath("//button[text()='Show More Options']"));
        clikcbutton.click();
        Thread.sleep(2000);

        WebElement ClickArtExibition=driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        ClickArtExibition.click();

        WebElement textElement=driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String text=textElement.getText();
        System.out.println("The text in the web element is "+text);

        WebElement Checkbox1=driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        boolean CheckboxCheck=Checkbox1.isEnabled();
        if(CheckboxCheck){
            Checkbox1.click();
        }

        WebElement CheckBox2=driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        boolean StateOfcheckBox2=CheckBox2.isEnabled();
        System.out.println("The state of Checkbox1 is enabled "+StateOfcheckBox2);

        WebElement textbox=driver.findElement(By.xpath("//input[@id='inputField']"));
        textbox.clear();
        textbox.sendKeys("here is the custom text entered");

        driver.close();













    }
}
