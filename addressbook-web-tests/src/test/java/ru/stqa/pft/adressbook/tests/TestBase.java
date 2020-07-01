package ru.stqa.pft.adressbook.tests;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.adressbook.appmanager.ApplicationManager;

import java.util.Map;

public class TestBase {


  protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);
  JavascriptExecutor js;
  private WebDriver driver;
  private Map<String, Object> vars;

  @BeforeSuite
  public void setUp() {
    app.init();
  }

  @AfterSuite
  public void tearDown() {
    app.stop();
  }


  public ApplicationManager getApp() {
    return app;
  }
}
