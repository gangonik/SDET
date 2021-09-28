package Assignment;

import java.util.HashMap;

public class Assignment3 {

	public static void main(String[] args) {
		occurenceOfString();
		System.out.println();
		palindrom("trurt");
		System.out.println();
		checkStringIsPresent("A brown fox ran away fast");
		System.out.println();
		convertStringToCharacterArray("DEVLABS");
		System.out.println();
		numberFormatExceptn("123");
		System.out.println();
		arithmaticExpection(5, 0);
		System.out.println();
		nestedTry(10, 0);
		System.out.println();
		rethrow(5, 0);
	}

	public static void occurenceOfString() {
		String str = "DevLabsAllianceTraining";
		HashMap<Character, Integer> hMap = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (hMap.containsKey(str.charAt(i))) {
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			} else {
				hMap.put(str.charAt(i), 1);
			}
		}
		System.out.println(hMap);

	}

	public static void palindrom(String str)

	{
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev))
			System.out.println("String is a palindrome " + str);
		else
			System.out.println("String is not a palindrome " + str);
	}

	public static void checkStringIsPresent(String Str) {
		if (Str.contains("brown"))
			System.out.println("brown is present in the string " + Str);
		else
			System.out.println("brown is not present in the string " + Str);

	}

	public static void convertStringToCharacterArray(String Str) {
		char[] ch = new char[Str.length()];
		for (int i = 0; i < Str.length(); i++) {
			ch[i] = Str.charAt(i);
		}
		for (char c : ch) {
			System.out.println(c);
		}

		Str = new String(ch);
		System.out.println(Str);

	}

	public static void numberFormatExceptn(String str) {

		try {
			int a = Integer.parseInt(str);
			System.out.println(a);

		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception");
		}

	}

	public static void arithmaticExpection(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
	}

	public static void nestedTry(int a, int b) {
		try {

			try {

				System.out.println(a / b);

			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			int c[] = new int[5];
			c[5] = 4;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

	public static void rethrow(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			throw e;
		}
	}

}
