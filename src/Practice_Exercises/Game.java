package Practice_Exercises;

import java.util.Scanner;
import java.util.Random;

public class Game 
{
	Scanner input = new Scanner(System.in);
	Random randomNumber = new Random();
	
	public Game()
	{
		System.out.println("WELCOME TO GUESS THE NUMBER");
	}
	
	void gamePlay()
	{
		int userGuess;
		int genNumber = getRandomNumber();
		int numberOfGuesses = 0;
		
		System.out.printf("Guess the number between 1 and 1000?\n");
		userGuess = getUserInput();
		
		if(userGuess == genNumber)
		{
			System.out.printf("Congratulation! You Guessed Right\nOn the first try that's sick!\n\n");
			
		}
		else
		{
                        
			while(userGuess != genNumber)
			{
				numberOfGuesses++;
				
				if(userGuess > genNumber)
				{
					System.out.printf("%-19s\n", displayMessage() );
					System.out.printf("%-9s\n\n", tooBigMessage() );	
				}
				else
				{
					System.out.printf("%-19s\n", displayMessage() );
					System.out.printf("%-9s\n\n", tooSmallMessage() );
				}
				
				userGuess = getUserInput();
			}
			
			System.out.println("Congratulations!... You finally got it right");
			
			if(numberOfGuesses < 10)
			{
				System.out.println("Either you know the secret or you lucky!\n\n");
			}
			else if(numberOfGuesses == 10)
			{
				System.out.println("You know the secret!\n\n");
			}
			else if(numberOfGuesses > 10)
			{
				System.out.println("You should be able to do better\n\n");
			}
		}
		
		
	}
	
	int getUserInput()
	{
		int userInput = input.nextInt();
		
		return userInput;
	}
	
	int getRandomNumber()
	{
		int num = 1 + randomNumber.nextInt(1001);
		
		return num;
	}
	
	String displayMessage()
	{
		String message = new String();
		
		if((3 + randomNumber.nextInt(2)) % 3 == 0)
		{
			message = "Nope";
		}
		else if((3 + randomNumber.nextInt(2)) % 3 == 1)
		{
			message = "Guess Again";
		}
		else if((3 + randomNumber.nextInt(2)) % 3 == 2)
		{
			message = "Don't Whimp Out Now";
		}
        else
        {
            message = "No No No";
        }
		
		return message;
	}
	
	String tooBigMessage()
	{
		String message = new String();
		
		if((3 + randomNumber.nextInt(2)) % 3 == 0)
		{
			message = "Too Big";
		}
		else if((3 + randomNumber.nextInt(2)) % 3 == 1)
		{
			message = "Too Large";
		}
		else if((3 + randomNumber.nextInt(2)) % 3 == 2)
		{
			message = "OMG!";
		}
                else
                {
                    message = "2 big!";
                }
		
		return message;
	}
	
	String tooSmallMessage()
	{
		String message = new String();
		
		if((3 + randomNumber.nextInt(2)) % 3 == 0)
		{
			message = "Too Small";
		}
		else if((3 + randomNumber.nextInt(2)) % 3 == 1)
		{
			message = "Too Little";
		}
		else if((3 + randomNumber.nextInt(2)) % 3 == 2)
		{
			message = "Awfully Small";
		}
                else
                {
                    message = "2 small";
                }
		
		return message;
	}
}
