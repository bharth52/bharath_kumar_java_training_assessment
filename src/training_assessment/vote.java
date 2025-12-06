package training_assessment;
import java.util.*;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class vote {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int age = sn.nextInt();

        if (age < 18) {
            throw new InvalidAgeException("Candidate is not eligible to vote");
        }

        System.out.println("He is eligible");
    }
}
