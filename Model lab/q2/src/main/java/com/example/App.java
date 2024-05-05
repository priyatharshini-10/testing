package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://www.mayoclinic.org/";
        driver.get(url);
        String checkurl=driver.getCurrentUrl();
        if(url.equals(checkurl))
        System.out.print("Maches");
        else
        System.out.print("Does not matchs");
        
    }
}
