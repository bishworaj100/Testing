package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;


public class PracticeQa {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Bishworaj Poudel\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");

        List<String> myList = new ArrayList<>();
        myList.add("Go Home");
        myList.add("Clean room");
        myList.add("Drink Water");
        myList.add("Sleep");


        WebElement inputOption = driver.findElement(By.xpath("/html/body/div/input"));

       for(String i:  myList){
          inputOption.sendKeys(i);
          inputOption.sendKeys(Keys.ENTER);
       }


    }
}
