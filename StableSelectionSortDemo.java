package com.sort.demo;

public class StableSelectionSortDemo {
	static int swapCount = 0;
	public static void swap(int [] array, int currentIndex, int swapIndex) {
		int temp = array[currentIndex];
		array[currentIndex] = array[swapIndex];
		array[swapIndex] = temp;
		swapCount++;
	}
	public static void sort(int arr[]) {
		int minIndex=0;
		for(int i=0;i<arr.length;i++) {
			minIndex = i;
			for(int j= i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j])
					minIndex = j;
			}
			swap(arr,i,minIndex);
		}
	}
	
	public static void stableSort(int arr[]) {
		int minIndex=0;
		for(int i=0;i<arr.length;i++) {
			minIndex = i;
			for(int j= i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j])
					minIndex = j;
			}
			int minValue = arr[minIndex];
			while(minIndex > i) {
				arr[minIndex] = arr[minIndex-1];
				minIndex --;
			}
			arr[i] = minValue;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {2,5,3,4,9,7};	
		sort(array);
		stableSort(array);
		System.out.println("SwapCount:"+swapCount);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
