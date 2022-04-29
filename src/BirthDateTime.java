import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthDay = 0;
        int birthMonth;
        int birthYear;
        int birthHour;
        int birthMinute;

        birthYear = SafeInput.getRangedInt(in, "Enter your birth year: ", 1950, 2010);
        birthMonth = SafeInput.getRangedInt(in,"Enter your birth month: ", 1, 12);
        switch(birthMonth)
        {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            {
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day: ", 1, 31);
                break;
            }
            case 2:
            {
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day: ", 1, 29);
                break;
            }
            case 4: case 6: case 9: case 11:
            {
              birthDay = SafeInput.getRangedInt(in, "Enter your birth day: ",1, 30);
              break;
            }
            
        }
        birthHour = SafeInput.getRangedInt(in, "Enter your birth hour: ",1,23);
        birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute (two numbers): ",0,59);
        System.out.println("\nYou were born " + birthMonth + " - " + birthDay + " - " + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}
//when running the program, you have to type in the year twice, not sure why.