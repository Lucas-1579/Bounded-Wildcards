package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Double> doubList = Arrays.asList(3.14, 2.26, 3.68);
		List<Object> objList = new ArrayList<>();
		
		copy(intList, objList);
		printList(objList);
		copy(doubList, objList);
		printList(objList);

	}
	
	public static void copy(List<? extends Number> source, List<? super Number> target) {
		for(Number n : source) {
			target.add(n);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + ", ");
		}
		System.out.println();
	}

}
