package stringpractice;

import java.util.Arrays;

public class CountWords {
	
	public static void main(String[] args) {
		 String s = "Sharma is a good player and he is so punctual"; 
		 
		 int count = 0;
		 for(int i = 0 ; i < s.length(); i++) {
			 if(s.charAt(i) == ' ')
				 count++;
		 }
		 
		 count++;
		 System.out.println(count);
	}

}
