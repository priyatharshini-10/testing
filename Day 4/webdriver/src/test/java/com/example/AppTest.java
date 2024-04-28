
// SELENIUM WEBDRIVER

package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest 
{
    
    @Test
    public void hello() throws Exception
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.shoppersstop.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"profileImage\"]/a/i")).click();
        Thread.sleep(3000);
        driver.close();

    }
}
