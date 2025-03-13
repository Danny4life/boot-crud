package com.osiki.Boot_CRUD.repository;

import com.osiki.Boot_CRUD.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
