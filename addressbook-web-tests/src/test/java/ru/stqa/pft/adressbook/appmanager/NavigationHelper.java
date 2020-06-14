package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver driver) {
    super (driver);
  }

  public void gotoGroupPage() {
    click(By.linkText("grupy"));
  }
}
