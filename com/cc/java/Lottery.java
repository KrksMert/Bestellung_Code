/**
 *  Literatur-Beispiel | 6 aus 49
 * 
 */

package com.cc.java;
import java.util.Random;
import java.util.Arrays;

public class Lottery {

	public static void main(String[] args) {
		
		// Deklarationen
		Random rand = new Random();
		int min  = 1, max = 49, slots = 6;
		int[] lotteryArray = new int[slots];
		int randomNumber;
		boolean isRepeated;
		

		for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) // 6x
		{
			do {
					isRepeated = false;
					// 1 to 49
					randomNumber = rand.nextInt((max - min) + 1) + min;
					// check for repeated number against
					// the filled non-zero elements			
					for (int k = 0; k <= indexDrawn; k++) 
					{
						//check against each filled non-zero elements
						//hope that none repeats the random number							
						if (lotteryArray[k] == randomNumber) 
						{
							isRepeated = true;
							break;
						}
					}
				
				}while (isRepeated);
			
			lotteryArray[indexDrawn] = randomNumber;  // Zahl ins Array
					
		}
		
		Arrays.sort(lotteryArray);
		
		System.out.println("");
		System.out.println("Die Ergebnisse der Lottozahlen:");
		
		for (int i = 0; i<slots; i++) 
		{
			System.out.print(lotteryArray[i] + " ");
			
		}
		
		// Generiere und füge die Superzahl hinzu
        int superzahl = rand.nextInt((max - min) + 1) + min;
        System.out.println("\nDie Superzahl ist: " + superzahl);
		
	}

}
