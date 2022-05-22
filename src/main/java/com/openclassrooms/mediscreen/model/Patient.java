package com.openclassrooms.mediscreen.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.openclassrooms.mediscreen.data.dto.PatientDto;

@Entity
@Table(name = "Patient")
public class Patient {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String family;
  private String given;
  private Date dateOfBirth;
  private Gender gender;
  private String address;
  private String phone;

  public Patient() {}

  public Patient(String family, String given, Date dateOfBirth, Gender gender, String address, String phone) {
    this.family = family;
    this.given = given;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.address = address;
    this.phone = phone;
  }

  public Patient(PatientDto patient) {
    this.family = patient.getFamily();
    this.given = patient.getGiven();
    this.dateOfBirth = patient.getDob();
    this.gender = Gender.fromAbbreviation(patient.getSex());
    this.address = patient.getAddress();
    this.phone = patient.getPhone();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public String getGiven() {
    return given;
  }

  public void setGiven(String given) {
    this.given = given;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, dateOfBirth, family, gender, given, id, phone);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Patient other = (Patient) obj;
    return Objects.equals(address, other.address) && Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(family, other.family) && gender == other.gender
        && Objects.equals(given, other.given) && id == other.id && Objects.equals(phone, other.phone);
  }

  @Override
  public String toString() {
    return "Patient [id=" + id + ", family=" + family + ", given=" + given + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", address=" + address + ", phone=" + phone + "]";
  }

}