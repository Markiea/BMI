
package com.teamtreehouse;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is your weight in pounds");

        double LB =  input.nextDouble();

        System.out.print("What is your height in inches?:");

        double inches = input.nextDouble();

        double calculateKilograms = LB * 0.45359237;

        double calculateMeters = inches * 0.0254;

        double total2 = Math.pow(calculateMeters,2);

        double total3 = calculateKilograms / total2;



        System.out.println("Your BMI is" + total3);

    }

}
