
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String userInput = "";
        String trash = "";
        int month = 0;


        do {
            System.out.println("Month: ");

            if (scan.hasNextInt()) {
                month = scan.nextInt();
            } else {
                trash = scan.nextLine();
                System.out.println("Incorrect Input: " + trash);
            }
            if (month <= 12 && month >= 1) {
                done = true;
            } else {
                System.out.println("Need a valid month. ");
                scan.nextLine();
            }
            System.out.println("");
        }
        while (done == false);

            switch (month) {

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(month + " : 30 days");
                    break;
                case 2:
                    System.out.println(month + " : 28 days");
                    break;
                default:
                    System.out.println(month + " : 31 days");
                    break;

            }


    }
}
