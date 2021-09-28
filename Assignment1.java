package Assignment;

public class Assignment1 {
	public static void main(String[] args) {
		factorial();
		System.out.println();
		Fibonacci();
		System.out.println();
		Sortarray();
		System.out.println();
		leapyear(2021);
		System.out.println();
		prime();
		System.out.println();
		AreaofTraingle(10, 20);
		System.out.println();
		sumofNaturalNumbers();
		System.out.println();
		reverseArray();
		System.out.println();
		displayEvenNumber();
		System.out.println();
		TriangleOutput();

	}

	public static void factorial() {
		int number = 5;
		long fact = 1;
		int i = 1;
		while (i <= number) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public static void Fibonacci() {
		int count = 10, num1 = 0, num2 = 1;
		System.out.print("Fibonacci Series of " + count + " numbers:");

		for (int i = 1; i <= count; ++i) {
			System.out.print(num1 + " ");

			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
		}

	}

	public static void Sortarray() {
		int[] arr = new int[] { 5, 2, 8, 7, 1 };
		int temp = 0;
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static boolean leapyear(int year) {
		if (year % 400 == 0)
			return true;
		if (year % 100 == 0)
			return false;
		if (year % 4 == 0)
			return true;
		return false;

	}

	public static void prime() {
		int i = 0;
		int num = 0;
		String primeNumbers = "";
		for (i = 1; i <= 10; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 10 are :");
		System.out.println(primeNumbers);
	}

	public static void AreaofTraingle(double base, double height) {
		double area = (base * height) / 2;
		System.out.println("Area of Triangle is: " + area);

	}

	public static void sumofNaturalNumbers() {
		int i, num = 20, sum = 0;
		for (i = 1; i <= num; ++i) {
			sum = sum + i;
		}
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);

	}

	public static void reverseArray() {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void displayEvenNumber() {
		int number = 50;
		System.out.print("List of even numbers from 1 to " + number + ": ");
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

	public static void TriangleOutput() {
		int i, j, row = 10;
		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
	}

}
