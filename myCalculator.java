import java.util.Scanner;
import java.util.Arrays;


public class myCalculator{

	//method adds the elements in the array
	public static int add(int [] myList){

		int sum = 0;

		//iterates through array and adds the elements together
		for(int i = 0; i < myList.length; i++){

			sum += myList[i];

		}

		//return the sum
		return sum;
	}

	//method multiplies the elements in the array
	public static int multiply(int [] myList, int count){

		int product = 1;

		//iterates through array and multiplies the elements 
		for(int i = 0; i < count; i++){
				
			product = product * myList[i];

		}

		//return the product
		return product;


	}

	//method reverses the elements in the array
	public static int[] reverse(int [] myList, int count){

		int[] reversedList = new int[count];
		int j = 0;

		//iterates through array and reverses the order
		for(int i = count-1; i >= 0; i--){

			reversedList[j] = myList[i];
			j++;

		}

		//returns the reversed array
		return reversedList;

	}

	//my main method 
	public static void main(String args[]){

			Scanner stdin = new Scanner(System.in); 
			int nextInput = stdin.nextInt();
			int[] newList = new int[50]; 
			int count = 0;

			while(nextInput != -1){

				newList[count] = nextInput;
				count++;
				nextInput = stdin.nextInt();
			}

			int mySum = add(newList);
			int myProduct = multiply(newList, count);
			int[] myReversedList = reverse(newList, count);

			System.out.println("The sum is " + mySum);
			System.out.println("The product is " + myProduct); 
			System.out.print("The reversed array is ");

			for(int j = 0; j < myReversedList.length; j++){
	
				System.out.print(myReversedList[j] + ", ");

			}

	}

}

