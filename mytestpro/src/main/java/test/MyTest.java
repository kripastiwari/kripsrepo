package test;

import java.util.Scanner;

public class MyTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inter a number");

		// String str= in.nextLine();

		int input = in.nextInt();

		MyTest primeTest = new MyTest();

		if (input < 2) {

			System.out.println("please provide number 2 or greater than 2");
			
		} else {

			boolean result = primeTest.isPrime(input);

			if (result == false) {
				System.out.println("Yes, the input you have given is prime");
			} else {
				System.out.println("No, the input you have given is not prime");
			}
		}

		MyTest armstrongTest = new MyTest();
		boolean n = armstrongTest.isArmstrong(input);
		if (n == true) {
			System.out.println("Yes, the input you have given is Armstrong");
		} else {
			System.out.println("No, the input you have given is not Armstrong");
		}

	}

	public boolean isPrime(int num) {

		boolean b = false;

		if (num % 2 == 0) {
			b = true;
		}

		return b;
	}

	public boolean isArmstrong(int num) {

		System.out.println(num);

		int result = 0;
		int rem = 0;

		for (int i = num; i > 0; i /= 10) {

			rem = i % 10;
			result = result + rem * rem * rem;

		}
		if (num == result) {

			return true;
		}
		return false;
	}

}
