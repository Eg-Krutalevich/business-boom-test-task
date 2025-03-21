package ru.business.ui.asserts;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import ru.business.ui.constants.BaseUri;
import ru.business.ui.tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static ru.business.ui.asserts.AssertsClass.assertEquals;
import static ru.business.ui.constants.elements.locators.BaseLocators.PLACEHOLDER_LOCATOR_PATTERN;
import static ru.business.ui.constants.elements.locators.RegisterFormLocators.*;

public class RegisterAsserts extends TestBase {

    @Step("Проверяем перенаправление на страницу аккаунта пользователя")
    protected void assertOpenDashBoard() {
        System.out.println("Проверяем перенаправление на страницу аккаунта пользователя");
        webdriver().shouldHave(url(BaseUri.BASE_URI + "/account/dashboard"));
    }

    @Step("Проверяем наличие текста о некорректном пароле")
    protected void assertIncorrectPassword() {
        System.out.println("Проверяем наличие текста 'Пароль должен содержать минимум 15 символов, включая заглавную букву, цифру и специальный символ.'");
        assertEquals(getTextWithoutAllure(INCORRECT_PASSWORD_TEXT), "Пароль должен содержать минимум 15 символов, включая заглавную букву, цифру и специальный символ.",
                "Проверяем наличие текста 'Пароль должен содержать минимум 15 символов, включая заглавную букву, цифру и специальный символ.'");
    }

    @Step("Проверяем наличие текста о некорректном контектном E-mail и контактном телефоне")
    protected void assertIncorrectEmailAndPhone() {
        System.out.println("Проверяем наличие текста 'Введите корректный email адрес' и" +
                " 'Пожалуйста, введите ваш контактный телефон в формате: 7XXXXXXXXXX или 8XXXXXXXXXX'");
        assertSoftly(softAssertions -> {
            assertEquals(getTextWithoutAllure(INCORRECT_CONTACT_EMAIL_TEXT), "Введите корректный email адрес",
                    "Проверяем наличие текста 'Введите корректный email адрес'");
            assertEquals(getTextWithoutAllure(INCORRECT_CONTACT_PHONE_TEXT), "Пожалуйста, введите ваш контактный телефон в формате: 7XXXXXXXXXX или 8XXXXXXXXXX",
                    "Проверяем наличие текста " +
                            "'Пожалуйста, введите ваш контактный телефон в формате: 7XXXXXXXXXX или 8XXXXXXXXXX'");
        });
    }

    @Step("Проверяем наличие обязательных полей")
    protected void assertRequiredFieldsPartOne() {
        System.out.println("Проверяем наличие обязательных полей");
        assertSoftly(softAssertions -> {
            $x(String.format(PLACEHOLDER_LOCATOR_PATTERN, "Фамилия Имя Отчество")).should(exist);
            $x(String.format(PLACEHOLDER_LOCATOR_PATTERN, "Введите должность")).should(exist);
            $x(String.format(PLACEHOLDER_LOCATOR_PATTERN, "Введите контактный e-mail")).should(exist);
            $x(String.format(PLACEHOLDER_LOCATOR_PATTERN, "Введите контактный телефон")).should(exist);
            $x(String.format(PLACEHOLDER_LOCATOR_PATTERN, "Введите юридический адрес")).should(exist);
            $x(String.format(PLACEHOLDER_LOCATOR_PATTERN, "Введите фактический адрес")).should(exist);
            $x(String.format(PLACEHOLDER_LOCATOR_PATTERN, "Введите почтовый адрес")).should(exist);
        });
    }

    @Step("Проверяем наличие обязательных полей")
    protected void assertRequiredFieldsPartTwo() {
        System.out.println("Проверяем наличие обязательных полей");
        assertSoftly(softAssertions -> {
            $x(String.format(PLACEHOLDER_LOCATOR_PATTERN, "Введите ОГРН")).should(exist);
            $x(String.format(PLACEHOLDER_LOCATOR_PATTERN, "Введите КПП")).should(exist);
            $x(String.format(PLACEHOLDER_LOCATOR_PATTERN, "Введите ИНН")).should(exist);
        });
    }

    @Step("Проверяем появление alert")
    protected void assertAlertWindows() {
        System.out.println("Проверяем наличие текста 'undefined' в alert");
        Alert alert = Selenide.webdriver().driver().switchTo().alert();
        String alertText = alert.getText();
        assert alertText.equals("undefined") : "Текст alert не совпадает, ожидалось 'undefined', получено '" + alertText + "'";
    }
}