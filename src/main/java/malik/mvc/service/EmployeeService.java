package malik.mvc.service;

import malik.mvc.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;



public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(Integer id);

    void deleteById(Integer id);


    Page<Employee> findPaginated(int pageNumber, int pageSize, String sortField, String sortDirection);
}