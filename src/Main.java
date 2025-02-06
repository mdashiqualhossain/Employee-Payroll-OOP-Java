import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee Name: "+ name + " ID: "+ id + " Salary: "+ calculateSalary();
    }

}
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return getMonthlySalary();
    }
    @Override
    public String toString() {
        return "[Full-Time] " + super.toString();
    }
}

class PartTimeEmployee extends Employee {
    private double hourlySalary;
    private double hours;

    public PartTimeEmployee(String name, int id, double hours,double hourlySalary) {
        super(name, id);
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }

    @Override
    public double calculateSalary(){
        return hourlySalary * hours;
    }
    @Override
    public String toString() {
        return "[Part-Time] " + super.toString() + " | Hours: " + hours + " | Hourly Rate: " + hourlySalary;
    }
}
class PayRollEmployee {
    private ArrayList<Employee> employeeList;
    public PayRollEmployee() {
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    public void removeEmployee(int id) {
        Employee employeeRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeRemove = employee;
                break;
            }
        }
            if(employeeRemove != null) {
                employeeList.remove(employeeRemove);
            }

        }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

}


public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Management System!");
        PayRollEmployee payEM= new PayRollEmployee();
        FullTimeEmployee emp1=new FullTimeEmployee("Akash",011, 300);
        FullTimeEmployee emp2=new FullTimeEmployee("Riha",002, 450);
        payEM.addEmployee(emp1);
        payEM.addEmployee(emp2);

        PartTimeEmployee emp3=new PartTimeEmployee("Vikass",021, 24.0,17.20);
        PartTimeEmployee emp4=new PartTimeEmployee("Haiden",032, 12.30,17.50);
        payEM.addEmployee(emp3);
        payEM.addEmployee(emp4);

        payEM.displayEmployees();

        System.out.println("==========Removed Employee=========");
        payEM.removeEmployee(011);
        System.out.println("==============Remaining  Employee==========");
        payEM.displayEmployees();






    }
}