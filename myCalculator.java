import java.util.Scanner;
import java.util.Arrays;


public class myCalculator{

	public static int add(int [] myList){

		int sum = 0;

		for(int i = 0; i < myList.length; i++){

			sum += myList[i];

		}


		return sum;
	}

	public static int multiply(int [] myList, int count){

		int product = 1;

			for(int i = 0; i < count; i++){
				
				product = product * myList[i];

			}


			return product;


	}

	public static int[] reverse(int [] myList, int count){

		int[] reversedList = new int[count];
		int j = 0;

		for(int i = count-1; i >= 0; i--){

			reversedList[j] = myList[i];
			j++;

		}

		return reversedList;

	}

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

			System.out.println("The sum was " + mySum);
			System.out.println("The product was " + myProduct); 
			System.out.print("The reversed array was ");

			for(int j = 0; j < myReversedList.length; j++){
	
				System.out.print(myReversedList[j] + ", ");

			}

	}

}

