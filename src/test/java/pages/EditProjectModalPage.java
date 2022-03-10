package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EditProjectModalPage {

    public TextBox nameProjectTextBox = new TextBox(By.xpath("//input[@id = 'edit_project_modal_field_name']"));
    public Button addProjectButton = new Button(By.xpath("//footer[@class='reactist_modal_box__actions']//button[2]"));

    
}
