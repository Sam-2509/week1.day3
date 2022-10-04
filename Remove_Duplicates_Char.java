package week1.day2;

public class Remove_Duplicates_Char {
	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";		
        String temp = "";
	
        for (int i = 0; i < text.length(); i++) {
        	
            if (!temp.contains(String.valueOf(text.charAt(i))))
                temp = temp + text.charAt(i);
        }
        System.out.println(temp);
	}
		
	}
