package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static WebDriver driver;

    public static void main(String[] args) {


    }
    public static void login() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhavi\\IdeaProjects\\SeleniumPractice\\Executables\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//elemnt")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Made changes in Develop branches");

        driver.close();

    }

    public static void getWindowHandles(){
        System.out.println("Windows Handle Code");
    }
}

