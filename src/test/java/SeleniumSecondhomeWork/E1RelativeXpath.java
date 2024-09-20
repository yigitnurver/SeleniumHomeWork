package SeleniumSecondhomeWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1RelativeXpath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

        WebElement hobbies=driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("Watching NBA,Running,Swimming,Playing Basketball");

        WebElement clkbutton=driver.findElement(By.xpath("//button[@id='display_text']"));
        clkbutton.click();

        WebElement fvrtmovie=driver.findElement(By.xpath("//input[@name='favoriteMovies']"));
        fvrtmovie.sendKeys("Cast Away");

        WebElement textelement=driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum dolor sit amet')]"));
        System.out.println(textelement.getText());

        WebElement city=driver.findElement(By.xpath("//input[@name='yourCity']"));
        city.sendKeys("Fairfax");

        WebElement Pemail=driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        Pemail.sendKeys("Personal E-mail");

        WebElement Oemail=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        Oemail.sendKeys("Office E-mail");

        WebElement Profemail=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        Profemail.sendKeys("Proff E-mail");

        WebElement ClientName=driver.findElement(By.xpath("//input[@name='clientName' and @id='clientName']"));
        ClientName.sendKeys("John Smith");

        WebElement ClientId=driver.findElement(By.xpath("//input[@name='clientId' and @id='clientId']"));
        ClientId.sendKeys("Client 123");

        WebElement StreetNo=driver.findElement(By.xpath("//input[@name='StreetNo']"));
        StreetNo.sendKeys("45122");

        WebElement HouseNo=driver.findElement(By.xpath("//input[@name='HouseNo']"));
        HouseNo.sendKeys("12587");



    }
}
