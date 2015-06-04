package org.inventory.employe.model;

import org.inventory.employe.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer>{

}
