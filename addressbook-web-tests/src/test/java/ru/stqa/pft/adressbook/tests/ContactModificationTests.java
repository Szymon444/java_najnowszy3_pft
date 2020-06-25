package ru.stqa.pft.adressbook.tests;

import org.junit.Test;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void contactModificationTests() {
    app.getNavigationHelper().goToHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Bran", "Marian", "Kowalski", "Dominator", "Opel", "Kościuszki 220", "512-22-222", "jan@po.pl", "Będzie dobrze!", "test1"), true);
      app.getNavigationHelper().goToHomePage();
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillNewContact(new ContactData("Bran", "Marian", "Kowalski", "Dominator", "Opel", "Kościuszki 220", "512-22-222", "jan@po.pl", "Będzie dobrze!", null), false);
    app.getContactHelper().updateContactModification();
  }

}