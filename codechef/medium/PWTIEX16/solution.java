import java.util.Scanner;

class Student {
    // Instance variables
    String name;
    int rollNumber;
    double grade;
    
    
}

class Codechef {
    public static void main(String[] args) {
        // Create an instance of Student
        Student s1 = new Student();

        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read input for the student's details
  
  s1.name=sc.nextLine();
  s1.rollNumber=sc.nextInt();
  s1.grade=sc.nextDouble();



        // Display the student's details using instance variables
        System.out.println("Student Details:");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll Number: " + s1.rollNumber);
        System.out.println("Grade: " + s1.grade);

        // Close scanner
        sc.close();
    }
}
