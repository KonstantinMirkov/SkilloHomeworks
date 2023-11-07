package HomeworkLection8.Exercise2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Georgi", "Ivanov", 2000.0);

        System.out.println("Employee Information:");
        System.out.println(employee);

        double annualSalary = employee.getAnnualSalary();
        System.out.println("Annual Salary: " + annualSalary);

        double newSalary = employee.raiseSalary(10);
        System.out.println("New Salary after a 10% raise: " + newSalary);
    }
}
