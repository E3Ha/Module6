
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        String userInput = "";



        do {
            System.out.println("Letter: ");

            if (scan.hasNextDouble() || scan.hasNextInt()) {
                trash = scan.nextLine();
                System.out.println("Incorrect Input: " + trash);
            }
            else {
                userInput = scan.next();

                switch (userInput) {

                    case "a":


                }
            }


        }
        while (done == false);
    }
}
