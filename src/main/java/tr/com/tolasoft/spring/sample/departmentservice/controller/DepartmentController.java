package tr.com.tolasoft.spring.sample.departmentservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.tolasoft.spring.sample.departmentservice.entity.Department;
import tr.com.tolasoft.spring.sample.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside save department of Department Controller: "+department);
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside save findDepartmentById of Department Controller: "+departmentId);
        return departmentService.findDepartmentById(departmentId);
    }
}
