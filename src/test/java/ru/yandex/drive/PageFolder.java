package ru.yandex.drive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PageFolder {
    ChromeDriver driver = LoadChromeDriver.driver;
    private WebDriverWait wait;

    private String checkFilename;

    public void CheckFiles(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath.folderFileList)));
        List<WebElement> fileList = driver.findElements(By.xpath(Xpath.folderFileList));
        CompareFiles(fileList);
        Logout();
    }

    private void CompareFiles(List<WebElement> fileList){
        String tempString;
        String checkFileName = driver.findElement(By.xpath(Xpath.folderFileToMove)).getText();
        for (int i =0 ; i < fileList.size(); i++) {
            tempString = fileList.get(i).getText();
            if (!tempString.equals(checkFileName)){
                DeleteFiles(fileList, i);
            }
        }
    }

    private void DeleteFiles(List<WebElement> fileList, int index){
        Actions actions = new Actions(driver);
        actions.contextClick(fileList.get(index)).perform();
        driver.findElement(By.xpath(Xpath.folderContecstDelete)).click();
    }
    private void Logout() {
        driver.findElement(By.xpath(Xpath.headerUserIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.headerExitButton)));
        driver.findElement(By.xpath(Xpath.headerExitButton)).click();
        driver.quit();
    }
}
