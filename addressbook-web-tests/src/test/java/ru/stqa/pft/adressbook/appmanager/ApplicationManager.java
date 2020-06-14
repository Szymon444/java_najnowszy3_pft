package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.adressbook.model.GroupData;

public class ApplicationManager {
  JavascriptExecutor js;
  private WebDriver driver;

  public void init() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    driver.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  public void login(String username, String password) {
    driver.manage().window().setSize(new Dimension(1158, 727));
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.cssSelector("input:nth-child(7)")).click();
  }

  public void stop() {
    driver.quit();
  }

  public void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  public void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(GroupData groupData) {
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation() {
    driver.findElement(By.name("new")).click();
  }

  public void gotoGroupPage() {
    driver.findElement(By.linkText("grupy")).click();
  }

  public void deleteSelectedGroup() {
    driver.findElement(By.cssSelector("input:nth-child(8)")).click();
    //driver.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
    driver.findElement(By.name("selected[]")).click();
  }
}
