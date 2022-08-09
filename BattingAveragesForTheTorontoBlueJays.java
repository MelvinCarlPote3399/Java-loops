// The "BattingAveragesForTheTorontoBlueJays" class.
import java.text.*;
public class BattingAveragesForTheTorontoBlueJays
{
    public static void main (String[] args)
    {

	String name;
	double hits;
	double bats;
	double battingAverage;
	NumberFormat nf = NumberFormat.getInstance ();
	nf.setMaximumFractionDigits (3);
	nf.setMinimumFractionDigits (3); //do this so that the number that's calculated is rounded to 3 decimals.

	do

	    {

		System.out.println ("Enter a player's name from the baseball team, the Toronto Blue Jays.");
		name = TextIO.getln (); //just enter any name as long as there's no numbers in it or else the program won't work.
		System.out.println ("Player name: " + name); // this will output the name you entered.

		if (name.equalsIgnoreCase ("stop")) // when you enter "stop" when the program asks for your name, the program stops.
		{
		    break;
		}

		System.out.println ("Enter the amount of times they were at bat.");
		bats = TextIO.getlnInt ();
		System.out.println ("Total number at bats: " + bats); //this will output the number you entered for the number of times the player was at bat

		System.out.println ("Enter the number of hits they had when they were at bat.");
		hits = TextIO.getlnInt ();
		System.out.println ("Total hits: " + hits); //this will output the number you entered, which will be used for the number of times the player got a hit when at bat.

		System.out.println ("Now, the program will calculate the batting average.");
		battingAverage = (hits / bats); //this divides the number of hits by the number of bats, and this will give you the batting average.
		System.out.println ("The batting average is: " + nf.format (battingAverage)); //the program automatically calculates the average for you.

	    }
	while (!name.equalsIgnoreCase ("stop"));
	System.out.println ("Goodbye.");



	// Place your code here
    } // main method
} // BattingAveragesForTheTorontoBlueJays class
