package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class CRUDTest  extends BaseTodoIst{

    TopMainPage topMainPage = new TopMainPage();
    LoginPage loginPage = new LoginPage();
    PrincipalPage principalPage = new PrincipalPage();
    AddProjectModalPage addProjectModalPage = new AddProjectModalPage();
    MoreOptionsProjectPage moreOptionsProjectPage = new MoreOptionsProjectPage();
    EditProjectModalPage editProjectModalPage = new EditProjectModalPage();
    WindowDeletePage windowDeletePage = new WindowDeletePage();



    @Test
    public void CRUD_TEST() throws InterruptedException {

        topMainPage.loginButton.click();
        loginPage.emailTextBox.setText("cricripaz6@gmail.com");
        loginPage.pwdTextBox.setText("cristiank1k2");
        loginPage.loginButton.click();


        //Create


        String projectName = "test4";
        principalPage.addProjectButton.click();
        addProjectModalPage.nameProjectTextBox.setText(projectName);
        Thread.sleep(2000);
        addProjectModalPage.addProjectButton.click();

        Thread.sleep(3000);
        Assertions.assertEquals(projectName,principalPage.projectName.getTextControl(),"ERROR");

        //Update

        String projectNameUpdate = "test4UPDATE";
        principalPage.clickNameProject(projectName);
        principalPage.projectMoreOptionsButton.click();
        moreOptionsProjectPage.editProjectButton.click();
        editProjectModalPage.nameProjectTextBox.clearSetText("");
        editProjectModalPage.nameProjectTextBox.setText(projectNameUpdate);
        editProjectModalPage.addProjectButton.click();

        Thread.sleep(3000);
        Assertions.assertEquals(projectNameUpdate,principalPage.projectName.getTextControl(),"ERROR");


        //Delete

        principalPage.clickNameProject(projectNameUpdate);
        principalPage.projectMoreOptionsButton.click();
        moreOptionsProjectPage.deleteProjectButton.click();
        windowDeletePage.deleteButton.click();
        Assertions.assertNotEquals("",projectNameUpdate,"Error");








    }
}
