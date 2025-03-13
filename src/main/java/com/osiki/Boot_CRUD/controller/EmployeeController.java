package com.osiki.Boot_CRUD.controller;

import com.osiki.Boot_CRUD.payload.request.EmployeeRequest;
import com.osiki.Boot_CRUD.payload.response.EmployeeResponse;
import com.osiki.Boot_CRUD.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeRequest request){


        return ResponseEntity.ok(employeeService.createEmployee(request));

    }
}
