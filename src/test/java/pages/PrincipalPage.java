package pages;

import control.Button;
import control.Label;
import control.ProjectName;
import org.openqa.selenium.By;


public class PrincipalPage {


   public Button addProjectButton = new Button(By.xpath(" //button[@data-track = 'navigation|projects_quick_add']"));

   public Button projectMoreOptionsButton = new Button(By.xpath("//li[last()]//div[@class='bwinE4g8Ubo+bdRFBhZqsg==']//div[@class='_7DCqR7o3BYjme7edphDp8A==']//button[@type='button']"));

   public ProjectName projectName = new ProjectName(By.xpath("//h1[@role='header']"));


   public PrincipalPage(){}


   public void clickNameProject(String name){
      Label nameProjectLabel = new Label(By.xpath("//li[last()]//span[text()='"+name+"']"));
      nameProjectLabel.click();
   }


}
