package interview_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class ArraysAndStringQuestiosn {

	public static void main(String[] args) {

		int[] a = { 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0 };

//		programToFindDuplicateCharacter("chinmayChinmayjainajainanfjsdknjfnjnjfsdjr");
//		programToFindDupAndOccurence("chinmayChinmayjainajainanfjsdknjfnjnjfsdjr");
//		programToSetAll0And1LeftSide(a);
		
		balanceParanthesis();
	}

	private static void balanceParanthesis() {
		// TODO Auto-generated method stub
		
	}

	private static void programToFindDupAndOccurence(String string) {
		System.out.println("ArraysAndStringQuestiosn.programToFindDupAndOccurence()");
//		
//		Arrays.stream(string.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting())).entrySet()
//		.stream().filter(e -> e.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
//		.entrySet().stream().forEach((e) -> {
//			System.out.println(e.getKey() + "-" + e.getValue());
//		});

	}

	private void programToFindDuplicateCharacter(String string) {
		System.out.println("ArraysAndStringQuestiosn.programToFindDuplicateCharacter()");

		Arrays.stream(string.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet()
		.stream().filter(ch -> ch.getValue() > 1).map(in -> in.getKey()).forEach(sys -> {
			System.out.print(sys + " " + "\n");
		});

	}

	private  void programToSetAll0And1LeftSide(int[] a) {
		System.out.println("ArraysAndStringQuestiosn.programToSetAll0And1LeftSide()");

		int left = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				int temp = a[i];
				a[i] = a[left];
				a[left] = temp;
				left++;
			}
		}

		Arrays.stream(a).forEach(System.out::print);
	}

}
