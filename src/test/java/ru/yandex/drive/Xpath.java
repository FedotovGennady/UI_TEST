package ru.yandex.drive;

public class Xpath {

    //Folder
    public static String folderFileToMove = "//span[@title='Файл для копирования.rtf']/parent::div/parent::div/parent::div";
    public static String folderButtonCopy = " //span[text()='Копировать']/parent::div";
    public static String folderConfirmationNewFolder = "//div[@title='Новая папка']";
    public static String folderConfirmationCopy = "//div[@class='confirmation-dialog__footer']/child::button/following-sibling::*";
    public static String folderNewFolder = "//div[@aria-label='Новая папка']/parent::div/parent::div";
    public static String folderFileList = "//div[@class='listing-item__title listing-item__title_overflow_clamp']";
    public static String folderContecstDelete = "//span[text()='Удалить']/parent::div";

    //LoginIn
    public static String loginButtonMail = "//span[text()='Почта']/parent::button";
    public static String loginButtonLoginEnter = "//a [@aria-label='Войти']";
    public static String loginPlaceholderLogin = "//input [@placeholder='Логин или email']";
    public static String loginPlaceholderPassword = "//input [@placeholder='Введите пароль']";
    public static String loginSubmitButton = "//button[@type='submit']";

    //Header
    public static String headerProfileIcon = "//div[@aria-label='Меню профиля']";
    public static String headerUserIcon = "//div[@class='PSHeader-User PSHeader-User_noUserName promozavr-anchor-user']";
    public static String headerExitButton = "//span[text()='Выйти']/parent::a";
}
