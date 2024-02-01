import java.util.Scanner;

public class FitnessApp
{
    private int steps;
    private double caloriesBurned;
    private double distance;

    public FitnessApp() 
    {
        steps = 0;
        caloriesBurned = 0;
        distance = 0;
    }

    public void recordSteps(int steps)
    {
        this.steps += steps;
    }

    public void calculateCaloriesBurned(double weight) 
    {
        caloriesBurned = 0.05 * weight * distance;
    }

    public void calculateDistance()
    {
        distance = steps * 0.7; // Assuming an average stride length of 0.7 meters
    }

    public void displaySummary()
    {
        System.out.println("Fitness App Summary");
        System.out.println("Steps: " + steps);
        System.out.println("Distance: " + distance + " meters");
        System.out.println("Calories burned: " + caloriesBurned);
    }

    public static void main(String[] args)
    {
        FitnessApp app = new FitnessApp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Fitness App!");

        boolean exit = false;
        while (!exit)
        {
            System.out.println("\nSelect an option:");
            System.out.println("1. Record steps");
            System.out.println("2. Calculate distance");
            System.out.println("3. Calculate calories burned");
            System.out.println("4. Display summary");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter number of steps: ");
                    int steps = scanner.nextInt();
                    app.recordSteps(steps);
                    break;
                case 2:
                    app.calculateDistance();
                    System.out.println("Distance calculated.");
                    break;
                case 3:
                    System.out.print("Enter weight (in kg): ");
                    double weight = scanner.nextDouble();
                    app.calculateCaloriesBurned(weight);
                    System.out.println("Calories burned calculated.");
                    break;
                case 4:
                    app.displaySummary();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using Fitness App!");
    }
}
