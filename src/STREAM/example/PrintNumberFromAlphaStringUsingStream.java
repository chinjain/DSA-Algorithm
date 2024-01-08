package STREAM.example;

import java.util.Arrays;

public class PrintNumberFromAlphaStringUsingStream {
	
	public static void main(String[] args) {
		 Character[] alphanumericArray = {'a', '1', 'b', '2', 'c'};
		 Arrays.stream(alphanumericArray).filter(Character::isDigit).forEach(a->System.out.println(a));
	}

}
