package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		//Declare String Input as Follow
		String test = "changeme";
		System.out.println("Given String is = "+test);

		//Convert the String to character array
		char[] ch = test.toCharArray();
		System.out.println(ch);

		//Traverse through each character (using loop)
		for (int i = 0; i < ch.length; i++) {

			if(i%2 == 0) {

				System.out.println("Even Charcter is = "+ch[i]);
			}

			else {

				ch[i] = (char) (ch[i] - 32);
				System.out.println("Odd Character is:" + ch[i]);
			}

		}

	}

}