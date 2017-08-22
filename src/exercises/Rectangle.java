package exercises;

import java.util.Scanner;


public class Rectangle {
    //length x width = area
    public static void main(String[] args) {
        Double RectangleLength;
        Double RectangleWidth;
        Double RectangleArea;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter rectangle length");
        RectangleLength = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("Enter rectangle width");
        RectangleWidth = in.nextDouble();

        RectangleArea = RectangleLength * RectangleWidth;

        System.out.println("The area of the rectangle with a length of "
                + RectangleLength + " and a width of " + RectangleWidth + " is " + RectangleArea + ".");


    }
}
