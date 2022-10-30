package ru.yandex.drive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageCommonFolder {
    ChromeDriver driver = LoadChromeDriver.driver;
    private WebDriverWait wait;
    private String diskUrl = "https://disk.yandex.ru/client/disk";

    public void CopyFile() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get(diskUrl);

        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath(Xpath.folderFileToMove));
        actions.contextClick(elementLocator).perform();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.folderButtonCopy)));
        driver.findElement(By.xpath(Xpath.folderButtonCopy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.folderConfirmationNewFolder)));
        driver.findElement(By.xpath(Xpath.folderConfirmationNewFolder)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.folderConfirmationCopy)));
        driver.findElement(By.xpath(Xpath.folderConfirmationCopy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.folderNewFolder)));
        WebElement folder = driver.findElement(By.xpath(Xpath.folderNewFolder));
        folder.click();
        folder.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.folderFileToMove)));

    }
}
