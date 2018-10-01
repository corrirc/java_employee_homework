package Staff;

public abstract class Employee {

    private Employee employee;
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.employee = employee;
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNiNumber(){
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public double raiseSalary() {
        return salary;
    }

    public double payBonus() {
        double payBonus = (((getSalary() * (00.1)) + getSalary()));
        return payBonus();
    }


}

