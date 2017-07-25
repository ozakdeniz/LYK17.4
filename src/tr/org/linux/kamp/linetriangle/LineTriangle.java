package tr.org.linux.kamp.linetriangle;

import java.util.Scanner;

public class LineTriangle {

	public static void main(String[] args) {
		
		int line = 5;
		
		for(int i = line ; i >=1 ; i--) {
			for(int j = i ; j>=1 ; j--) {
				System.out.print(j+  " ");
			}
			for(int k = 2 ; k <= i ; k++) {
				System.out.print(k +" ");
			}
			System.out.println("");
		}
	}
}

