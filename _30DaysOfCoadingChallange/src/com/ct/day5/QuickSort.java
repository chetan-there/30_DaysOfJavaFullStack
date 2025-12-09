package com.ct.day5;

import java.util.Arrays;

public class QuickSort {

 public static void main(String[] args) {
     int[] arr = {38, 27, 43, 3, 9, 82, 10};

     System.out.println("Original: " + Arrays.toString(arr));

     // call quickSort on full array
     quickSort(arr, 0, arr.length - 1);

     System.out.println("Sorted: " + Arrays.toString(arr));
 }

 // this function do divide work
 public static void quickSort(int[] arr, int left, int right) {
     if (left < right) {
         // find pivot place
         int pi = partition(arr, left, right);

         // sort left side
         quickSort(arr, left, pi - 1);

         // sort right side
         quickSort(arr, pi + 1, right);
     }
 }

 // this function put pivot in right place
 public static int partition(int[] arr, int left, int right) {
     int pivot = arr[right]; // take last element as pivot
     int i = left - 1;       // index for smaller element

     for (int j = left; j < right; j++) {
         // if current element smaller than pivot
         if (arr[j] < pivot) {
             i++;
             // swap arr[i] and arr[j]
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }

     // put pivot in correct place
     int temp = arr[i + 1];
     arr[i + 1] = arr[right];
     arr[right] = temp;

     return i + 1; // return pivot index
 }
}