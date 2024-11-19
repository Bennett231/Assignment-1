/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to input the initial population and growth rate
        System.out.print("Enter the current world population: ");
        double population = input.nextDouble(); // User input for current population

        System.out.print("Enter the annual growth rate (in percentage): ");
        double growthRate = input.nextDouble(); // User input for growth rate

        int maxYears = 75;

        // Print table header
        System.out.println("Year\tPopulation\t\tDifference");

        // Variables to track current and previous population
        double previousPopulation = population;

        // Calculate population for each year
        for (int year = 1; year <= maxYears; year++) {
            // Calculate population increase for the current year
            double increase = population * (growthRate / 100);
            population += increase; // Update population to the new value

            // Print year, population, and difference
            if (year == 1) {
                System.out.printf("%d\t%,.0f\t\t%s%n", year, population, "N/A"); // No difference for the first year
            } else {
                double difference = population - previousPopulation; // Calculate difference from the previous year
                System.out.printf("%d\t%,.0f\t\t%,.0f%n", year, population, difference);
            }

            // Update the previous population for the next iteration
            previousPopulation = population;
        }

        // Close the scanner
        input.close();
    }
}
