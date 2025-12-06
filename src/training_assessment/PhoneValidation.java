package training_assessment;
import java.util.Scanner;

public class PhoneValidation {

    public static void main(String[] args) {

        String pattern = "^(001|\\+1)-[0-9]{3}-[0-9]{3}-[0-9]{4}$";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the phone number: ");
        String phone = sc.nextLine();

        if (phone.matches(pattern))
            System.out.println("Valid phone number");
        else
            System.out.println("Invalid phone number");
    }
}
