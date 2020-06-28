package ru.stqa.pft.adressbook.model;

import java.util.Objects;

public class ContactData {
  private int id;
  private final String name;
  private final String secondName;
  private final String lastName;
  private final String nickName;
  private final String company;
  private final String adress;
  private final String mobile;
  private final String mail;
  private final String notes;
  private final String group;

  public ContactData(int id, String name, String secondName, String lastName, String nickName, String company, String adress, String mobile, String mail, String notes, String group) {
    this.id = id;
    this.name = name;
    this.secondName = secondName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.company = company;
    this.adress = adress;
    this.mobile = mobile;
    this.mail = mail;
    this.notes = notes;
    this.group = group;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ContactData(String name, String secondName, String lastName, String nickName, String company, String adress, String mobile, String mail, String notes, String group) {
    this.id = 0;
    this.name = name;
    this.secondName = secondName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.company = company;
    this.adress = adress;
    this.mobile = mobile;
    this.mail = mail;
    this.notes = notes;
    this.group = group;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSecondName() {
    return secondName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickName() {
    return nickName;
  }

  public String getCompany() {
    return company;
  }

  public String getAdress() {
    return adress;
  }

  public String getMobile() {
    return mobile;
  }

  public String getMail() {
    return mail;
  }

  public String getNotes() {
    return notes;
  }

  public String getGroup() {return group; }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return id == that.id &&
            Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
  }
}
