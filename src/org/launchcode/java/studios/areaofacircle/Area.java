package org.launchcode.java.studios.areaofacircle;
// Steps:
//1. Ask user for the radius
//2. Calculate the area
//3. Print the Area(result)

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }

    //Declare class variables here

    //create constructors here
    public Area() {

    }

    //create other methods here
    public void calculateArea() {
        //Ask the user for the radius
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the cirle: ");
        try {
            boolean keepOnLooping = true;
            while(keepOnLooping) {
                Double myUsersRadius = input.nextDouble();

                //check if radius is negative
                if (myUsersRadius < 0) {
                //print an error message
                System.out.println("The radius cannot be a negative number!");
                // prompt the user again

                } else {
                    //KCCO
                    //Calculate the area = pi * radius^2
                    Double area = Circle.getArea(myUsersRadius);

                    // print the result/area
                    System.out.println(area);

                    // Tell the while loop to exit
                    keepOnLooping = false;
                }
            }
        } catch(Exception error) {
            System.out.println("The radius must be a number!");
        }

        //close the scanner
        input.close();
    }

}
