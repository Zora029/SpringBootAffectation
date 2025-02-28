package com.employe.affectation.demo.repository;

import com.employe.affectation.demo.entity.Assigned;
import com.employe.affectation.demo.entity.AssignedKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "assigned", path = "assigned")
public interface AssignedRepository extends PagingAndSortingRepository<Assigned, AssignedKey>, CrudRepository<Assigned, AssignedKey> {
}
