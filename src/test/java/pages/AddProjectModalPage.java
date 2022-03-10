package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddProjectModalPage {

       public TextBox nameProjectTextBox = new TextBox(By.xpath("//input[@class = 'form_field_control']"));
       public Button addProjectButton = new Button(By.xpath("//button[@class = 'ist_button ist_button_red']"));
}
