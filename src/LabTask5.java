
import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        double width = 0;
        double height = 0;
        double cPerSqrFt = 0;
        double area = 0;
        double totalCost = 0;


        do {
            //collect width
            System.out.println("Width: ");

            if (scan.hasNextDouble()) {
                width = scan.nextDouble();
                //collect height
                System.out.println("Height: ");

                if (scan.hasNextDouble()) {
                    height = scan.nextDouble();
                    //collect cost per square foot
                    System.out.println("Cost per Square Foot: ");

                    if (scan.hasNextDouble()) {
                        cPerSqrFt = scan.nextDouble();
                        done = true;
                    }
                }
            }
            //if input is not a double
            else {
                trash = scan.nextLine();
                System.out.println("Incorrect Input: " + trash + ". Try Again.");
            }
            System.out.println("");
        }
        while (done == false);
        //calculate area & total cost
        area = height * width;
        totalCost = area * cPerSqrFt;
        //output to user
        System.out.println("Area: " + area);
        System.out.println("Total Cost: " + totalCost);


    }
}
