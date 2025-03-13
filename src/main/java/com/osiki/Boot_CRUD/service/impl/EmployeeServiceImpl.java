package com.osiki.Boot_CRUD.service.impl;

import com.osiki.Boot_CRUD.entity.EmployeeEntity;
import com.osiki.Boot_CRUD.payload.request.EmployeeRequest;
import com.osiki.Boot_CRUD.payload.response.EmployeeResponse;
import com.osiki.Boot_CRUD.repository.EmployeeRepository;
import com.osiki.Boot_CRUD.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Override
    public EmployeeResponse createEmployee(EmployeeRequest request) {

        EmployeeEntity employee = EmployeeEntity.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();

        employeeRepository.save(employee);

        return EmployeeResponse.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .build();
    }
}
