package SeleniumThirdHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithOutTag {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        WebElement FruitClickBtn=driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        FruitClickBtn.click();

        List<WebElement>options=driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));

        for (WebElement OPTION:options){
            String optiontext=OPTION.getText();
            if(optiontext.equals("Mango")){
                OPTION.click();
            }
        }

        WebElement ClickButton=driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        ClickButton.click();


        List<WebElement>HobbiesOption=driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for (WebElement OptionHobbies:HobbiesOption){
            String optiontext=OptionHobbies.getText();
            if(optiontext.equals("Reading")){
                OptionHobbies.click();
            }
        }


    }
}
