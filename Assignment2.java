package Assignment;

public class Assignment2 {

	public static void main(String[] args) {

		averageOfArray();
		System.out.println();
		oddNumbers();
		System.out.println();
		checkPrime(13);
		System.out.println();
		sumofDigits(1234);
		System.out.println();
		reverseNumber(123);
		System.out.println();
		duplicatesInArray();
	}

	public static void averageOfArray() {
		int[] arr = { 1, 2, 3, 4, 5};
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		int average = total / arr.length;
		System.out.println("Average of given array is  " + average);

	}

	public static void oddNumbers() {
		int number = 187;
		System.out.print("List of odd numbers from 79 to " + number + ": ");
		for (int i = 79; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

	public static void checkPrime(int number) {
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(number + " is a prime number.");
		else
			System.out.println(number + " is not a prime number.");
	}

	public static void sumofDigits(int digit) {
		System.out.println("Given digit is " +digit);
		int Remainder;
		int sum = 0;
		while (digit > 0) {
			Remainder = digit % 10;
			sum = sum + Remainder;
			digit = digit / 10;

		}
		System.out.println("sum is " + sum);
	}

	public static void reverseNumber(int Number) {
		int reverse = 0;
		while (Number != 0) {
			int Remainder = Number % 10;
			reverse = reverse * 10 + Remainder;
			Number = Number / 10;

		}
		System.out.println("Reverse of a given number is " + reverse);
	}

	public static void duplicatesInArray() {
		int[] arr = new int[] { 12, 32, 12, 45, 65, 93, 0, 23, 45, 6 };
		System.out.println("Duplicate elements in given array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}
