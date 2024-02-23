
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String userInput = "";
        double number = 0;



        do {
            System.out.println("Letter: ");

            if (scan.hasNextDouble()){

                number = scan.nextDouble();
                System.out.println("You gave me a number, give me a letter: ");
                scan.nextLine();

            }
            else {
                userInput = scan.nextLine();

                if (userInput.length() == 1){

                    done = true;

                }
                else {

                    System.out.println("Need a single letter. ");
                    scan.nextLine();

                }
            }


        }
        while (done == false);

        userInput = userInput.toLowerCase();


        switch(userInput){

            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }


    }
}
