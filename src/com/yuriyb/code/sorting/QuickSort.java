package com.yuriyb.code.sorting;

public class QuickSort {
	
	public static void main(String[] args){
		int[] array = {9, 2, 4, 7, 3, 7, 10 };	
		int startElement = 0;
		int endElement = array.length - 1;
		
		printArray(array);
		quickSort(array, startElement, endElement);
		printArray(array);
	}
	
	public static void quickSort(int[] array, int startElement, int endElement){
		
		if (array == null || array.length == 0 || startElement >= endElement) return;
		
		int middleElement = startElement + (endElement - startElement)/2;
		int pivot = array[middleElement];
		
		int i = startElement, j = endElement;
		
		while (i<=j){
			while (array[i]< pivot) i++;
			while (array[j]>pivot) j--;
			if (i<=j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		
		if (startElement < j) quickSort(array, startElement, j);
		if (endElement > i) quickSort (array, i, endElement);
	}
	
	public static void printArray(int[] x){
		for (int a: x) System.out.println(a +" ");
		System.out.println();
	}
}
