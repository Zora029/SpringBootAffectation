package com.employe.affectation.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "places")
public class Place {

  @Id
  private String codePlace;

  @Column(name = "designation", length = 256, nullable = false)
  private String designation;

  @Column(name = "province", length = 256, nullable = false)
  private String province;

  public Place() {
  }

  public Place(String codePlace, String designation, String province) {
    this.codePlace = codePlace;
    this.designation = designation;
    this.province = province;
  }

  public String getCodePlace() {
    return codePlace;
  }

  public void setCodePlace(String codePlace) {
    this.codePlace = codePlace;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  @Override
  public String toString() {
    return "Place [codePlace=" + codePlace + ", designation=" + designation + ", province=" + province + "]";
  }
}
