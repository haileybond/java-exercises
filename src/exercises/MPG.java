package exercises;

import java.util.Scanner;

public class MPG {
    //MPG = MilesDriven / GallonsUsed
    public static void main(String[] args) {
        Double MilesDriven;
        Double GallonsUsed;
        Double MPG;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        MilesDriven = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("How many gallons of fuel have you used?");
        GallonsUsed = in.nextDouble();

        MPG = MilesDriven/GallonsUsed;

        System.out.println("Your MPG is " + MPG + ".");
    }
}
