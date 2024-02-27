
import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        int userInput1 = 0;
        int userInput2 = 0;


        do {

            //collect 1st integer
            System.out.println("Integer: ");

            if (scan.hasNextInt()) {
                userInput1 = scan.nextInt();
                //collect 2nd integer
                System.out.println("Integer: ");
                if (scan.hasNextInt()){
                    userInput2 = scan.nextInt();
                    done = true;
                }
            }
            //if input is not an integer
            else {
                trash = scan.nextLine();
                System.out.println("Incorrect Input: " + trash + ". Try Again.");
            }
            System.out.println("");
        }
        while (done == false);

        //determine greater than/less than/equal to
        if (userInput1 > userInput2){
            System.out.println(userInput1 + " > " + userInput2);

        }
        else if (userInput2 > userInput1){
            System.out.println(userInput2 + " > " + userInput1);

        }
        else {
            System.out.println(userInput1 + " = " + userInput2);
        }

    }
}
