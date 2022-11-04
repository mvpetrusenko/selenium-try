package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignIn {
    WebDriver driver = new ChromeDriver();
    @Test
    public void gmailLoginShouldBeOk(){
        // Test step 1: go to gmail website
        // driver is like a variable to save chrome or other driver object
        //WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");

        // 2: Click Consent button
        WebElement consentButton = driver.findElement(By.xpath("//*[@aria-label=\"Consent\"]"));
        consentButton.click();

        // 3: Click Sign In Link
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"idcta-link\"]"));
        signInButton.click();

        // 4: Verify Sign In page is opened
        //WebElement signInPage = driver.findElement(By.xpath("//*[@id=\"signin-page\"]"));
        //Assert.assertTrue(signInPage.getText());

        // 5: Filling in a username
        // WebElement is like a type of the variable
        // usernameTextField is like a variable
        // clear() to clear if other email address was in the text field before
        WebDriverWait wait = new WebDriverWait(driver, 300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type=\"email\"]")));
        WebElement usernameTextField = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        usernameTextField.clear();
        usernameTextField.sendKeys("mariiape3330@gmail.com");

        // 6: Filling in password
        //WebElement passwordTextField = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
       // passwordTextField.clear();
        //passwordTextField.sendKeys("mariiape333$$$");


    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
