package project2;
import java.util.Scanner; // import Scanner class
// Driver class
class NumberGuess
{
public static void main(String[] args)
{
	System.out.println("Random Number Guesser");
	System.out.println("Your guess");
	Scanner snr = new Scanner(System.in);
	int randNum, nextGuess, highGuess = 100, lowGuess = 0;
	RNG RNG1 = new RNG();
	randNum = RNG1.rand();
	System.out.println("Enter a number between 0 and 100 : ");
	nextGuess = snr.nextInt();
	while(nextGuess != randNum)
	{
		if ((int)RNG1.getCount()/2 != 0)
			System.out.println("Number of guesses is " +(int)RNG1.getCount()/2);
		while(!RNG1.inputValidation(nextGuess, lowGuess, highGuess))
			{
			nextGuess = snr.nextInt();
			}
		if (nextGuess > randNum) 
		 {
			highGuess = nextGuess;
		 System.out.println("Your Guess is too high");
		 }
		else if (nextGuess < randNum) {
			lowGuess = nextGuess;
		System.out.println("Your Guess is too low");}
		if (nextGuess == randNum)
		{
			System.out.println("Your guess is correct!");
		}
	}
	do {
        System.out.println("Try again? (yes or no)");
        String choice = snr.nextLine();
        if(choice.equalsIgnoreCase("yes")){
            RNG1.resetCount();
            main(args);
            break;
        }else if(choice.equalsIgnoreCase("no")){
            System.out.println("Thanks for playing ");
        	System.exit(0);
        	break;
        }
    } while (true);
    
}
}
