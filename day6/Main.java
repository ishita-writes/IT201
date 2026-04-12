import java.util.*;     // to admit, migrate and display details of a student
interface Department {
    String DEPT_NAME = "Computer Science";
    String DEPT_HEAD = "Dr. A. Smith";
    void printDept();
}

class Hostel {
    String hName, hLoc;
    int rooms;

    void inputHostel(Scanner sc) {
        System.out.print("Hostel Name, Location, Rooms: ");
        hName = sc.next(); hLoc = sc.next(); rooms = sc.nextInt();
    }

    void showHostel() {
        System.out.print("Hostel: " + hName + " (" + hLoc + "), Rooms: " + rooms);
    }
}

class Student extends Hostel implements Department {
    String name, regNo, elective;
    double marks;

    void getData(Scanner sc) {
        inputHostel(sc);
        System.out.print("Student Name, RegNo, Elective, Avg Marks: ");
        name = sc.next(); regNo = sc.next(); elective = sc.next(); marks = sc.nextDouble();
    }

    public void printDept() {
        System.out.println(" | Dept: " + DEPT_NAME + " (Head: " + DEPT_HEAD + ")");
    }

    void printData() {
        System.out.print("Student: " + name + " [" + regNo + "] | Sub: " + elective + " | Marks: " + marks + " | ");
        showHostel();
        printDept();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int choice;

        do {
            System.out.print("\n1. Admit  2. Migrate  3. Display  4. Exit\nChoice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                Student s = new Student();
                s.getData(sc);
                list.add(s);
            } else if (choice == 2) {
                System.out.print("Enter RegNo to migrate: ");
                String id = sc.next();
                list.removeIf(s -> s.regNo.equals(id));
                System.out.println("Processed.");
            } else if (choice == 3) {
                list.forEach(Student::printData);
            }
        } while (choice != 4);
    }
}
