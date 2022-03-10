package pages;

import control.Button;
import org.openqa.selenium.By;

public class ProfileOptionPage {

    public Button logOutButton = new Button(By.xpath("//div[@class='reactist_menulist user_menu']//button[2]"));
}
