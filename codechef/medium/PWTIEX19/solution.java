class Car {
    // Instance variables (fields) for make, model, and year
  String make;
  String model;
  int year;



    public void displayInfo() {
        // Print the values of instance variables
        System.out.println("Make: " + make);   // Prints the value of 'make'
        System.out.println("Model: " + model); // Prints the value of 'model'
        System.out.println("Year: " + year);   // Prints the value of 'year'
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an object of the Car class

        Car car=new Car();
        // Display car details using the displayInfo method
        car.displayInfo();

    }
}
