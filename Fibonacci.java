import java.util.Scanner;
public class Fibonacci {
	  
	  public static long fibonacci(long number) {
	    if ((number == 0) || (number == 1)) 
	      return number;
	    else
	     
	      return fibonacci(number - 1) + fibonacci(number - 2);
	  }

	  public static void main(String[] args) {
	    for (int integer = 0; integer <= 17; integer++)
	      System.out.printf("Fibonacci of %d is: %d\n", integer, fibonacci(integer));
	 }
}

//First number in the Fibonacci sequence to contain over 1000 digits is 17.