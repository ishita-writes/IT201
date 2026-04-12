import java.util.*;

interface Department {
    String deptName = "Computer Science", deptHead = "Dr. Smith";
    void printDeptDetails();
}

class Hostel {
    String hostelName, hostelLocation;
    int numberOfRooms;

    void getHostelData(String n, String l, int r) {
        hostelName = n; hostelLocation = l; numberOfRooms = r;
    }

    void printHostelData() {
        System.out.println("Hostel: " + hostelName + " (" + hostelLocation + "), Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName, regdNo, electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {
        System.out.print("Name, RegdNo, Elective, Marks: ");
        studentName = sc.next(); regdNo = sc.next(); electiveSubject = sc.next(); avgMarks = sc.nextDouble();
        System.out.print("Hostel Name, Location, Rooms: ");
        getHostelData(sc.next(), sc.next(), sc.nextInt());
    }

    void printData() {
        System.out.println("\nStudent: " + studentName + " [" + regdNo + "] | Elective: " + electiveSubject + " | Avg: " + avgMarks);
        printHostelData();
        printDeptDetails();
    }

    public void printDeptDetails() {
        System.out.println("Dept: " + deptName + " | Head: " + deptHead);
    }
}

public class ManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int ch;
        do {
            System.out.print("\n1.Admit 2.Migrate 3.Display 4.Exit: ");
            ch = sc.nextInt();
            if (ch == 1) { Student s = new Student(); s.getData(sc); list.add(s); }
            else if (ch == 2) {
                System.out.print("Enter RegdNo: ");
                String id = sc.next();
                list.stream().filter(s -> s.regdNo.equals(id)).forEach(Student::printData);
            }
            else if (ch == 3) list.forEach(Student::printData);
        } while (ch != 4);
    }
}
