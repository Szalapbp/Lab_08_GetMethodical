import java.util.Scanner;
public class SafeInput
{
    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt)
    {
        System.out.println(prompt + ":");
        while(!pipe.hasNextInt())
        {
            String trash = "";
            System.out.println("Invalid input, enter an integer.:");
            pipe.next();
        }
        return pipe.nextInt();

    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        System.out.println(prompt + ":");
        while(!pipe.hasNextDouble())
        {
            String trash = "";
            System.out.println("Invalid input, enter an double.:");
            pipe.next();
        }
        return pipe.nextDouble();
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int value;
        boolean numRI = false;
        String trash = "";
        do
        {
            System.out.print(prompt + "[" + low + "-" + high + "]: ");
            value = pipe.nextInt();
            if(value >= low && value <= high)
            {
                numRI = true;
            }
            else
            {
                System.out.println("\nInvalid input of " + value);
                numRI = false;
            }
        }while(!numRI);
        return value;

    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double value = 0;
        boolean numD = false;
        String trash = "";
        do
        {
            System.out.print(prompt + "[" + low + "-" + high + "]: ");
            value = pipe.nextDouble();
            if(value <= high && value >= low)
            {
                numD = true;
            }
            else
            {
                System.out.println("\nInvalid input of " + value);
                numD = false;
            }
        }while(!numD);
        return value;
    }

    public static String getYNConfirm(Scanner pipe, String prompt)
    {
    String yesNo;
        do
        {
            String trash = "";
            System.out.println(prompt + ":");
            yesNo = pipe.nextLine();
            if(yesNo.equalsIgnoreCase("Y"))
            {
                break;
            }
            else if(yesNo.equalsIgnoreCase("N"))
            {
                break;
            }
            else
            {
                System.out.println("");
            }

        }while(!yesNo.equalsIgnoreCase("Y") || !yesNo.equalsIgnoreCase("N"));
        return yesNo;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean regVal = false;

        do
        {
          //Show Prompt
            System.out.print(prompt + ": ");
          //input data
            value = pipe.nextLine();
          //test to see if correct
            if(value.matches(regExPattern))
            {
                regVal = true;
            }
            else
            {
                System.out.println("\nInvalid Input: " + value);
            }

        }while(!regVal);
        return value;

    }

    public static void prettyHeader(String msg)
    {


    }

}
