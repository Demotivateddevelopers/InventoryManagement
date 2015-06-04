package org.inventory.employe.model;

import org.inventory.employe.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRespository extends JpaRepository<Employe,Integer>{

}
