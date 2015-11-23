/*
 * I created this short program that prompts the user for a number and determines if it is a perfect number or not. 
 */
import java.util.*;
public class CompSciReview {
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int n, sum = 0;
		
		System.out.println("Please enter number: ");
		n = input.nextInt();
		
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				sum+=i;
			}
		}
		if(n == sum){
			System.out.println(n + " is a perfect number: ");
		}
		else 
			System.out.println(n + " Is not a perfect number");
		
	
}
}
	

