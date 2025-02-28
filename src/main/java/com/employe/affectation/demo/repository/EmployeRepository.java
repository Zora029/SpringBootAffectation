package com.employe.affectation.demo.repository;

import java.util.List;

import com.employe.affectation.demo.entity.Employe;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employes", path = "employes")
public interface EmployeRepository extends PagingAndSortingRepository<Employe, String>, CrudRepository<Employe, String> {

  List<Employe> findByLastNameContainingIgnoreCase(@Param("name") String name);

  List<Employe> findByJobContainingIgnoreCase(@Param("job") String job);

  List<Employe> findByFirstNameContainingIgnoreCase(@Param("name") String name);

  List<Employe> findByCodeEmpContainingIgnoreCase(@Param("codeEmp") String codeEmp);
}