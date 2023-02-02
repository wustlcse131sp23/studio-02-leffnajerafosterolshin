package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print ("The amount of money you start with");
		int startAmount = in.nextInt();
		
		System.out.print ("The win probability, or the probability that you win a single day");
		double winChance = in.nextDouble();
		
		System.out.print ("If you reach this amount of money you had a successful day and leave");
		int winLimit = in.nextInt();
		
		while (startAmount < winLimit && startAmount > 0)
		{
			
		
			
		double random = Math.random();
		boolean round1 = (winChance>random);
		
		if (round1 == false) 
		{
			System.out.println("Current Amount: " + startAmount --);
		}
		else {
			System.out.println("Current Amount: " + startAmount ++);
		}
			
		}
	}

}
