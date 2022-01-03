package exercises;

import java.util.Scanner;

public class MilesPerGalon {

    public static void main(String[] args) {
        MilesPerGalon milesPerGalon = new MilesPerGalon();
        milesPerGalon.calculateMilesPerGalon();
    }
    public void calculateMilesPerGalon() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = scanner.nextDouble();

        System.out.println("How many gallons of gas have you used?");
        Double gallonsConsumed = scanner.nextDouble();

        Double milesPerGallon = milesDriven/gallonsConsumed;
        System.out.println("Your miles per gallon consumption is: " + milesPerGallon.toString());
    }
}
