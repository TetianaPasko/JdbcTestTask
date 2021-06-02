package entities;

public class Employee {

    private int empNo;
    private String empFname;
    private String empLname;
    private String depNo;

    public Employee(int empNo, String empFname, String empLname, String depNo) {
        this.empNo = empNo;
        this.empFname = empFname;
        this.empLname = empLname;
        this.depNo = depNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empFname='" + empFname + '\'' +
                ", empLname='" + empLname + '\'' +
                ", depNo='" + depNo + '\'' +
                '}';
    }
}
