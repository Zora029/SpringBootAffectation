package com.employe.affectation.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.employe.affectation.demo.entity.Assigned;
import com.employe.affectation.demo.entity.AssignedKey;
import com.employe.affectation.demo.repository.AssignedRepository;

@Service
public class AssignedService {

  @Autowired
  private AssignedRepository assignedRepository;

  public List<Assigned> getAllAssignments() {
    return assignedRepository.findAll();
  }

  public Optional<Assigned> getAssignmentById(AssignedKey id) {
    return assignedRepository.findById(id);
  }

  public Assigned createOrUpdateAssignment(Assigned assigned) {
    return assignedRepository.save(assigned);
  }

  public void deleteAssignment(AssignedKey id) {
    assignedRepository.deleteById(id);
  }
}
