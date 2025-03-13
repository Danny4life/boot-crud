package com.osiki.Boot_CRUD.controller;

import com.osiki.Boot_CRUD.payload.request.DepartmentRequest;
import com.osiki.Boot_CRUD.payload.response.DepartmentResponse;
import com.osiki.Boot_CRUD.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

//    @PostMapping("/create")
//    public ResponseEntity<DepartmentResponse> createDepartment(@RequestBody DepartmentRequest request){
//
//        return ResponseEntity.ok(departmentService.createDepartment(request));
//
//    }

    @PostMapping("/join/{id}")
    public ResponseEntity<String> joinDepartment(@PathVariable("id") Long id,
                                                 @RequestBody DepartmentRequest request){


        return ResponseEntity.ok(departmentService.joinDept(id, request));

    }
}
