package oops;

class Employee {
	int empNo = 100;
	String empName = "bharath";

	void dispayEmployee() {
		System.out.println("empno: " + empNo + "empname" + empName);
	}
}

	class Manager extends Employee {
		float variblePay = 5233.34f;

		void displayManager() {
			System.out.println("empno: " + empNo + "empname" + empName + "employeeSalary:" + variblePay);
		}

	}

	public class inheritance {
		public static void main(String[] args) {
			Manager m1 = new Manager();
			m1.displayManager();
		}
	}


