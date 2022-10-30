package ru.yandex.drive;

import org.junit.Test;

public class Main {

    @Test
    public void YandexDriveCopyFile(){
        new LoadChromeDriver().LoadDriver();
        new PageLogin().OpenLogin();
        new PageCommonFolder().CopyFile();
        new PageFolder().CheckFiles();

    }
}
