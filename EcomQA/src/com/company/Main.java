package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email");
        String email = sc.nextLine();
        // write your code here
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Bishworaj Poudel\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        // For Login Button
        WebElement loginButton = driver.findElement(By.className("login"));
        loginButton.click();

        // For Email Enter
        WebElement emailBox = driver.findElement(By.id("email_create"));
        emailBox.sendKeys(email);

        // For Email Confirm Button
        WebElement emailConfirmButton = driver.findElement(By.id("SubmitCreate"));
        emailConfirmButton.click();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // For Selecting Title
        WebElement title = driver.findElement(By.id("id_gender1"));
        title.click();

        // For Customer First Name
        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        firstName.sendKeys("Bishworaj");

        // For Customer Last Name
        WebElement lastName = driver.findElement(By.id("customer_lastname"));
        lastName.sendKeys("Poudel");


        // For Password
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("sSjhsjd823728732");

        // For Birth Date
        WebElement birthDay = driver.findElement(By.id("days"));
        new Select(birthDay).selectByValue("14");

        WebElement birthMonth = driver.findElement(By.id("months"));
        new Select(birthMonth).selectByValue("5");

        WebElement birthYear = driver.findElement(By.id("years"));
        new Select(birthYear).selectByValue("1992");

        // For Address
        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys("USA");

        // For City
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("MyCity");

        // For State
        WebElement state = driver.findElement(By.id("id_state"));
        new Select(state).selectByValue("5");

        //Post Code
        WebElement postCode = driver.findElement(By.id("postcode"));
        postCode.sendKeys("33700");

        WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
        mobilePhone.sendKeys("872726282822");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement submit = driver.findElement(By.id("submitAccount"));
        submit.click();
    }
}
