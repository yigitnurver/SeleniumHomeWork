package SeleniumThirdHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.List;

public class SingleMultiSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        WebElement DropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));
        Thread.sleep(2000);

        Select sel=new Select(DropDown);
        sel.selectByIndex(3);

        List<WebElement>allOptions=sel.getOptions();

        for(WebElement option:allOptions){
            System.out.println(option.getText());
        }
        System.out.println("===================");
        //single select dropdown//

        //============================================//

        //multi select dropdown//

        WebElement DD=driver.findElement(By.xpath("//select[@id='multi-select']"));

        Select sell=new Select(DD);

        boolean Multisel=sell.isMultiple();
        System.out.println("The drop down is multi select "+ Multisel);
        Thread.sleep(1500);
        sell.selectByVisibleText("New Jersey");
        Thread.sleep(1500);
        sell.selectByValue("New York");
        Thread.sleep(1500);
        sell.selectByIndex(5);


        Thread.sleep(5000);

        sell.deselectByVisibleText("New Jersey");














        }

}
