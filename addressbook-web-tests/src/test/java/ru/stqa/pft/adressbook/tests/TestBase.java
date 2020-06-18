package ru.stqa.pft.adressbook.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import ru.stqa.pft.adressbook.appmanager.ApplicationManager;

import java.util.Map;

public class TestBase {


  protected final ApplicationManager app = new ApplicationManager(BrowserType.IE);
  JavascriptExecutor js;
  private WebDriver driver;
  private Map<String, Object> vars;

  @Before
  public void setUp() {
    app.init();
  }

  @After
  public void tearDown() {
    app.stop();
  }


  public ApplicationManager getApp() {
    return app;
  }
}
