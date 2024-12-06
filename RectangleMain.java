//Dylan Diaz's Code

import java.util.Arrays;
import java.util.Scanner;
public class RectangleMain {
	
	public static void println(String s) 
	{
		System.out.println(s);
	}
	
	public static void print(String s) 
	{
		System.out.print(s);
	}
	
	public static void println(double s) 
	{
		System.out.println(s);
	}
	
	public static void print(double s) 
	{
		System.out.print(s);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner k = new Scanner(System.in);
		println("Hello and welcome to the Rectangle Sorter!");
		
		boolean exit = false;
		
		
		//This while loop makes it to where the program can only end if the user chooses so
		while(exit == false) 
		{
			println("How many rectangles would you like to make?");
			
			
			//This sets the size of the array
			int arraySize = k.nextInt();
			
			while(arraySize <= 0)
			{
				println("That is not a valid number of rectangles. \nPlease try again.");
				arraySize = k.nextInt();
			}
			
			
			double[] rectangleArray = new double[arraySize];
			
			
			//these three variables will determine the rectangles' areas
			double length;
			double width;
			double area;
			
			
			//this for loop asks the user for the demensions for each rectangle
			for(int i = 0; i < arraySize; i++) 
			{
				println("Please list the length and width of rectangle " + (i + 1));
				
				length = k.nextDouble();
				while(length <= 0) 
				{
					println("That is not a valid length. \nPlease give a valid length and width.");
					length = k.nextDouble();
				}
				width = k.nextDouble();
				while(width <= 0) 
				{
					println("That is not a valid width. \nPlease give a valid width.");
					width = k.nextDouble();
				}
				area = length * width;
				rectangleArray[i] = area;
				println("The area is " + rectangleArray[i]);
				
			}
			
			String sortOrder = k.nextLine();
			
			println("Would you like to sort in ascending or descending order?");
			
			sortOrder = k.nextLine();
			double placeholder;
			int repeat = 0;
			
			
			boolean isValid = false;
			while(isValid == false) 
			{
				//if the if statement is triggered, it sorts the areas in ascending order
				if(sortOrder.equals("Ascending") || sortOrder.equals("ascending")) 
				{
					println("The areas of your rectangles, in ascending order, is ");
					
					while(repeat == 0)
					{
						repeat = 1;
						
						for(int i = 0; i < rectangleArray.length - 1; i++) 
						{
							if(rectangleArray[i] > rectangleArray[i + 1]) 
							{
								placeholder = rectangleArray[i + 1];
								rectangleArray[i + 1] = rectangleArray[i];
								rectangleArray[i] = placeholder;
								repeat = 0;
							}
						}
					}
					for(int i = 0; i < arraySize; i++) 
					{
						println(rectangleArray[i]);
					}
					
					isValid = true;
				//if this else if statement is triggered it orders the areas in descending order
				} else if(sortOrder.equals("Descending") || sortOrder.equals("descending"))
				{
					println("The areas of your rectangles, in descending order, is ");
					
					while(repeat == 0)
					{
						repeat = 1;
						
						for(int i = 0; i < rectangleArray.length - 1; i++) 
						{
							if(rectangleArray[i] < rectangleArray[i + 1]) 
							{
								placeholder = rectangleArray[i + 1];
								rectangleArray[i + 1] = rectangleArray[i];
								rectangleArray[i] = placeholder;
								repeat = 0;
							}
						}
					}
					for(int i = 0; i < arraySize; i++) 
					{
						println(rectangleArray[i]);
					}
					
					isValid = true;
				}else 
				{
					println("Please enter a valid answer");
					sortOrder = k.nextLine();
				}
			}
			
			
			
			println("Would you like to see the average area \nof your rectangles?");

			String answer = k.nextLine();
			
			double sum = 0;
			double average = 0;
			isValid = false;
			
			//This finds the average of all the areas
			while(isValid == false) 
			{
				if(answer.equals("Yes") || answer.equals("yes")) 
				{
					
					for(int i = 0; i < rectangleArray.length; i++) 
					{
						sum = rectangleArray[i] + sum;
					}
					
					average = sum / rectangleArray.length;
					println("The average area of your rectangles \nis " + average);
					isValid = true;
				}else if(answer.equals("No") || answer.equals("no")) 
				{
					println("Okay");
					isValid = true;
				}else 
				{
					println("Please enter a valid answer");
					answer = k.nextLine();
				}
			}
			
			println("Would you like to see the smallest rectangle's area \nor the largest rectangle's area?");
			
			answer = k.nextLine();
			
			String answer2 = answer.toLowerCase();
			String sortOrder2 = sortOrder.toLowerCase();
			isValid = false;
			
			//This finds the smallest or largest area, depending on what the user wants
			while(isValid == false) 
			{
				if(answer2.equals("smallest") && sortOrder2.equals("descending")) 
				{
					println("The smallest rectangle's area is " + rectangleArray[rectangleArray.length - 1]);
					isValid = true;
				}else if(answer2.equals("smallest") && sortOrder2.equals("ascending")) 
				{
					println("The smallest rectangle's area is " + rectangleArray[0]);
					isValid = true;
				}else if(answer2.equals("largest") && sortOrder2.equals("descending")) 
				{
					println("The largest rectangle's area is " + rectangleArray[0]);
					isValid = true;
				}else if(answer2.equals("largest") && sortOrder2.equals("ascending")) 
				{
					println("The largest rectangle's area is " + rectangleArray[rectangleArray.length - 1]);
					isValid = true;
				}else 
				{
					println("Please enter a valid answer");
					answer = k.nextLine();
					answer2 = answer.toLowerCase();
				}
			}
			
			
			//this while loop helps the first while loop determine if the program should end or not
			println("Would you like to quit?");
			
			answer = k.nextLine();
			answer2 = answer.toLowerCase();
			
			boolean loop = true;
			while(loop == true) 
			{
				if(answer2.equals("yes")) 
				{
					exit = true;
					println("Bye have a nice day");
					loop = false;
				}else if(answer2.equals("no")) 
				{
					println("Okay");
					loop = false;
				}else 
				{
					println("Please enter a valid answer");
					answer = k.nextLine();
					answer2 = answer.toLowerCase();
				}
			}
		}
	}
}
