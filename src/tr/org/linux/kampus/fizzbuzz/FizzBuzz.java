package tr.org.linux.kampus.fizzbuzz;
import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı girin FizzBuzz lıyalım :D   :");
		int number = input.nextInt();
		
		
			for(int i =1 ; i<number ; i++) {
				if (i%3 == 0 && i%5 == 0) {
					System.out.println("FizzBuzz "+i);	
				}
				else if(i%3 == 0) {
					System.out.println("Fizz "+i);
				}
				else if(i%5 == 0) {
					System.out.println("Buzz "+i);
				
				
				}
			}
		}
	}
