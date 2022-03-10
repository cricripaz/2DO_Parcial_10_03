package pages;

import control.Button;
import org.openqa.selenium.By;

public class MoreOptionsProjectPage {


    public Button editProjectButton = new Button(By.xpath("//ul[@role='menu']//li[4]"));
    public Button deleteProjectButton = new Button(By.xpath("//ul[@role='menu']//li[12]"));
}
