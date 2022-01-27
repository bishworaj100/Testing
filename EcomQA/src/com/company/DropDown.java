package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Bishworaj Poudel\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement coding = driver.findElement(By.id("dropdowm-menu-1"));
        new Select(coding).selectByIndex(2);

        WebElement option1 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/label[3]/input"));
        option1.click();

        WebElement rarioButton = driver.findElement(By.xpath("/html/body/div/div[4]/div/div/form/input[5]"));
        rarioButton.click();
    }
}
