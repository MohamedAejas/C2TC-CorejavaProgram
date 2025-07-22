package entityclassassignment1;
import java.util.Scanner;
public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();

            students[i] = new Student(id, name, department);
            System.out.println();
        }

        System.out.println("Displaying Student Details:");
        for (Student student : students) {
            student.displayDetails();
        }

        scanner.close();
	}
}
