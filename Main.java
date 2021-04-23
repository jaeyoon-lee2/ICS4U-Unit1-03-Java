/*
* This program gets mass of object from the user's input,
* calculates and display energy of object in Joules and
* its equivalent bomb in kiloton to the output.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-04-23
*/
// package ca.mths.unit1.unit03.java.main;

import java.util.Scanner;


public final class Main {
    // Constant
    /**
     * speed of light: 2.998*10^8 m/s.
    */
    static final double SPEED_OF_LIGHT = 2.998e8;
    /**
     * A thousand tons of TNT would release about 4 TJ of energy (TJ: 10^12J).
    */
    static final double POWER_OF_BOMB = 4.0e12;

    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * This method get length of logs and
    * prints out how many logs can carry.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the mass of an object in kilograms: ");

        // String input
        float massOfObject = myObj.nextFloat();

        // Process
        float amountOfEnergy = massOfObject
                               * (float) Math.pow(SPEED_OF_LIGHT, 2);
        float equivalentBomb = amountOfEnergy / (float) POWER_OF_BOMB;

        // Output
        System.out.println("If " + massOfObject
                + " kg of mass was converted to energy, it would produce "
                + amountOfEnergy + "J of energy.\nOr this would be "
                + "equivalent to a " + equivalentBomb + " kiloton bomb.");
    }
}
