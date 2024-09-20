package SeleniumSecondhomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3Css {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userID=driver.findElement(By.cssSelector("input#UserID"));
        userID.sendKeys("emice01");

        WebElement username=driver.findElement(By.cssSelector("input#UserName"));
        username.sendKeys("User0102");

        WebElement IntroLecture=driver.findElement(By.cssSelector("input[name*='LectureIntro']"));
        IntroLecture.sendKeys("Intro Lecture");

        WebElement ray=driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        ray.sendKeys("This is very nice");

        WebElement ducky=driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        ducky.sendKeys("This is very powerfull and beautiful");

        WebElement ClientId=driver.findElement(By.cssSelector("input[name*='ClientID']"));
        ClientId.sendKeys("Jennifer1458");

        WebElement email=driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("jennifer7596@gmail.com");

        WebElement CourseTopic=driver.findElement(By.cssSelector("input[name*='CourseTopic']"));
        CourseTopic.sendKeys("Switch Statement");






    }


}
