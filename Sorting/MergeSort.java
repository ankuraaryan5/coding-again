// package Sorting;
// The core idea behind Merge Sort is the divide and conquer
// To implement merge sort we need two main pieces:
// A recursive mergeSort function that splits the array into halves.
// A merge function that combines two sorted halves back together.
public class MergeSort {
    static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    static void mergeSort(int[] arr){
        if (arr.length <= 1) return;
        int mid=arr.length/2;
        int[] left= new int[mid];
        int[] right= new int[arr.length-mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }
    public static void main(String[] args) {
        int arr[] = {5,2,4,-1,0,8};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        mergeSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();        
    }
}