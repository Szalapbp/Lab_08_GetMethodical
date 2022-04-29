
import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tenPrice;
        double newPrice = 0;
        String yesNo;

        do
        {
            tenPrice = SafeInput.getRangedDouble(in,"What is the price of your item?", .50, 9.99);
            newPrice = tenPrice + newPrice;
            yesNo = SafeInput.getYNConfirm(in, "Are there any more items? (Y/N)");
        }  while(yesNo.equalsIgnoreCase("Y"));
        System.out.println("\nYour total will be " + newPrice + ". Thank you for shopping with us.");


    }
}
