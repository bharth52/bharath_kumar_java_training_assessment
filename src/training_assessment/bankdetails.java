package training_assessment;
import java.util.*;

class BankAccount {
    int accountNo;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void addInterest() {
        balance += balance * (interestRate / 100);
    }
}

class SalaryAccount extends BankAccount {
    double monthlySalary;

    void creditSalary() {
        balance += monthlySalary;
    }
}

public class bankdetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        SavingsAccount sa = new SavingsAccount();

        System.out.print("Enter Account Number: ");
        sa.accountNo = s.nextInt();

        System.out.print("Enter Balance: ");
        sa.balance = s.nextDouble();

        System.out.print("Enter Interest Rate: ");
        sa.interestRate = s.nextDouble();

        sa.addInterest();
        System.out.println("Updated Balance after interest: " + sa.balance);

        s.close();
    }
}
