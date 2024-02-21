
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        int userInput = 0;


        do {

            System.out.println("Integer: ");

            if (scan.hasNextInt()) {

                userInput = scan.nextInt();

                if (userInput < 0) {

                    userInput = userInput * -1;

                }

                if (userInput >= 1000000) {
                    System.out.println("Digits = 7");
                } else if (userInput >= 100000) {
                    System.out.println("Digits = 6");
                } else if (userInput >= 10000) {
                    System.out.println("Digits = 5");
                } else if (userInput >= 1000) {
                    System.out.println("Digits = 4");
                } else if (userInput >= 100) {
                    System.out.println("Digits = 3");
                } else if (userInput >= 10) {
                    System.out.println("Digits = 2");
                } else if (userInput >= 0) {
                    System.out.println("Digits = 1");
                }

            } else {
                trash = scan.nextLine();
                System.out.println("Incorrect Input: " + trash);
                System.out.println("You may have entered a value exceeding the limit : 1000000");
            }
            System.out.println("");
        }
        while (done == false);

    }
}
