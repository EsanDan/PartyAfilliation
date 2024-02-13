import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your party affiliation: ");

        String partyAffiliation = in.nextLine();

        if(partyAffiliation.equalsIgnoreCase("D"))
        {
            System.out.println("You got a Democratic Donkey");

        }
        else if(partyAffiliation.equalsIgnoreCase("R"))
        {
            System.out.println("You got a Republican Elephant");
        }
        else if(partyAffiliation.equalsIgnoreCase("I"))
        {
            System.out.println("You got an Independent Man");
        }
        else
        {
            System.out.println("You get Other");
        }
    }
}