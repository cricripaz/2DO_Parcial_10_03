package pagestodoly;

import control.Button;
import org.openqa.selenium.By;

public class LeftSectionPrincipalPage {

   public Button RecycleBinButton = new Button(By.xpath("//li[@id='ItemId_-3']"));

   public Button optionRecycleButton = new Button(By.xpath("//div[@style='display: block;']//img"));

   public Button EmptyRecycleButton = new Button(By.xpath("//a[@href='#emptyRecycle']"));
}
