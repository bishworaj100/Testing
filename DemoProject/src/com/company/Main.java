package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Bishworaj Poudel\\Documents\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://docs.google.com/forms/d/18N73QjSo7XDI6wbopp6XdMItS7Ix2VDdw5kGpyJS3SM/viewform?edit_requested=true");

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement nameBox = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        nameBox.sendKeys("Bimal Sharma");

        WebElement class3 = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/span/div/div[3]/label/div"));
        class3.click();

        WebElement phonenumber = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        phonenumber.sendKeys("83765272");

        WebElement schoolname = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        schoolname.sendKeys("Hello School Name");


        WebElement button = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/div[1]/div[1]/div/span/span"));
        button.click();
        //driver.quit();
    }


}
