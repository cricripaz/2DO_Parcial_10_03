package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import singleton.Session;

public class BaseTodoIst {


    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getDriver().get("https://todoist.com/es");
    }

    @AfterEach
    public void closeBrowser(){
    }
}
