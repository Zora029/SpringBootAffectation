package com.employe.affectation.demo.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Assigned {

  @EmbeddedId
  private AssignedKey id;

  @Column(name = "date", nullable = false)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime date;

  public Assigned() {
  }

  public Assigned(AssignedKey id, LocalDateTime date) {
    this.id = id;
    this.date = date;
  }

  public AssignedKey getId() {
    return id;
  }

  public void setId(AssignedKey id) {
    this.id = id;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }
}
