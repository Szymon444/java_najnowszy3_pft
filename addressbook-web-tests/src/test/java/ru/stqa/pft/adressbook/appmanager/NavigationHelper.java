package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

  WebDriver driver;

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void groupPage() {
    click(By.linkText("grupy"));
  }

  public void goToHomePage() {
    click(By.linkText("strona główna"));
  }
}
