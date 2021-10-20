package random_test;


import java.util.Scanner;

public class Random_Number {

	public static void main(String[] args) {
		
		
		// Ask the USER for a string and print “Please enter a String:”
					System.out.println("Please enter your Intergers: ");
					Scanner input= new Scanner(System.in);
					int n= input.nextInt();
					
					int largest = Integer.MIN_VALUE;
					int smallest = Integer.MAX_VALUE;
					
					for(int i=0; i<n; i++) {
						int number= input.nextInt();
						
						if(number > largest) {
							largest=number;
						}
						
						if(number < smallest) {
							smallest = number;	
						}
					}
					System.out.println("largest of N number is : " + largest); 
					System.out.println("smallest of N number is : " + smallest);

					}
}


