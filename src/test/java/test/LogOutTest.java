package test;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProfileOptionPage;
import pages.TopMainPage;
import pages.TopPrincipalPage;

public class LogOutTest  extends BaseTodoIst{

    TopMainPage topMainPage = new TopMainPage();
    LoginPage loginPage = new LoginPage();
    TopPrincipalPage topPrincipalPage = new TopPrincipalPage();
    ProfileOptionPage profileOptionPage = new ProfileOptionPage();



    @Test
    public void LogOut () throws InterruptedException {
        topMainPage.loginButton.click();
        loginPage.emailTextBox.setText("cricripaz6@gmail.com");
        loginPage.pwdTextBox.setText("cristiank1k2");
        loginPage.loginButton.click();



        topPrincipalPage.profileButton.click();

        Thread.sleep(1000);

        profileOptionPage.logOutButton.click();





    }


}
