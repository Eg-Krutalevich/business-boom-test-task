package ru.business.ui.pages.regsiter;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.business.ui.action.ActionPage;

import static ru.business.ui.constants.elements.InputElements.*;
import static ru.business.ui.constants.elements.locators.RegisterFormLocators.*;

public class RegisterFormPage implements ActionPage {

    @Step("Нажать на кнопку 'У меня есть аккаунт'")
    public RegisterFormPage clickHaveAccount() {
        System.out.println("Нажать на кнопку 'У меня есть аккаунт'");
        click(HAVE_ACCOUNT_BUTTON);
        return this;
    }

    @Step("Ввести корректный контактный E-mail")
    public RegisterFormPage inputCorrectContactEmail() {
        System.out.println("Ввести корректный контактный E-mail");
        sendKeys(CONTACT_EMAIL_INPUT, CORRECT_EMAIL);
        return this;
    }

    @Step("Ввести некорректный контактный E-mail")
    public RegisterFormPage inputIncorrectContactEmail() {
        System.out.println("Ввести некорректный контактный E-mail");
        sendKeys(CONTACT_EMAIL_INPUT, INCORRECT_EMAIL_ADDRESS);
        return this;
    }

    @Step("Ввести корректный контактный телефон")
    public RegisterFormPage inputCorrectContactPhone() {
        System.out.println("Ввести корректный контактный телефон");
        sendKeys(CONTACT_PHONE_INPUT, CORRECT_PHONE);
        return this;
    }

    @Step("Ввести некорректный контактный телефон")
    public RegisterFormPage inputIncorrectContactPhone() {
        System.out.println("Ввести некорректный контактный телефон");
        sendKeys(CONTACT_PHONE_INPUT, INCORRECT_PHONE);
        return this;
    }

    @Step("Ввести корректное Фамилия Имя Отчество")
    public RegisterFormPage inputCorrectFIO() {
        System.out.println("Ввести корректное Фамилия Имя Отчество");
        sendKeys(FIO_INPUT, CORRECT_FIO);
        return this;
    }

    @Step("Ввести корректный юридический адрес (на русском языке)")
    public RegisterFormPage inputCorrectLegalAddress() {
        System.out.println("Ввести корректный юридический адрес (на русском языке)");
        sendKeys(LEGAL_ADDRESS_INPUT, CORRECT_LEGAL_ADDRESS);
        return this;
    }

    @Step("Ввести корректный фактический адрес (на русском языке)")
    public RegisterFormPage inputCorrectActualAddress() {
        System.out.println("Ввести корректный фактический адрес (на русском языке)");
        sendKeys(ACTUAL_ADDRESS_INPUT, CORRECT_ACTUAL_ADDRESS);
        return this;
    }

    @Step("Ввести корректный фактический почтовый адрес")
    public RegisterFormPage inputCorrectPostalAddress() {
        System.out.println("Ввести корректный почтовый адрес");
        sendKeys(POSTAL_ADDRESS_INPUT, CORRECT_POSTAL_ADDRESS);
        return this;
    }

    @Step("Ввести корректную должность")
    public RegisterFormPage inputCorrectPosition() {
        System.out.println("Ввести корректную должность");
        sendKeys(POSITION_INPUT, CORRECT_POSITION);
        return this;
    }

    @Step("Ввести некорректный адрес электронной почты")
    public RegisterFormPage inputIncorrectEmail() {
        System.out.println("Ввести неекорректный адрес электронной почты");
        sendKeys(EMAIL_INPUT, INCORRECT_EMAIL);
        return this;
    }

    @Step("Ввести корректный адрес электронной почты")
    public RegisterFormPage inputCorrectEmail() {
        System.out.println("Ввести корректный адрес электронной почты");
        sendKeys(EMAIL_INPUT, CORRECT_EMAIL);
        return this;
    }

    @Step("Ввести некорректный пароль")
    public RegisterFormPage inputIncorrectPassword() {
        System.out.println("Ввести некорректный пароль");
        sendKeys(PASSWORD_INPUT, INCORRECT_PASSWORD);
        return this;
    }

    @Step("Ввести корректный пароль")
    public RegisterFormPage inputCorrectPassword() {
        System.out.println("Ввести корректный пароль");
        sendKeys(PASSWORD_INPUT, CORRECT_PASSWORD);
        return this;
    }

    @Step("Ввести корректный пароль подтверждения")
    public RegisterFormPage inputCorrectPasswordConfirm() {
        System.out.println("Ввести корректный пароль подтверждения");
        sendKeys(PASSWORD_SECOND_INPUT, CORRECT_PASSWORD);
        return this;
    }

    @Step("Ввести некорректный пароль подтверждения")
    public RegisterFormPage inputIncorrectPasswordConfirm() {
        System.out.println("Ввести некорректный пароль подтверждения");
        sendKeys(PASSWORD_SECOND_INPUT, INCORRECT_PASSWORD);
        return this;
    }

    @Step("Нажать на стрелку drop-down меню")
    public RegisterFormPage clickOrgDropDown() {
        System.out.println("Нажать на стрелку drop-down меню");
        SelenideElement element = ORGANIZATION_DROP_DOWN.get(2);
        click(element);
        return this;
    }

    @Step("Нажать на кнопку 'Далее'")
    public RegisterFormPage clickNext() {
        System.out.println("Нажать на кнопку 'Далее'");
        click(NEXT_BUTTON);
        return this;
    }

    @Step("Выбрать Участник ВЭД")
    public RegisterFormPage clickVED() {
        System.out.println("Выбрать Участник ВЭД");
        click(VED);
        return this;
    }

    @Step("Нажать на кнопку 'Я участник ВЭД'")
    public RegisterFormPage clickIamVED() {
        System.out.println("Нажать на кнопку 'Я участник ВЭД'");
        click(I_AM_VED);
        return this;
    }

    @Step("Нажать на кнопку 'Вход'")
    public RegisterFormPage clickSignIn() {
        System.out.println("Нажать на кнопку 'Вход'");
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(SIGN_IN_BUTTON);
        return this;
    }

    @Step("Ввести имя вашей компании")
    public RegisterFormPage inputCompanyName() {
        System.out.println("Ввести имя вашей компании");
        sendKeys(COMPANY_NAME_INPUT, COMPANY_NAME);
        return this;
    }
}