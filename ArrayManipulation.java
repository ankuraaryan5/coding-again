import java.util.Scanner;

public class ArrayManipulation {
    static int[] reverseArr(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {  
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[end]^arr[start];
            arr[start]=arr[start]^arr[end];
            start++;
            end--;
        }
        return arr;
    }
    static int[] rightShiftArrByOne(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }
    // static int[] rightShiftArrByK(int[] arr, int k){
    //     int[] newarr = new int[arr.length-k];
    //     for (int i = 0; i < newarr.length; i++) {
            
    //     }
    // }
    public static void main(String[] args) {
        // System.out.println("enter size of array");
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int[] arr={1,2,3,4,5};
        int[] arr={1,2,3,4,5,6};
        System.out.println("printing the array");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        reverseArr(arr);
        System.out.println("printing the array after reversing");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        // System.out.println("printing the array after rightshift");
        // rightShiftArrByOne(arr);
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        System.out.println("printing the array after rightshift");
        // rightShiftArrByK(arr,4);
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();
    }
    
}