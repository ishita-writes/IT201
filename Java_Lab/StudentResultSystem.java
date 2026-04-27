import java.util.Scanner;
interface Exam {
    void Percent_cal();
}

class Student {
    String name;
    int roll_no;
    double marks1, marks2;
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        roll_no = sc.nextInt();
        System.out.print("Enter Marks 1: ");
        marks1 = sc.nextDouble();
        System.out.print("Enter Marks 2: ");
        marks2 = sc.nextDouble();
    }

    void show() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No    : " + roll_no);
        System.out.println("Name       : " + name);
        System.out.println("Subject 1  : " + marks1);
        System.out.println("Subject 2  : " + marks2);
    }
}

class Result extends Student implements Exam {
    double per;

    @Override
    public void Percent_cal() {
        per = (marks1 + marks2) / 2.0;
    }

    void display() {
        show();
        System.out.println("Percentage : " + per + "%");
        System.out.println("-----------------------");
    }
}

public class StudentResultSystem {
    public static void main(String[] args) {
        Result studentResult = new Result();
        studentResult.getData();
        studentResult.Percent_cal();
        studentResult.display();
    }
}
