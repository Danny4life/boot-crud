package com.osiki.Boot_CRUD.service;

import com.osiki.Boot_CRUD.payload.request.DepartmentRequest;
import com.osiki.Boot_CRUD.payload.response.DepartmentResponse;

public interface DepartmentService {

    String joinDept(Long id, DepartmentRequest request);
}

