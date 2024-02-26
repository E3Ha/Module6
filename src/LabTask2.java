
import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        int birthMonth = 0;
        int validInput = 0;


        do {

            System.out.println("Birth Month (1-12): ");

            if (scan.hasNextInt()) {
                validInput = scan.nextInt();

                if (validInput >= 1 && validInput <= 12){
                    birthMonth = validInput;
                    done = true;

                }
                else {
                    trash = scan.nextLine();
                    System.out.println("Invalid Month: " + validInput + ". Try Again.");
                }
            }
            else {
                trash = scan.nextLine();
                System.out.println("Incorrect Input: " + trash + ". Try Again.");
            }
            System.out.println(" ");
        }
        while (done == false);

        System.out.println("Your Birth Month: " + birthMonth);

    }
}
