package javabasic;

class Employee {

		int empId=1000;
		String empName="kumar";
		float empSalary = 56421.5f;
		void displayEmployeeDetails()
		{
			System.out.println("Emp ID: "+empId+"empName: "+empSalary+"salary:");
		}
}
public class EmployeeDetails{
	public static void main(String[] args)
	{
		Employee employeeDetails = new Employee();
		System.out.println(employeeDetails.empName);
	}
}
