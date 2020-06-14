package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
  private WebDriver driver;

  public SessionHelper(WebDriver driver) {

    this.driver = driver;
  }

  public void login(String username, String password) {
    driver.manage().window().setSize(new Dimension(1158, 727));
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.cssSelector("input:nth-child(7)")).click();
  }

}