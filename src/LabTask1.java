
import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        double itemPrice = 0;
        double shippingCost = 0;
        double SHIPPING = 0.02;
        double totalPrice = 0;


        do {

            System.out.println("Item Price: ");

            if (scan.hasNextDouble()) {
                itemPrice = scan.nextDouble();
                done = true;
            }
            else {
                trash = scan.nextLine();
                System.out.println("Incorrect Input");
            }
            System.out.println(" ");
        }
        while (done == false);

        if (itemPrice >= 100){
            shippingCost = itemPrice * SHIPPING;
            totalPrice = shippingCost + itemPrice;

            System.out.println("Shipping Cost: " + shippingCost);
            System.out.println("Total: " + totalPrice);
        }
        else {
            totalPrice = itemPrice;
            System.out.println("Shipping is free.");

            System.out.println("Shipping Cost: " + shippingCost);
            System.out.println("Total: " + totalPrice);
        }



    }
}
