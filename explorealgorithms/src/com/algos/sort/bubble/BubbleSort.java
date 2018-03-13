package com.algos.sort.bubble;

import java.util.stream.IntStream;

public class BubbleSort {

	public static void sort (int [] array ) {
		
		int size = array.length;
		int internalIteration = 0;
		int externalIteration = 0;
		
		for (int i = 0; i < size - 1 - 1; i ++) {
			externalIteration ++;
			boolean isSwapDone = false;
			
			for ( int j = 0; j < size - i - 1; j ++ ) {
				internalIteration ++;
				if ( array [ j ] > array [ j + 1]) {
					int temp = array [ j ];
					array [ j ] = array [ j + 1 ];
					array [ j + 1 ] = temp;
					
					isSwapDone = true;
				}
			}
			
			if ( !isSwapDone ) break;
			
		}
		
		System.out.println("Total internalIteration(comparision's): " + internalIteration + ", externalIteration:" + externalIteration + ".");
	}
	
	public static void main(String[] args) {
		int array [ ] = {1,2,3,4}; // { 21,34,21,12,64};
		
		sort(array);
		
		IntStream.range(0, array.length)
        .forEach(i -> System.out.print(array [ i ] + ", "));
	}
}
