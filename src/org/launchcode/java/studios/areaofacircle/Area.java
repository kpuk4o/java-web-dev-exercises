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
        Double myUsersRadius = input.nextDouble();

        //Calculate the area = pi * radius^2
        Double area = Circle.getArea(myUsersRadius);

        // print the result/area
        System.out.println(area);

        //close the scanner
        input.close();
    }

}
