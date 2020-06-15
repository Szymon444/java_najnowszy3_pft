package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
  WebDriver driver;

  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  protected void click(By locaotr) {
    driver.findElement(locaotr).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    driver.findElement(locator).sendKeys(text);
  }
}
