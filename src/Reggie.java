import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String BCC = "";
        String mChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        BCC = SafeInput.getRegExString(in,"Enter your UC Student M number","(M|m)\\d{8}");
        mChoice = SafeInput.getRegExString(in, "Enter your menu choice","[OoSsVvQq]");

    }
}
