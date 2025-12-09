package com.ct.day5;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

		System.out.println("Original: " + Arrays.toString(arr));

		// call mergeSort on full array
		mergeSort(arr, 0, arr.length - 1);

		System.out.println("Sorted: " + Arrays.toString(arr));
	}

	// this function do divide work
	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			// sort left side
			mergeSort(arr, left, mid);

			// sort right side
			mergeSort(arr, mid + 1, right);

			// merge both sides
			merge(arr, left, mid, right);
		}
	}

	// this function do merge work
	public static void merge(int[] arr, int left, int mid, int right) {
		int l1 = mid - left + 1; // length of left part
		int l2 = right - mid; // length of right part

		int[] L = new int[l1];
		int[] R = new int[l2];

		// copy left part
		for (int i = 0; i < l1; i++) {
			L[i] = arr[left + i];
		}

		// copy right part
		for (int j = 0; j < l2; j++) {
			R[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k = left;

		// compare and put small first
		while (i < l1 && j < l2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// put rest of left
		while (i < l1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// put rest of right
		while (j < l2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}