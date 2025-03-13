package com.osiki.Boot_CRUD.service.impl;

import com.osiki.Boot_CRUD.entity.DepartmentEntity;
import com.osiki.Boot_CRUD.entity.EmployeeEntity;
import com.osiki.Boot_CRUD.payload.request.DepartmentRequest;
import com.osiki.Boot_CRUD.payload.response.DepartmentResponse;
import com.osiki.Boot_CRUD.repository.DepartmentRepository;
import com.osiki.Boot_CRUD.repository.EmployeeRepository;
import com.osiki.Boot_CRUD.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    private final EmployeeRepository employeeRepository;


    @Override
    public DepartmentResponse createDepartment(DepartmentRequest request) {

        DepartmentEntity department = DepartmentEntity.builder()
                .departmentName(request.getDepartmentName())
                .build();

        departmentRepository.save(department);


        return DepartmentResponse.builder()
                .id(department.getId())
                .departmentName(department.getDepartmentName())
                .build();
    }

    @Override
    public String joinDept(Long id, DepartmentRequest request) {

        EmployeeEntity employee = employeeRepository
                .findById(id).orElseThrow(()-> new IllegalArgumentException("Employee Not Found"));


        DepartmentEntity department = new DepartmentEntity();

        department.setDepartmentName(request.getDepartmentName());
        department.setEmployee(employee);

        departmentRepository.save(department);

        return "Join department successfully";
    }
}
