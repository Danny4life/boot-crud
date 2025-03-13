package com.osiki.Boot_CRUD.service;

import com.osiki.Boot_CRUD.payload.request.EmployeeRequest;
import com.osiki.Boot_CRUD.payload.response.EmployeeResponse;

public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest request);
}
