package tr.com.tolasoft.spring.sample.departmentservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.tolasoft.spring.sample.departmentservice.entity.Department;
import tr.com.tolasoft.spring.sample.departmentservice.repository.DepartmentRepository;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside save department method od DepartmentService" + department);
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById method od DepartmentService" + departmentId);
        return departmentRepository.findById(departmentId).get();
    }
}
