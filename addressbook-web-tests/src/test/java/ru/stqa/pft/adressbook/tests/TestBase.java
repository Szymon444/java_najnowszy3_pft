package ru.stqa.pft.adressbook.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.adressbook.ContactData;
import ru.stqa.pft.adressbook.appmanager.ApplicationManager;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();
  JavascriptExecutor js;
  private WebDriver driver;
  private Map<String, Object> vars;

  @Before
  public void setUp1() {
    app.init();
  }

  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  private void login(String user, String password) {
    driver.manage().window().setSize(new Dimension(1158, 729));
    driver.findElement(By.name("user")).sendKeys(user);
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.cssSelector("input:nth-child(7)")).click();
  }

  @After
  public void tearDown1() {
    app.stop();
  }

  public ApplicationManager getApp() {
    return app;
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  protected void submitNewContact() {
    driver.findElement(By.cssSelector("input:nth-child(87)")).click();
  }

  protected void fillNewContact(ContactData contactData) {
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

  protected void initNewContact() {
    driver.findElement(By.linkText("nowy wpis")).click();
  }

  protected void deleteSelectedContact() {
    driver.findElement(By.cssSelector(".left:nth-child(8) > input")).click();
    assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
    driver.switchTo().alert().accept();
  }

  protected void selectAllContact() {
    driver.findElement(By.id("MassCB")).click();
  }

  protected void goToHomePage() {
    driver.findElement(By.linkText("strona główna")).click();
  }
}
