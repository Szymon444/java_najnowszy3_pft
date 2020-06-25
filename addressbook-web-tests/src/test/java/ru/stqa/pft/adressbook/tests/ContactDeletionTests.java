package ru.stqa.pft.adressbook.tests;// Generated by Selenium IDE

import org.junit.Assert;
import org.junit.Test;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void contactDeletionTests() {

    app.getNavigationHelper().goToHomePage();
    int before = app.getContactHelper().getContactCount();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Bran", "Marian", "Kowalski", "Dominator", "Opel", "Kościuszki 220", "512-22-222", "jan@po.pl", "Będzie dobrze!", "test1"), true);
      app.getNavigationHelper().goToHomePage();
    }
    app.getContactHelper().selectContact(before -1);
    app.getContactHelper().deleteSelectedContact();
    app.getNavigationHelper().goToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
  }

}
