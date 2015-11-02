package javabasics;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray;
		
		intArray = new int[10];
		
		for(int i = 0; i <10; ++i){
			intArray[i] = i * 10;
		}
		
		for(int i = 0; i <10; ++i){
			System.out.format("The element at index %s is %s.%n", i, intArray[i]);
		}
		
		

	}

}
