package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ExpansionTile {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Bishworaj Poudel\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);
        driver.navigate().to("https://webdriveruniversity.com/Contact-Us/contactus.html");


        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().refresh();

        WebElement item = driver.findElement(By.id("/html/body/div[1]/div/div/section/div/div[2]/form/div/input[2]"));
        item.click();



    }
}
