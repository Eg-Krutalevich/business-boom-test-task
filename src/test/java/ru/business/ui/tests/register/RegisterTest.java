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
@Tags({@Tag(TestSuiteTags.POSITIVE)})
public class RegisterTest extends RegisterAsserts {

    @Test(description = "Проверить корректность валидации логина и пароля и корректность перехода после успешной регистрации")
    public void verifyValidateLoginAndPassword() {
        precondition();
        registerFormPage.clickHaveAccount()
                .inputCorrectEmail()
                .inputCorrectPassword()
                .clickOrgDropDown()
                .clickVED()
                .clickSignIn();
        redirectDashBoard();
        assertOpenDashBoard();
    }

    @Test(description = "Проверить наличие всех обязательных полей")
    public void verifyRequiredFields() {
        precondition();
        registerFormPage.inputCompanyName()
                .inputCorrectEmail()
                .inputCorrectPassword()
                .inputCorrectPasswordConfirm()
                .clickIamVED()
                .inputCorrectFIO()
                .inputCorrectPosition()
                .inputCorrectContactEmail()
                .inputCorrectContactPhone()
                .inputCorrectLegalAddress()
                .inputCorrectActualAddress()
                .inputCorrectPostalAddress();
        assertRequiredFieldsPartOne();
        registerFormPage.clickNext();
        assertRequiredFieldsPartTwo();
    }
}