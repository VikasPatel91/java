// student information added 
import java.util.Scanner;

class studentData {

    public String studentName;
    public int registerNumber;
    public static int noOfStudents = 0; // Static variable to track student count

    // Constructor to initialize student details and increment student count
    public studentData(String studentName, int registerNumber) {
        this.studentName = studentName;
        this.registerNumber = registerNumber;
        noOfStudents++; // Increment static variable for each student object created
    }

    public void displayDetails() {
        System.out.println("Register Number : " + registerNumber);
        System.out.println("Name : " + studentName);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        int studentCount = 0;
        studentData[] students = new studentData[50]; // Array to hold student objects

        System.out.println("Enter the student details :");
        while (continueInput) {
            System.out.println("Enter the register number :");
            int registerNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.println("Enter the name :");
            String studentName = scanner.nextLine();
            students[studentCount] = new studentData(studentName, registerNumber); // Create student object and store in
            // array
            studentCount++;

            System.out.println("Do you want to continue [ Yes / No ] :");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("No")) {
                continueInput = false;
            }
        }
        System.out.println("Number of Students are : " + studentData.noOfStudents);

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Details of student " + (i + 1) + "  :");
            students[i].displayDetails();
        }

        scanner.close();
    }
}
