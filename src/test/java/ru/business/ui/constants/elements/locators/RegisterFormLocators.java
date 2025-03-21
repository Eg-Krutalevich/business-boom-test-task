package ru.business.ui.constants.elements.locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static ru.business.ui.constants.elements.locators.BaseLocators.TEXT_LOCATOR_PATTERN;

public class RegisterFormLocators {

    public static final SelenideElement HAVE_ACCOUNT_BUTTON = $x("//a[@href=\"/login\"]");
    public static final SelenideElement EMAIL_INPUT = $("input#login");
    public static final SelenideElement CONTACT_EMAIL_INPUT = $("input#contact_email");
    public static final SelenideElement CONTACT_PHONE_INPUT = $("input#contact_phone");
    public static final SelenideElement FIO_INPUT = $("input#activity_type");
    public static final SelenideElement POSITION_INPUT = $("input#position");
    public static final SelenideElement LEGAL_ADDRESS_INPUT = $("input#legal_address");
    public static final SelenideElement ACTUAL_ADDRESS_INPUT = $("input#actual_address");
    public static final SelenideElement POSTAL_ADDRESS_INPUT = $("input#postal_address");
    public static final SelenideElement PASSWORD_INPUT = $("input#password");
    public static final SelenideElement PASSWORD_SECOND_INPUT = $("input#password-second");
    public static final SelenideElement COMPANY_NAME_INPUT = $("input#company_name");
    public static final ElementsCollection ORGANIZATION_DROP_DOWN = $$x("//div[@class=\"_formInput_3uufd_33\"]");
    public static final SelenideElement I_AM_VED = $x(String.format(TEXT_LOCATOR_PATTERN, "Я участник ВЭД"));
    public static final SelenideElement VED = $x(String.format(TEXT_LOCATOR_PATTERN, "Участник ВЭД"));
    public static final SelenideElement NEXT_BUTTON = $x(String.format(TEXT_LOCATOR_PATTERN, "Далее"));
    public static final SelenideElement INCORRECT_PASSWORD_TEXT = $x(String.format(TEXT_LOCATOR_PATTERN, "Пароль должен содержать минимум 15 символов, включая заглавную букву, цифру и специальный символ."));
    public static final SelenideElement INCORRECT_CONTACT_EMAIL_TEXT = $x(String.format(TEXT_LOCATOR_PATTERN, "Введите корректный email адрес"));
    public static final SelenideElement INCORRECT_CONTACT_PHONE_TEXT = $x(String.format(TEXT_LOCATOR_PATTERN, "Пожалуйста, введите ваш контактный телефон в формате: 7XXXXXXXXXX или 8XXXXXXXXXX"));
    public static final SelenideElement SIGN_IN_BUTTON = $x("//button[@type=\"submit\"]");
}