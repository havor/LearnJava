package basics.arrays;

public class DemoArray {
	public static void main(String args[]){
		int [] array;
		
		array = new int[10];
		
		for (int i = 0; i < 10; ++i){
			array[i] = i * 100;
		}
		
		for(int i = 0; i < 10; ++i){
		System.out.format("Element at index %s: %s.%n", i, array[i] );	
		}
		
	}

}
