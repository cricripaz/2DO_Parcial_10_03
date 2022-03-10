package testTodoLy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pagestodoly.*;

public class TestTodoLy extends BaseTodoLy {


   MainPage mainPage = new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    LeftSectionPrincipalPage leftSectionPrincipalPage = new LeftSectionPrincipalPage();
    PrincipalPage principalPage = new PrincipalPage();



    @Test
    public void DeleteRecycleBin () throws InterruptedException {

        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("2doparcial@gmail.com");
        loginModal.pwdTxtBox.setText("123456789");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");


        leftSectionPrincipalPage.RecycleBinButton.click();
        leftSectionPrincipalPage.optionRecycleButton.click();
        Thread.sleep(1000);
        leftSectionPrincipalPage.EmptyRecycleButton.click();

        System.out.println(principalPage.RecycleText.getTextControl());





    }


}
