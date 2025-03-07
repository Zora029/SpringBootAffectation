package com.employe.affectation.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AssignedKey implements Serializable {

  @Column(name = "code_emp")
  String codeEmp;

  @Column(name = "code_place")
  String codePlace;

  public AssignedKey() {
  }

  public AssignedKey(String codeEmp, String codePlace) {
    this.codeEmp = codeEmp;
    this.codePlace = codePlace;
  }

  public String getCodeEmp() {
    return codeEmp;
  }

  public String getCodePlace() {
    return codePlace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    AssignedKey that = (AssignedKey) o;

    if (!codeEmp.equals(that.codeEmp)) return false;
    return codePlace.equals(that.codePlace);
  }

  @Override
  public int hashCode() {
    int result = codeEmp.hashCode();
    result = 31 * result + codePlace.hashCode();
    return result;
  }
}
