package ru.stqa.pft.adressbook.tests;// Generated by Selenium IDE
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import ru.stqa.pft.adressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void contactrCreationTests() {

    app.getContactHelper().initNewContact();
    app.getContactHelper().fillNewContact(new ContactData("Bran", "Marian", "Kowalski", "Dominator", "Opel", "Kościuszki 220", "512-22-222", "jan@po.pl", "Będzie dobrze!"));
    app.getContactHelper().submitNewContact();
    app.getNavigationHelper().goToHomePage();
  }

}
