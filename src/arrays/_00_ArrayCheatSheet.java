package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] memes = {"Boomer", "Coronavirus", "Elmo", "Pufferfish", "Kahoot"}; 
		//2. print the third element in the array
		System.out.println(memes[2]);
		//3. set the third element to a different value
		memes[2] = "Mr Krabs";
		//4. print the third element again
		System.out.println(memes[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < memes.length; i++) {
			System.out.println(memes[i]);
		}
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt();
			System.out.println(numbers[i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestnumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (smallestnumber>numbers[1]) {
			 smallestnumber = numbers[i];
			}
		}
		System.out.println("smallest number" + smallestnumber);
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int largestnumber= numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (largestnumber<numbers[1]) {
				largestnumber = numbers[i];
			}
		}
		System.out.println("largest number" + largestnumber);
	}
}
