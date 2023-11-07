package HomeworkLection8.Exercise2;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary(double percentage) {
        double raiseAmount = (percentage / 100) * salary;
        salary += raiseAmount;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id +
               "\nName: " + getName() +
               "\nSalary per Month: " + salary +
               "\nAnnual Salary: " + getAnnualSalary();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
