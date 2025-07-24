package Assignment2;
public class Main {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student();

        // Create Commission object
        Commision emp1 = new Commision();

        // Set employee details
        emp1.acceptDetails("John", "New York", "1234567890", 75000);

        // Calculate and display commission
        emp1.calculateCommission();
    }
}