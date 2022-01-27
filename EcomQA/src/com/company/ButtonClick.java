package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ButtonClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Bishworaj Poudel\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        WebElement button1 = driver.findElement(By.id("button1"));
        button1.click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement closeButton = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[3]/button"));
        closeButton.click();
    }
}
