package Practice_Exercises;

import java.util.Scanner;

public class Guess_Test
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Game play = new Game();
		int userInput;
		
		do
		{
			play.gamePlay();
			System.out.println("Would like to play again press?\nPress \'1\' to continue or \'0\' to exit ");
			userInput = input.nextInt();
		} while(userInput == 1);
		

	}

}
