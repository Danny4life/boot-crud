package com.osiki.Boot_CRUD.repository;

import com.osiki.Boot_CRUD.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Long, DepartmentEntity> {
}
