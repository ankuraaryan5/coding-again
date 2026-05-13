// package Sorting;
// in insertion sort we cut the array in two parts and assume
// left side is already sorted then from right side we pick
// the element and put it in left side on their correct position
public class InsertionSort {
    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && key<arr[j]) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int [] arr={6,4,2,3,1,5};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        insertionSort(arr);;
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}