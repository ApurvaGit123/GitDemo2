package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {


    }
    public static void login() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhavi\\IdeaProjects\\SeleniumPractice\\Executables\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();

    }
}

