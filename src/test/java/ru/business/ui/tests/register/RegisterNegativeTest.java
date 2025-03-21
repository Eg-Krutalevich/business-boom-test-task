package ru.business.ui.tests.register;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.testng.Tag;
import io.qameta.allure.testng.Tags;
import org.testng.annotations.Test;
import ru.business.ui.asserts.RegisterAsserts;
import ru.business.ui.constants.changeless.TestSuiteTags;

@Epic("BUSINESS BOOM тестовое задание (UI)")
@Feature("Функциональность регистрации пользователя")
@Tags({@Tag(TestSuiteTags.NEGATIVE)})
public class RegisterNegativeTest extends RegisterAsserts {

    @Test(description = "Проверить наличие валидаторов (сложность пароля)")
    public void verifyComplexityPassword() {
        precondition();
        registerFormPage.inputCompanyName()
                .inputCorrectEmail()
                .inputIncorrectPassword()
                .inputIncorrectPasswordConfirm();
        assertIncorrectPassword();
    }

    @Test(description = "Проверить наличие валидаторов (маска телефона, формат email)")
    public void verifyHaveValidators() {
        precondition();
        registerFormPage.inputCompanyName()
                .inputCorrectEmail()
                .inputCorrectPassword()
                .inputCorrectPasswordConfirm()
                .clickIamVED()
                .inputIncorrectContactEmail()
                .inputIncorrectContactPhone();
        assertIncorrectEmailAndPhone();
    }

    @Test(description = "Проверить сообщения об ошибке при неправильном логине и сообщение в alert")
    public void verifyMessIncorrectLogin()  {
        precondition();
        registerFormPage.clickHaveAccount()
                .inputIncorrectEmail()
                .inputCorrectPassword()
                .clickOrgDropDown()
                .clickVED()
                .clickSignIn();
        assertAlertWindows();
    }

    @Test(description = "Проверить сообщения об ошибке при неправильном пароле и сообщение в alert")
    public void verifyMessIncorrectPassword()  {
        precondition();
        registerFormPage.clickHaveAccount()
                .inputCorrectEmail()
                .inputIncorrectPassword()
                .clickOrgDropDown()
                .clickVED()
                .clickSignIn();
        assertAlertWindows();
    }

    @Test(description = " Проверить сообщения об ошибке при неправильном логине и пароле и сообщение в alert")
    public void verifyMessIncorrectLoginAndPassword()  {
        precondition();
        registerFormPage.clickHaveAccount()
                .inputIncorrectEmail()
                .inputIncorrectPassword()
                .clickOrgDropDown()
                .clickVED()
                .clickSignIn();
        assertAlertWindows();
    }
}