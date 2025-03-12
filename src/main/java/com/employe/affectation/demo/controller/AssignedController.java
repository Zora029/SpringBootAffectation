package com.employe.affectation.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.employe.affectation.demo.entity.Assigned;
import com.employe.affectation.demo.entity.AssignedKey;
import com.employe.affectation.demo.service.AssignedService;

@RestController
@RequestMapping("/assigned")
public class AssignedController {

  @Autowired
  private AssignedService assignedService;

  @GetMapping
  public List<Assigned> getAllAssignments() {
    return assignedService.getAllAssignments();
  }

  @GetMapping("/{codeEmp}/{codePlace}")
  public ResponseEntity<Assigned> getAssignmentById(@PathVariable String codeEmp, @PathVariable String codePlace) {
    AssignedKey id = new AssignedKey(codeEmp, codePlace);
    return assignedService.getAssignmentById(id)
        .map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build());
  }

  @PostMapping
  public Assigned createOrUpdateAssignment(@RequestBody Assigned assigned) {
    return assignedService.createOrUpdateAssignment(assigned);
  }

  @DeleteMapping("/{codeEmp}/{codePlace}")
  public ResponseEntity<Void> deleteAssignment(@PathVariable String codeEmp, @PathVariable String codePlace) {
    AssignedKey id = new AssignedKey(codeEmp, codePlace);
    assignedService.deleteAssignment(id);
    return ResponseEntity.noContent().build();
  }
}
