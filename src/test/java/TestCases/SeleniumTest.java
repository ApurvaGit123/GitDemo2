package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {


    }
    public static void login() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhavi\\IdeaProjects\\SeleniumPractice\\Executables\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//elemnt")).click();
        driver.manage().Timeouts().Implicitwait(5,TimeUnits.sec);
        driver.close();

    }
}

