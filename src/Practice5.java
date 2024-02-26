
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
                        userInput3 = scan.nextInt();
                        done = true;
                    }
                }
            }
            else {
                trash = scan.nextLine();
                System.out.println("Incorrect Input: " + trash);
            }
            System.out.println(" ");
        }
        while (done == false);


        if (userInput1 > userInput2 && userInput1 > userInput3){
            System.out.println(userInput1 + " is the greatest.");
        }
        else if (userInput2 > userInput1 && userInput2 > userInput3) {
            System.out.println(userInput2 + " is the greatest.");
        }
        else if (userInput3 > userInput1 && userInput3 > userInput2) {
            System.out.println(userInput3 + " is the greatest.");
        }
        else {
            System.out.println("All values are equal.");
        }


    }
}
