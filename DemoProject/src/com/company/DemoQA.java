package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class DemoQA {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Bishworaj Poudel\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement name = driver.findElement(By.id("userName"));
        name.sendKeys("Mina Sharma");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("mina@gmail.com");
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("USA");
        WebElement paddress = driver.findElement(By.id("permanentAddress"));
        paddress.sendKeys("Nepal");


        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div/button"));
        button.click();

    }
}
