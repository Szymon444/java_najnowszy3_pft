package ru.stqa.pft.adressbook;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ContactCreationTestsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void contactrCreationTests() {
    driver.get("http://localhost/addressbook/");
    driver.manage().window().setSize(new Dimension(1158, 729));
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    driver.findElement(By.linkText("nowy wpis")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("Jan");
    driver.findElement(By.name("middlename")).sendKeys("Marian");
    driver.findElement(By.name("lastname")).sendKeys("Kowalski");
    driver.findElement(By.name("nickname")).sendKeys("Dominator");
    driver.findElement(By.name("company")).sendKeys("Opel");
    driver.findElement(By.name("address")).sendKeys("Kościuszki 220");
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys("512-22-222");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("jan@po.pl");
    driver.findElement(By.name("notes")).click();
    driver.findElement(By.name("notes")).sendKeys("Będzie dobrze!");
    driver.findElement(By.cssSelector("input:nth-child(87)")).click();
  }
}
