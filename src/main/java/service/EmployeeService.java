package service;

import dao.BloodBankDAO;
import dao.BloodBankDAOPostgreSQL;
import dao.EmployeeDAO;
import dao.EmployeeDAOPostgreSQL;
import entity.EmployeeEntity;

import java.util.List;

public class EmployeeService {
    private final EmployeeDAO empDAO = new EmployeeDAOPostgreSQL();
    private final BloodBankDAO bbDAO = new BloodBankDAOPostgreSQL();

    public void addEmployee(String name, String lastname, String age, String documentId, String employeeId, String email, String workplace) {
        EmployeeEntity employee = new EmployeeEntity();
        employee.setDocumentid(Integer.parseInt(documentId));
        employee.setEmployeeid(Integer.parseInt(employeeId));
        employee.setFirstname(name);
        employee.setLastname(lastname);
        employee.setAge(Short.parseShort(age));
        employee.setEmail(email);
        employee.setWorkplace(bbDAO.getBloodBankByName(workplace));
        empDAO.addEmployee(employee);
    }

    public EmployeeEntity searchByEmployeeId(String id) {
        EmployeeEntity employee = empDAO.getEmployeeByEmployeeId(Integer.parseInt(id));
        return employee;
    }

    public EmployeeEntity searchByDocumentId(String id) {
        EmployeeEntity employee = empDAO.getEmployeeByDocumentId(Integer.parseInt(id));
        return employee;
    }

    public List<EmployeeEntity> getAll() {
        return empDAO.getAllEmployees();
    }

    public void deleteEmployee(int docId) {
        empDAO.deleteEmployee(docId);
    }

    public void updateEmployee(String documentId, String employeeId, String fname, String lname, String age, String email, String workplace) {
        empDAO.updateEmployee(documentId, employeeId, fname, lname, age, email, workplace);
    }

    public EmployeeEntity searchEmployeeByEmail(String email) {
        return empDAO.getEmployeeByEmail(email);
    }
}
