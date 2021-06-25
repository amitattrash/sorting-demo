package com.sort.demo;

public class SelectionSortDemo {
	static int swapCount = 0;
	public static void swap(int [] array, int currentIndex, int swapIndex) {
		int temp = array[currentIndex];
		array[currentIndex] = array[swapIndex];
		array[swapIndex] = temp;
		swapCount++;
	}
	public static void sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] array = {2,5,3,4,9,7};
		sort(array);
		System.out.println("SwapCount:"+swapCount);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
