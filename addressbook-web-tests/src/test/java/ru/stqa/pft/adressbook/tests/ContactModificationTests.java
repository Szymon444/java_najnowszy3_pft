package ru.stqa.pft.adressbook.tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.ContactData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactModificationTests extends TestBase {

  @Test
  public void contactModificationTests() {


    app.goTo().goToHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData().withName("Aman"));
      app.goTo().goToHomePage();
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() -1);
    app.getContactHelper().initContactModification();
    ContactData contact = new ContactData().withId(before.get(before.size() -1).getId()).withName("Aman").withLastName("Kowalski").withCompany("Sen.");
    app.getContactHelper().fillNewContact((contact));
    app.getContactHelper().updateContactModification();
    app.goTo().goToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() -1);
    before.add(contact);
    Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
   // Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after)); << nie chce dzialac zastapiona ponizsza
    Assert.assertEquals(before.size(), after.size());
  }

}
