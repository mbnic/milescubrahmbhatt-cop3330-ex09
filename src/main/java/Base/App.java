/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package Base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    static int paintGallon = 350;

    public static void main(String[] args) {
        App myApp = new App();

        int roomSize = myApp.getRoomSquareFeet();
        int paintAmount = myApp.getPaintAmount(roomSize);

        myApp.printOutput(roomSize, paintAmount);
    }

    public void printOutput(int room, int paint) {
        System.out.println("You will need to purchase " + paint + " gallons of paint to cover "
                + room + " square feet.");
    }

    public int getPaintAmount(int sqrFT) {
        int paint = sqrFT / paintGallon;

        if (sqrFT % paintGallon != 0) {
            paint++;
        }

        return paint;
    }

    public int getRoomSquareFeet() {
        System.out.printf("What is the length of the room? ");
        String length = in.nextLine();

        System.out.printf("What is the width of the room? ");
        String width = in.nextLine();

        return (Integer.parseInt(length) * Integer.parseInt(width));
    }
}
