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
}
