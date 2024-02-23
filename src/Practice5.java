
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        int userInput1 = 0;
        int userInput2 = 0;
        int userInput3 = 0;


        do {
            System.out.println("Integer: ");

            if (scan.hasNextInt()) {
                userInput1 = scan.nextInt();
                System.out.println("Integer: ");

                if (scan.hasNextInt()) {
                    userInput2 = scan.nextInt();
                    System.out.println("Integer: ");

                    if (scan.hasNextInt()) {
                        userInput2 = scan.nextInt();
                     }
                    else {
                        trash = scan.nextLine();
                        System.out.println("Incorrect Input: " + trash);
                    }
                }
            else {
                trash = scan.nextLine();
                System.out.println("Incorrect Input: " + trash);
            }
        }

        while (done == false);


    }
}
