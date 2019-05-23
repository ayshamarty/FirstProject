import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	static int num1 = 2;
	static int num2 = 4;
	static String myString;
	static String s1;
	static String s2;
	static String operator;
	static int[] arrayTo100;
	static ArrayList<Integer> myList = new ArrayList<Integer>();

	static ArrayList<String> myStringList = new ArrayList<String>();

	public static void main(String[] args) {

		// string list
		myStringList.add("table");
		myStringList.add("chair");
		myStringList.add("desk");
		myStringList.add("stool");
		myStringList.add("mouse");
		myStringList.add("desk");

		// int list

		// Ex 1 Hello World
		System.out.println("Hello World!");

		// Ex 2 hard coded calculator
		calculator1();

		// Ex 2 calculator with parameters
		addition(5, 4);

		subtraction(6, 10);

		multiplication(7, 3);
		// another way of returning division, the above methods work too
		System.out.println(division(5, 2));

		// Ex 3a checking strings
		// matching
		checkString1("This is my string");
		// not matching
		checkString1("Hello");

		// Ex 3b
		// not matching
		checkString2("yes", "no");
		// matching
		checkString2("no", "no");

		// Ex 4 calculator continued
		// unrecognised parameters
		calculatorCont(10, "&", 3);
		// valid parameters
		calculatorCont(10, "/", 3);

		// calculator continued but with switch statements rather than if statements
		calculatorContSwitch(15, "/", 18);
		calculatorContSwitch(15, "6", 18);

		// Ex5 iteration
		printNumbers1();
		printNumbers2();
		printNumbersUnits();
		printNumbersTens();

		// Ex6 Collections
		practiceArrays();

		// list 0 - 10
		listMethod1();
		listMethod2(2, myList);
		System.out.println(listMethod2(2, myList));
		// list - checks for a certain string
		System.out.println(listMethod3("cat"));

		//
		System.out.println(listMethod4(myList, 5, 10));

		// streams
		System.out.println(stringMethod1(myStringList, "desk"));
		// streams counting max - both do the same thing
		System.out.println(stringListMethod2a(myList));
		System.out.println(stringListMethod2b(myList));
		// streams removing odd numbers
		System.out.println(listMethod100(myList));
	}

	private static void calculator1() {

		System.out.println(num1 + num2);

	}

	private static void addition(int num1, int num2) {
		System.out.print(num1);
		System.out.print(" + ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(num1 + num2);
	}

	private static void subtraction(int num1, int num2) {
		System.out.print(num1);
		System.out.print(" - ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(num1 - num2);

	}

	private static void multiplication(int num1, int num2) {
		System.out.print(num1);
		System.out.print(" * ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(num1 * num2);
	}

	private static double division(double num1, double num2) {
		System.out.print(num1);
		System.out.print(" / ");
		System.out.print(num2);
		System.out.print(" = ");
		return num1 / num2;
	}

	private static void checkString1(String myString) {
		if (myString.equals("This is my string")) {
			System.out.println(myString);
		} else {
			System.out.println("This is not my string");
		}

	};

	private static void checkString2(String s1, String s2) {
		if (s1.equals(s2)) {
			System.out.println("These strings are the same");
		} else {
			System.out.println("These strings are not the same");
		}
	}

	private static void calculatorCont(double num1, String operator, double num2) {
		if (operator == "+") {
			System.out.print(num1);
			System.out.print(" + ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num1 + num2);
		} else if (operator == "-") {
			System.out.print(num1);
			System.out.print(" - ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num1 - num2);
		} else if (operator == "*") {
			System.out.print(num1);
			System.out.print(" * ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num1 * num2);
		} else if (operator == "/") {
			System.out.print(num1);
			System.out.print(" / ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num1 / num2);
		} else {
			System.out.println("input not recognised");
		}
	}

	private static void calculatorContSwitch(double num1, String operator, double num2) {
		switch (operator) {
		case "+":
			System.out.print(num1);
			System.out.print(" + ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.print(num1);
			System.out.print(" - ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.print(num1);
			System.out.print(" * ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.print(num1);
			System.out.print(" / ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("input not recognised");
			break;
		}

	}

	private static void printNumbers1() {
		for (int i = 1; i < 11; i++) {
			System.out.print(i);
		}
	}

	private static void printNumbers2() {
		for (int i = 100; i < 1000; i++) {
			System.out.print(i);
		}
	}

	private static void printNumbersUnits() {
		for (int i = 1; i < 20; i++) {
			switch (i) {
			case 1:
				System.out.print("\nOne ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
			case 10:
				System.out.print("Ten ");
				break;
			case 11:
				System.out.print("Eleven ");
				break;
			case 12:
				System.out.print("Twelve ");
				break;
			case 13:
				System.out.print("Thirteen ");
				break;
			case 14:
				System.out.print("Fourteen ");
				break;
			case 15:
				System.out.print("Fifteen ");
				break;
			case 16:
				System.out.print("Sixteen ");
				break;
			case 17:
				System.out.print("Seventeen ");
				break;
			case 18:
				System.out.print("Eighteen ");
				break;
			case 19:
				System.out.println("Nineteen ");
				break;

			}
		}
	}

	private static void printNumbersTens() {

	}

	public static int[] practiceArrays() {
		int[] arrayTo100 = new int[100];
		for (int i = 0; i < arrayTo100.length; i++) {
			arrayTo100[i] = i + 1;
		}
		for (int i : arrayTo100) {
			System.out.print(i + ", ");
		}
		System.out.println("\n" + Arrays.toString(arrayTo100));
		return arrayTo100;

	}

	public static ArrayList<Integer> listMethod1() {

		for (int i = 0; i < 10; i++) {
			myList.add(i + 1);
		}
		System.out.println("\n" + myList);
		return myList;
	}

	public static boolean listMethod2(int inputSearch, ArrayList<Integer> chooseList) {

		return chooseList.contains(inputSearch);

	}

	public static boolean listMethod3(String inputSearch) {
		myStringList.add("table");
		myStringList.add("chair");
		myStringList.add("desk");
		myStringList.add("stool");
		myStringList.add("mouse");
		myStringList.add("desk");
		System.out.println(myStringList);
		return myStringList.contains(inputSearch);

	}

	public static ArrayList<Integer> listMethod4(ArrayList<Integer> chooseList, int divisor, int multiplier) {

		for (int i = 0; i < chooseList.size(); i++) {
			if (chooseList.get(i) % divisor == 0) {
				chooseList.set(i, chooseList.get(i) * multiplier);
			}
		}
		return chooseList;
	}

	// Create a method that checks for a specific word in a list of Strings and
	// returns the number of times that word occurs.
	public static long stringMethod1(ArrayList<String> chooseList, String searchString) {
		return chooseList.stream().filter(i -> i.equals(searchString)).count();

	}

	// two ways to create a method that checks a list of numbers and returns the
	// LARGEST value
	public static Integer stringListMethod2a(ArrayList<Integer> chooseList) {
		return chooseList.stream().max(Integer::compare).get();
	}

	public static Integer stringListMethod2b(ArrayList<Integer> chooseList) {
		return chooseList.stream().reduce(Integer::max).get();
	}

	// Create a method that removes EVEN values from a list of Numbers
	public static List<Integer> listMethod100(ArrayList<Integer> chooseList) {
		return chooseList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
	}


	}

