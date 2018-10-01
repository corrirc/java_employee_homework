package Management;

import Staff.Employee;

public class Manager extends Employee {


    private String name;
    private String niNumber;
    private String deptName;

    public Manager(String name, String niNumber, String deptName, double salary) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }


    public String getDeptName() {
        return deptName;
    }
}
