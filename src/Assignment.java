import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {

		// #1a
		
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		System.out.println("The answer to #1a is:" + (ages[ages.length - 1] - ages[0]));

		// #1b
		
		int[] ages1 = { 3, 9, 23, 64, 2, 8, 28, 93, 43 };
		System.out.println("The answer to #1b is:" + (ages1[ages1.length - 1] - ages1[0]));
	//		for (int i = 0; i <ages1.length; i++) {
	//		System.out.println(ages1[i]);
	//		}
		// #1c
			
		int[] age2 = { 3, 9, 23, 64, 2, 8, 28, 93, 43 };
		int sum = 0;
		{
			for (int x = 0; x < age2.length; x++)
				sum = sum + age2[x];
			double average = sum / age2.length;
			System.out.println("The answer to 1c is: Average age is: " + average);

		// #2a
			
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
			
		
		int sum1 = 0;
			
			for (String name : names) {
				sum1 = name.length() + sum1;
			}
			System.out.println("The answer to 2a is:" + sum1 / names.length);

		// #2b
		String[] names2 = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		String allNames = "";
			for (int y = 0; y < names2.length; y++) {
				allNames += (names2[y] + " ");
				
			}

			System.out.println("The answer to 2b: " + allNames);

		// #3
			
			System.out.println("The anwser to #3: " + names[names.length - 1]);

		// #4

			System.out.println("The answer to #4: " + names[0]);

		// #5
			
		int length = names.length;
		int[] nameLengths = new int[length];

			for (int z = 0; z < length; z++) {
				nameLengths[z] = names[z].length();
			}
			System.out.println("The answer to #5 is:" + length);

		// #6

		int sum2 = 0;

			for (int nameLength : nameLengths) {
				sum2 += nameLength;
			}

			System.out.println("The answer for #6 is: " + sum2);
		}
		// #7 Invoked method
		
		System.out.println("The answer to #7 is:" + multiplyString("Hi", 3));
		
		// #8 Invoked method
		
		String firstName = "John";
		String lastName = "Smith";
		String fullName = createFullName(firstName, lastName);
			
		System.out.println("The answer to #8 is:" + fullName);
		
		// #9 - Invoked method
		
		int[] numbers = new int[5];
		
		numbers[0] = 18;
		numbers[1] = 22;
		numbers[2] = 49;
		numbers[3] = 36;
		numbers[4] = 2;
		
		
		System.out.println("The answer to #9 is:" + sumInt(numbers));
	
	
		// #10 - Invoked method
		
		double[] costOfItems = new double[5];
		costOfItems[0] = 2.51;
		costOfItems[1] = 5.27;
		costOfItems[2] = 9.99;
		costOfItems[3] = 1.15;
		costOfItems[4] = 3.89;
		
		System.out.println("The answer to #10 is:" + calculateAverage(costOfItems));
			
		
		// #11 - Invoked method
		
		double[] grades1 = new double[3];
		grades1[0] = 85.;
		grades1[1] = 97.;
		grades1[2] = 91.;
		
			
		double[] grades2 = new double[3];
		grades2[0] = 81.;
		grades2[1] = 67.;
		grades2[2] = 74.;
				
		System.out.println("The answer to #11 is:" + averageElements(grades1, grades2));
		
		
		
		// #12 - Invoked method
		
		boolean isHotOutside = true;
		double moneyInPocket = 12.00; 
		
		System.out.println("The answer to #12 is:" + willBuyDrink (isHotOutside, moneyInPocket));
		
		// #13 - 
		/////Create your own method - Write a method that takes an array of int and returns false if the sum of all the ints in the array are less than 50
		
		int[] numbers5 = new int[4];
		
		numbers5[0] = 5;
		numbers5[1] = 13;
		numbers5[2] = 29;
		numbers5[3] = 2;
		
		
		
		System.out.println("The answer to #13 is:" + intValue(numbers5));
		}
			
		
		
	
		////////////////////////////METHODS BELOW HERE/////////////////////////////////////////////////////
	    
	
		// #7 method
	
		public static String multiplyString (String str, int num) {
				   
		String result = " ";
			for (int i = 0; i < num; i++) {
				
				result += str;
		}
			return result; 
		}
		// #8 method
		
		public static String createFullName(String x, String y) {
			return x + " " + y;
		}

		// #9 method
		
		public static boolean sumInt(int[] numbers) {
			
		int sum = 0;
			
			for (int number : numbers) {
				sum += number;
				//sum = sum + number; 
			}
			if (sum >= 100) {
				return true;
			}
		return false;
		}
			

		// #10 method
		public static double calculateAverage(double[] elements) {
			
			double sum = 0;
			for (double element : elements) {
				sum += element;
			}
			return sum / elements.length;
		}
		
							
		// # 11 - Method
		
		public static boolean averageElements(double[] elements1, double[] elements2) {
			
			if (calculateAverage (elements1) >= calculateAverage (elements2)) {
				return true;
			}
				return false;
		}

		// #12 Method

		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
			if (isHotOutside && (moneyInPocket > 10.50)) {
				return true;
			}			
				return false;
		}
		
		// #13 Method
	/////Create your own method - Write a method that takes an array of int and returns false if the sum of all the ints in the array are less than 50
		
		public static boolean intValue(int[] numbers) {
			
			int sum = 0;
				
				for (int number : numbers) {
					sum += number;
					//sum = sum + number; 
				}
				if (sum >= 50) {
					return true;
				}
			return false;
			}
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	





	