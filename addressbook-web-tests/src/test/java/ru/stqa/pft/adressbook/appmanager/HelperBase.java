package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {
  WebDriver driver;

  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  public void click(By locaotr) {
    driver.findElement(locaotr).click();
  }

  public void type(By locator, String text) {
    click(locator);

    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(text);
  }

  public boolean isAlertPresent () {
    try {
      driver.switchTo().alert();
      return  true;
    } catch (NoAlertPresentException e) {
      return false;
    }

  }


  protected boolean isElementPresent(By locator) {
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }


  }
}
