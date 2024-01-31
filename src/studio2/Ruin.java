package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter how much money you start with.");
		double startAmount = in.nextDouble();
		System.out.print("Enter your chance of winning as a probability as a percentage.");
		double winChance = in.nextDouble();
		System.out.print("Enter your win limit.");
		double winLimit = in.nextDouble();
		System.out.print("Enter how many days you are simulating.");
		int totalSimulations = in.nextInt();
		int currentDay = 1;
		int numberRuins = 0;
		while (currentDay <= totalSimulations)
		{
			int plays = 0;
			double currentCash = startAmount;
		while ((currentCash < winLimit) && (currentCash > 0.0))
			{
			plays ++;
			 if ((Math.random())*100.0 < winChance)
			 	{
				 currentCash++;
			 	}
			 else
			 	{
				 currentCash--;
			 	}
	
			}
		boolean ruin = (currentCash == 0);
		if (ruin == true)
		{
			System.out.println("Current day: " + currentDay + " - " + "Number of plays: " + plays + " - " + "Day ended in ruin." );
			numberRuins++;
		}
		else
		{
			System.out.println("Current day: " + currentDay + " - " + "Number of plays: " + plays + " - " + "Day was a success."); 	
		}
		currentDay++;
		}
	 System.out.println("Simulated Ruin Rate: " + (numberRuins/totalSimulations*100.0) + "%");
	double a = ((1-winChance/100)/(winChance/100));
	double expectedRuin = (Math.pow(a,startAmount)-Math.pow(a, winLimit))/(1-Math.pow(a,winLimit));
	 
	 System.out.println("Expected Ruin Rate: " + (expectedRuin*100) + "%");
		}
			}
			
		


