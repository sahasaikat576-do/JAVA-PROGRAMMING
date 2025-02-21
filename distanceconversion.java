    import java.util.Scanner;

 class distanceconversion {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble(); // Read the input as a double

        // Conversion factor: 1 mile = 1.6 km
        double miles = km / 1.6;

        // Output the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        // Close the scanner object
        input.close();
    }
}

