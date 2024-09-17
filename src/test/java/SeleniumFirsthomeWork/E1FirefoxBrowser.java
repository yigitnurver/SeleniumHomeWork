package SeleniumFirsthomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1FirefoxBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/");
        driver.manage().window().maximize();
        System.out.println("The Current URL is: "+driver.getCurrentUrl());
        System.out.println("The page title is: "+ driver.getTitle());
        driver.quit();





    }
}
