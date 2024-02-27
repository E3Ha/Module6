
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
            //initial prompt
            System.out.println("Enter: ");
            //determine if an integer
            if (scan.hasNextInt()) {
                intUserInput = scan.nextInt();
                System.out.println(intUserInput + " = integer");

            }
            //determine if a double
            else if (scan.hasNextDouble()){
                doubleUserInput = scan.nextDouble();
                System.out.println(doubleUserInput + " = double");

            }
            //anything else is a string
            else {
                strUserInput = scan.nextLine();
                System.out.println(strUserInput + " = string");

            }

        }
        while (done == false);



    }
}
