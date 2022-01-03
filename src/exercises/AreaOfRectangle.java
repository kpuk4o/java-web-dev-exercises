package exercises;

import java.util.Scanner;


public class AreaOfRectangle {
    public static void main(String[] args) {
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();
    }

    public void calculateAreaOfRectangle () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the recangle? ");
        Double myRectLength = scanner.nextDouble();

        System.out.println("What is the width of the recangle? ");
        Double myRectWidth = scanner.nextDouble();

        Double area = myRectLength * myRectWidth;

        System.out.println("The area is: " + area.toString());

    }
}
