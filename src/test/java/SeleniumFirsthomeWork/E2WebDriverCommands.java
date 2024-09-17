package SeleniumFirsthomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.syntaxprojects.com/");
        System.out.println("The current page title is : "+driver.getTitle());
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();

    }

}
