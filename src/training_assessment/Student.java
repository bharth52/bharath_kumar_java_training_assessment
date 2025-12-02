package training_assessment;
import java.util.*;

public class Student {

    private String name;
    private int rollno;
    private float marks;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

   
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

   
    public float getMarks() {
        return marks;
    }
    public void setMarks(float f) {

        if (f < 0 || f > 100) { 
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        } else {
            this.marks = f;
        }
    }

    
    public void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("Marks   : " + marks);
    }

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter Roll No: ");
        s.setRollno(sc.nextInt());

        System.out.print("Enter Marks (0–100): ");
        s.setMarks(sc.nextFloat());

        s.display();
    }
}
