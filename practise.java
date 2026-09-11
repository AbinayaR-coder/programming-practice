package project;
import java.util.ArrayList;
import java.util.Scanner;
class Employee{
	int EmployeeID;
	String Name;
	String Designation;
	double Salary;
	String Location;
	
	Employee(int EmployeeID,String Name,String Designation,double Salary,String Location){
		this.EmployeeID = EmployeeID;
		this.Name = Name;
		this.Designation = Designation;
		this.Salary = Salary;
		this.Location = Location;
	}
	void display() {
		System.out.println("Employee details.......");
		System.out.println("Employee ID : " + EmployeeID);
		System.out.println("Employee Name : " + Name);
		System.out.println("Employee Designation : " + Designation);
		System.out.println("Employee Salary : " + Salary);
		System.out.println("Employee Location : " + Location);
	}
}
public class EmployeeManagement{
	ArrayList<Employee> employee = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	Employee emp;
	void addEmployee() {
		System.out.print("Enter Employee ID : ");
		int id = scanner.nextInt();
		System.out.print("Enter Employee Name : ");
		String name = scanner.nextLine();
		scanner.nextLine();
		System.out.print("Enter Employee Designation : ");
		String designation = scanner.nextLine();
		scanner.nextLine();
		System.out.print("Enter Employee Salary : ");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter Employee Location : ");
		String location = scanner.nextLine();
		scanner.nextLine();
		this.emp = new Employee(id,name,designation,salary,location);
		employee.add(emp);
		System.out.println("Employee details added sucessfully!");
}

	void deleteEmployee() {
		System.out.println("Enter Employee ID : ");
		int id = scanner.nextInt();
		for(int i = 0 ; i < employee.size() ; i++) {
			if(employee.get(i).EmployeeID == id) {
				employee.remove(i);
			}
			else {
				System.out.println("Employee ID not found!");
			}
			return;
		}
	}
	void editEmployee() {
		System.out.println("Enter Employee ID : ");
		int id = scanner.nextInt();
		for(int i = 0 ; i < employee.size() ; i++) {
			if(employee.get(i).EmployeeID == id) {
				System.out.println("Enter Employee Name : ");
				String name = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Enter Employee Designation : ");
				String designation = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Enter Employee Salary : ");
				double salary = scanner.nextDouble();
				System.out.println("Enter Employee Location : ");
				String location = scanner.nextLine();
				scanner.nextLine();
			}
			else {
				System.out.println("Employee ID not found!");
			}
		}
	}
	void displayEmpolyee() {
		if(employee.size() == 0) {
			System.out.println("Employee details is Empty!");
			return;
		}
		for(int i = 0 ; i < employee.size() ; i++) {
			this.emp.display();
		}
	}
	public static void main(String[] args) {
		 EmployeeManagement obj = new EmployeeManagement();
		 Scanner scanner = new Scanner(System.in);
		 int choice;
		 do {
			 System.out.println("1.Adding a new Employee");
			 System.out.println("2.Deleting an Employee");
			 System.out.println("3.Editing an Emlployee");
			 System.out.println("4.Display all Employee details");
			 System.out.println("5.Exit");
			 System.out.print("Enter your choice : ");
			 choice = scanner.nextInt();
			 switch(choice) {
			   case 1:
				 obj.addEmployee();
				 break;
			   case 2:
				 obj.deleteEmployee();
				 break;
			   case 3:
				 obj.editEmployee();
				 break;
			   case 4:
				 obj.displayEmpolyee();
				 break;
			   case 5:
				   System.out.println("Exit");
				   break;
			   default:
				   System.out.println("Invalid Choice!");
				   
		  };
		 }
	   while(choice != 5);
	  scanner.close();
	}
	}

