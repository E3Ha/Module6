
import java.util.Scanner;

public class LabTask4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        int intUserInput = 0;
        double doubleUserInput = 0;
        String strUserInput = "";


        do {

            System.out.println("Enter: ");

            if (scan.hasNextInt()) {
                intUserInput = scan.nextInt();
                System.out.println(intUserInput + " = integer");

            }
            else if (scan.hasNextDouble()){
                doubleUserInput = scan.nextDouble();
                System.out.println(doubleUserInput + " = double");

            }
            else {
                strUserInput = scan.nextLine();
                System.out.println(strUserInput + " = string");

            }

        }
        while (done == false);



    }
}
