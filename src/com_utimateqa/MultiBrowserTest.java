package com_utimateqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

        //  this three global static varial
        static String browser = "chrome";
        static String baseURL = "edghttps://courses.ultimateqa.com/users/sign_in";
        static WebDriver driver;

        public static void main(String[] args) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();

            } else {
                System.out.println("Wrong Browser Name");
            }
            driver.get(baseURL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            //Close the browser
            driver.quit();

        }

}
