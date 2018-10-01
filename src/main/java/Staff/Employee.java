package Staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private double salary;

    public Employee(String name, int niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getNiNumber(){
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public double raiseSalary() {
        return salary;
    }

    public double payBonus() {
        double payBonus = (((getSalary() * (0.1)) + getSalary()));
        return payBonus();
    }

}

