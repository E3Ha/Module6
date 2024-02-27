
import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        String pAffiliation = "";
        int validInput = 0;


        do {

            System.out.println("Party Affiliation: ");

            //Collect input
            if (scan.hasNextDouble()) {
                trash = scan.nextLine();
                System.out.println("Incorrect Input: " + trash + ". Try Again.");
            }
            else {
                pAffiliation = scan.nextLine();
                done = true;
            }

        }
        while (done == false);

        //change to lower case
        pAffiliation = pAffiliation.toLowerCase();

        //determine affiliation & output
        switch(pAffiliation){

            case "democrat":
                System.out.println("You get a Democratic Donkey.");
                break;
            case "republican":
                System.out.println("You get a Republican Elephant.");
                break;
            case "independent":
                System.out.println("You get an Independent Man.");
                break;
            default:
                System.out.println("You have indicated some other affiliation.");
                break;
        }


    }
}




