
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        double userInput1 = 0;
        double userInput2 = 0;
        double userInput3 = 0;


        do {
            System.out.println("Number: ");

            if (scan.hasNextDouble()) {

                userInput1 = scan.nextDouble();
                System.out.println("Number: ");

                if (scan.hasNextDouble()) {

                    userInput2 = scan.nextDouble();
                    System.out.println("Number: ");

                    if (scan.hasNextDouble()) {

                        userInput3 = scan.nextDouble();

                        if (userInput1 == userInput2 && userInput1 == userInput3) {
                            System.out.println("All the same");

                        } else if (userInput1 != userInput2 && userInput1 != userInput3 && userInput2 != userInput3) {
                            System.out.println("All different");

                        } else {
                            System.out.println("Neither all different nor the same");

                        }

                    } else {
                        trash = scan.nextLine();
                        System.out.println("Incorrect Input");
                    }
                } else {
                    trash = scan.nextLine();
                    System.out.println("Incorrect Input");
                }
            } else {
                trash = scan.nextLine();
                System.out.println("Incorrect Input: " + trash);
            }
            System.out.println("");
        }
        while (done == false);

    }
}
