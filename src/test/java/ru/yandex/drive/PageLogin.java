package ru.yandex.drive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageLogin {
    ChromeDriver driver = LoadChromeDriver.driver;
    private WebDriverWait wait;

    private String loginUrl = "http://yandex.ru";
    private String login = "testTaskClient";
    private String password = "1zaq2xsw3cde$";


    public void OpenLogin() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get(loginUrl);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.loginButtonLoginEnter)));
        driver.findElement(By.xpath(Xpath.loginButtonLoginEnter)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.loginButtonMail)));
        driver.findElement(By.xpath(Xpath.loginButtonMail)).click();

        WebElement inputLogin = driver.findElement(By.xpath(Xpath.loginPlaceholderLogin));
        inputLogin.click();
        inputLogin.sendKeys(login);
        driver.findElement(By.xpath(Xpath.loginSubmitButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.loginPlaceholderPassword)));
        WebElement inputPassword = driver.findElement(By.xpath(Xpath.loginPlaceholderPassword));
        inputPassword.click();
        inputPassword.sendKeys(password);
        driver.findElement(By.xpath(Xpath.loginSubmitButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.headerProfileIcon)));
    }
}
