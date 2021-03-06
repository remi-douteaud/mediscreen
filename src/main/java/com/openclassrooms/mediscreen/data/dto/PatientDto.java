package com.openclassrooms.mediscreen.data.dto;

import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.openclassrooms.mediscreen.model.Patient;

public class PatientDto {

  @NotNull
  private String family;
  @NotNull
  private String given;
  @NotNull
  @DateTimeFormat(iso = ISO.DATE)
  private Date dob;
  @NotNull
  private String sex;
  @NotNull
  private String address;
  @NotNull
  private String phone;

  public PatientDto() {}

  public PatientDto(String family, String given, Date dob, String sex, String address, String phone) {
    this.family = family;
    this.given = given;
    this.dob = dob;
    this.sex = sex;
    this.address = address;
    this.phone = phone;
  }

  public PatientDto(Patient patient) {
    this.family = patient.getFamily();
    this.given = patient.getGiven();
    this.dob = patient.getDateOfBirth();
    this.sex = patient.getGender().getAbbreviation();
    this.address = patient.getAddress();
    this.phone = patient.getPhone();
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

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public String getSex() {
    return sex;
  }

  public void setGender(String sex) {
    this.sex = sex;
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
    return Objects.hash(address, dob, family, sex, given, phone);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    PatientDto other = (PatientDto) obj;
    return Objects.equals(address, other.address) && Objects.equals(dob, other.dob) && Objects.equals(family, other.family) && sex == other.sex
        && Objects.equals(given, other.given) && Objects.equals(phone, other.phone);
  }

}
