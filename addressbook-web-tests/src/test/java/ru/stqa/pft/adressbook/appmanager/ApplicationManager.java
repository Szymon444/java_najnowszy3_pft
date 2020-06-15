package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.adressbook.ContactData;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ApplicationManager {
  WebDriver driver;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  JavascriptExecutor js;

  public void init() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    driver.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    driver.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public void submitNewContact() {
    driver.findElement(By.cssSelector("input:nth-child(87)")).click();
  }

  public void fillNewContact(ContactData contactData) {
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys(contactData.getName());
    driver.findElement(By.name("middlename")).sendKeys(contactData.getSecondName());
    driver.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
    driver.findElement(By.name("nickname")).sendKeys(contactData.getNickName());
    driver.findElement(By.name("company")).sendKeys(contactData.getCompany());
    driver.findElement(By.name("address")).sendKeys(contactData.getAdress());
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys(contactData.getMail());
    driver.findElement(By.name("notes")).click();
    driver.findElement(By.name("notes")).sendKeys(contactData.getNotes());
  }

  public void initNewContact() {
    driver.findElement(By.linkText("nowy wpis")).click();
  }

  public void deleteSelectedContact() {
    driver.findElement(By.cssSelector(".left:nth-child(8) > input")).click();
    assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
    driver.switchTo().alert().accept();
  }

  public void selectAllContact() {
    driver.findElement(By.id("MassCB")).click();
  }

  public void goToHomePage() {
    driver.findElement(By.linkText("strona główna")).click();
  }
}
