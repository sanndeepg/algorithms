package com.algos.sort.quick;

import java.util.stream.IntStream;

public class QuickSort {

	public static void sort (int array [ ]) {
		new QuickSort().quicksort(0, array.length - 1, array);
	}
	
	public void quicksort ( int low, int high, int array [ ]) {
	
		if ( low < high ) {
			int pivotIndex = partition(low, high, array);
			if (pivotIndex > 0 ) {
				quicksort(low, pivotIndex - 1, array);
				quicksort(pivotIndex + 1, high, array);	
			}
		}
		
	}
	
	public int partition ( int low, int high, int array [ ]) {
		
		int pivot = array [ high ];
		int left  = low;
		int right = high - 1;
		
		while ( left < right ) {
			
			while ( left < high && array [ left ] < pivot ) left ++;
			while ( right >= low && array [ right ] >= pivot ) right --;
			
			if ( left < right ) {
				swap ( array, left, right );
			}
		}
		
		if ( right > low )
			swap ( array, right, low ); // swap pivot element
		
		if ( left < high )
			swap ( array, left, high ); // swap pivot element
		
		return left;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array [ i ];
		array [ i ] = array [ j ];
		array [ j ] = temp;
	}
	
	public static void main(String[] args) {
		int array [] = { 32,43,23,43,12,43,1221,223,12221,33554};
				//{ 11,90,3,32,44 };
				//{ 12,9,3,32,44 };
		
		QuickSort.sort(array);
		
		IntStream.range(0, array.length).
		forEach(index -> System.out.print(array [ index ] + ((index < array.length - 1) ? ", ": "")));
		
	}
}
