import java.util.Scanner;

public class NoteAssignment {

    public static void main(String[] args) {


        double userInput = 0;
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";


        do {

            do {

                System.out.println("Double: ");

                if (scan.hasNextDouble()) {

                    userInput = scan.nextDouble();
                    done = true;

                } else {

                    trash = scan.nextLine();
                    System.out.println("Incorrect Input: " + trash);


                }


            }
            while (done == false);


            //if statements

            if (userInput > 0) {

                System.out.println("Positive: " + userInput);

            } else if (userInput < 0) {

                System.out.println("Negative: " + userInput);

            } else {

                System.out.println("Zero: " + userInput);

            }
            if (userInput > 1000000) {

                System.out.println("Large");

            } else if (Math.abs(userInput) < 1) {

                System.out.println("Small");

            }
            done = false;
            System.out.println(" ");
        }
        while (done == false);

    }
}