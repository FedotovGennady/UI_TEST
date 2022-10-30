package ru.yandex.drive;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoadChromeDriver {
    private String ChromeDriverPath = "src/main/resources/chromedriver";
    public static ChromeDriver driver;

    public void LoadDriver(){
        System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
        driver = new ChromeDriver();
    }
}
