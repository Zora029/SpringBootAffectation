package com.employe.affectation.demo.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Assigned {

  @EmbeddedId
  private AssignedKey id;

  @ManyToOne
  @MapsId("codeEmp")
  @JoinColumn(name = "code_emp")
  private Employe employe;

  @ManyToOne
  @MapsId("codePlace")
  @JoinColumn(name = "code_place")
  private Place place;

  @Column(name = "date", nullable = false)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime date;

  public Assigned() {
  }

  public Assigned(AssignedKey id, Employe employe, Place place, LocalDateTime date) {
    this.id = id;
    this.employe = employe;
    this.place = place;
    this.date = date;
  }

  public AssignedKey getId() {
    return id;
  }

  public void setId(AssignedKey id) {
    this.id = id;
  }

  public Employe getEmploye() {
    return employe;
  }

  public void setEmploye(Employe employe) {
    this.employe = employe;
  }

  public Place getPlace() {
    return place;
  }

  public void setPlace(Place place) {
    this.place = place;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Assigned [id=" + id + ", employe=" + employe + ", place=" + place + "]";
  }
}
