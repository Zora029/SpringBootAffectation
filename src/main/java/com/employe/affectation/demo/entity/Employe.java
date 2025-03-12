package com.employe.affectation.demo.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employes")
public class Employe {

  @Id
  private String codeEmp;

  @Column(name = "firstName", length = 256, nullable = false)
  private String firstName;

  @Column(name = "lastName", length = 256, nullable = false)
  private String lastName;

  @Column(name = "job", length = 256, nullable = false)
  private String job;

  @OneToMany(mappedBy = "employe")
  Set<Assigned> assigned;

  public Employe() {
  }

  public Employe(String codeEmp, String firstName, String lastName, String job) {
    this.codeEmp = codeEmp;
    this.firstName = firstName;
    this.lastName = lastName;
    this.job = job;
  }

  public String getCodeEmp() {
    return codeEmp;
  }

  public void setCodeEmp(String codeEmp) {
    this.codeEmp = codeEmp;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public String toString() {
    return "Employe [codeEmp=" + codeEmp + ", firstName=" + firstName + ", lastName=" + lastName + ", job=" + job + "]";
  }
}
