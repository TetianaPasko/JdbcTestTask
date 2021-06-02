import entities.Department;
import entities.Employee;
import entities.Project;
import entities.WorksOn;

import java.sql.*;

public class JdbcTask {
    static final String DB_URL = "jdbc:mysql://localhost:3306/sample?useUnicode=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";
    static final String DEPARTMENT_QUERY = "SELECT * FROM department";
    static final String EMPLOYEE_QUERY = "SELECT * FROM employee";
    static final String PROJECT_QUERY = "SELECT * FROM project";
    static final String WORKS_ON_QUERY = "SELECT * FROM works_on";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement()) {
            ResultSet departmentResultSet = stmt.executeQuery(DEPARTMENT_QUERY);
            while (departmentResultSet.next()) {
                Department department = new Department(
                  departmentResultSet.getString("dept_no"),
                  departmentResultSet.getString("dept_name"),
                  departmentResultSet.getString("location")
                );
                System.out.println(department.toString());
            }
            ResultSet employeeResultSet = stmt.executeQuery(EMPLOYEE_QUERY);
            while (employeeResultSet.next()) {
                Employee employee = new Employee(
                        employeeResultSet.getInt("emp_no"),
                        employeeResultSet.getString("emp_fname"),
                        employeeResultSet.getString("emp_lname"),
                        employeeResultSet.getString("dep_no")
                );
                System.out.println(employee.toString());
            }
            ResultSet projectResultSet = stmt.executeQuery(PROJECT_QUERY);
            while (projectResultSet.next()) {
                Project project = new Project(
                        projectResultSet.getString("project_no"),
                        projectResultSet.getString("project_name"),
                        projectResultSet.getString("budget")
                );
                System.out.println(project.toString());
            }
            ResultSet worksOnResultSet = stmt.executeQuery(WORKS_ON_QUERY);
            while (worksOnResultSet.next()) {
                WorksOn worksOn = new WorksOn(
                        worksOnResultSet.getString("emp_no"),
                        worksOnResultSet.getString("project_no"),
                        worksOnResultSet.getString("job"),
                        worksOnResultSet.getString("enter_date")
                );
                System.out.println(worksOn.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
