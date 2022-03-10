package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox emailTextBox = new TextBox(By.xpath("//input[@class = 'input input_email']"));

    public TextBox pwdTextBox = new TextBox(By.xpath("//input[@class = 'form_field_control']"));

    public Button loginButton = new Button(By.xpath("//button[@class = 'submit_btn ist_button ist_button_red sel_login']"));


}
