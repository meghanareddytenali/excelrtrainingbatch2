// Parent class Employee
class Employee {
    // Attributes of Employee class
    int id;
    String fullname;
    String lastname;
    String address;

    // Constructor to initialize the Employee details
    public Employee(int id, String fullname, String lastname, String address) {
        this.id = id;
        this.fullname = fullname;
        this.lastname = lastname;
        this.address = address;
    }

    // Method to display the Employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Full Name: " + fullname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Address: " + address);
    }
}

// Child class EmployeeDetails that inherits from Employee
class EmployeeDetails extends Employee {

    // Constructor that calls the constructor of the Employee class
    public EmployeeDetails(int id, String fullname, String lastname, String address) {
        super(id, fullname, lastname, address);  // Using 'super' to call the parent class constructor
    }
    
    // Additional functionality can be added here if needed
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the EmployeeDetails class
        EmployeeDetails emp = new EmployeeDetails(101, "John", "Doe", "1234 Elm St");
        
        // Displaying the details of the employee
        emp.displayDetails();
    }
}