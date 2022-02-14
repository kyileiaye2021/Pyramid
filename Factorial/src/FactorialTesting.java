import java.util.Scanner;
public class FactorialTesting {

	public static void main(String[] args) {
		
     Scanner s = new Scanner(System.in);
     
     //taking input
     System.out.print("Which number would u like to know its factorial?: ");
     int number = s.nextInt();
     
     //creating an object to call factorial method
     FactorialTesting f = new FactorialTesting();
     
     System.out.println("The factorial of " + number +" is " + f.factorial(number) + ".");
     
     }
	
	//creating a method
	int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n * factorial((n-1));
		}
	}

}
