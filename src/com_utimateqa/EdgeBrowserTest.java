package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //We give implicity time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //get Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("Page source:" + driver.getPageSource());

        //Find the email field element and send the email
        WebElement emailField = driver.findElement(By.name("user[email]"));
        //Type email to email field
        emailField.sendKeys("kk123@gmail.com");

// Find the password field element
        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("test123");

        //Close the browser
        driver.quit();

    }

}
