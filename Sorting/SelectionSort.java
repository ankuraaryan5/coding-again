// package Sorting;
// selection sort picks the smallest element from the array
// then put it in the correct position one by one
public class SelectionSort {
    static void selectionSort(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex=i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,4,-1,0,8};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}