package testTodoLy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import singleton.Session;

public class BaseTodoLy {

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getDriver().get("https://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
    }

}
