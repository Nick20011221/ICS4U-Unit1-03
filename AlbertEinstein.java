import java.util.Scanner;

/**
 * This program calculates the amount of energy (in Joules) released 
 * when an object of a certain mass (in kg) is converted to energy.
 * @author Nick P-A
 * @since 2020/2/19 feb 13 2020
 * @version 1.0
 */
 
 
public class AlbertEinstein {
  static double massOfObject;
  static double energy;
  static int numberOfLogs;
  
  
  /**
  * This class calculates the number of logs a truck can carry depending on the length of the logs.
  */
  
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("what is the mass of the object?: ");
    massOfObject = userInput.nextDouble();
    energy =  massOfObject * 299800000 * 299800000;
    System.out.println("the amount of energy that could be released is " + energy 
        + " Joules if the mass is " + massOfObject + " kilograms.");
  }
}
