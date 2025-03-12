package com.employe.affectation.demo.repository;

import com.employe.affectation.demo.entity.Assigned;
import com.employe.affectation.demo.entity.AssignedKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "assigned", path = "assigned")
public interface AssignedRepository extends JpaRepository<Assigned, AssignedKey>{
}
