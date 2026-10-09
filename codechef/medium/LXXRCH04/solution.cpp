class Student {
    // Instance variables to store student's name and grade
    String studentName;
    int grade;

    // Constructor that initializes the student with predefined values
    Student() {
        studentName = "Alice";  
        grade = 8;   
    }

    public static void main(String[] args) {
        // Creating a Student object
        Student s1 = new Student();

        // Displaying the student's information
        System.out.println("Student Name: " + s1.studentName);
        System.out.println("Grade: " + s1.grade);
    }
}