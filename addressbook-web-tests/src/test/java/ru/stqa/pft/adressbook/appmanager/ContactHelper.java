package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.adressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void submitNewContact() {
    driver.findElement(By.cssSelector("input:nth-child(87)")).click();
  }

  public void fillNewContact(ContactData contactData) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("middlename"), contactData.getSecondName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("nickname"), contactData.getNickName());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAdress());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("email"), contactData.getMail());
    type(By.name("notes"), contactData.getNotes());
  }

  public void initNewContact() {
    click(By.linkText("nowy wpis"));
  }

  public void deleteSelectedContact() {
    click(By.cssSelector(".left:nth-child(8) > input"));
    assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
    driver.switchTo().alert().accept();
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void initContactModification() {
    click(By.xpath(".//td/a//img[@alt='Edytuj']"));
  }

  public void updateContactModification() {

    click(By.name("update"));
  }
}
