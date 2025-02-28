package com.employe.affectation.demo.repository;

import java.util.List;
import com.employe.affectation.demo.entity.Place;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "places", path = "places")
public interface PlaceRepository extends PagingAndSortingRepository<Place, String>, CrudRepository<Place, String> {

  List<Place> findByDesignationContainingIgnoreCase(@Param("designation") String designation);

  List<Place> findByProvinceContainingIgnoreCase(@Param("province") String province);
}
