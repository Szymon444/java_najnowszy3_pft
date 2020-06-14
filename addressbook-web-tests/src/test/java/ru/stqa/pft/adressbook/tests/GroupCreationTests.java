package ru.stqa.pft.adressbook.tests;// Generated by Selenium IDE


import org.junit.Test;
import ru.stqa.pft.adressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void groupCreationTests() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
