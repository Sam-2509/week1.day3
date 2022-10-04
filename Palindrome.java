package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String name = "redivider";
		String rev = "";

		for (int i = name.length()-1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}

		if (name.equals(rev)) {

			System.out.println("Given String "+name+" is Palindrome");

		} 

		else {

			System.out.println(" Given String "+name+" is not Palindrome");

		}

	}

}