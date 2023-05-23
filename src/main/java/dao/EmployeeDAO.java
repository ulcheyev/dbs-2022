package dao;

import entity.EmployeeEntity;

import java.util.List;

public interface EmployeeDAO {
    void addEmployee(EmployeeEntity employee);

    EmployeeEntity getEmployeeByEmployeeId(int id);

    EmployeeEntity getEmployeeByDocumentId(int id);

    List<EmployeeEntity> getAllEmployees();

    void updateEmployee(String documentId, String employeeId, String fname, String lname, String age, String email, String workplace);

    void deleteEmployee(int employeeId);

    EmployeeEntity getEmployeeByEmail(String email);
}
