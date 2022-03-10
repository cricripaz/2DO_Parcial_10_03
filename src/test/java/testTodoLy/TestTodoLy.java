package testTodoLy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pagestodoly.LeftSectionPrincipalPage;
import pagestodoly.LoginModal;
import pagestodoly.MainPage;
import pagestodoly.MenuSection;

public class TestTodoLy extends BaseTodoLy {


   MainPage mainPage = new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    LeftSectionPrincipalPage leftSectionPrincipalPage = new LeftSectionPrincipalPage();



    @Test
    public void DeleteRecycleBin (){

        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("2doparcial@gmail.com");
        loginModal.pwdTxtBox.setText("123456789");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");


        leftSectionPrincipalPage.RecycleBinButton.click();





    }


}
