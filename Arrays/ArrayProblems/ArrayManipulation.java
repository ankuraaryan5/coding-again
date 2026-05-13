import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

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
    static void printAlternate(int arr[]){
        int n= arr.length;
        int i=0;
        int j= n-1;
        while (i<=j) {
            if (i==j) {
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }
    static void findMod(int arr[]){
        Map<Integer, Integer> hashMap= new HashMap<>();
        for (int i : arr) {
            hashMap.put(i, hashMap.getOrDefault(i,0) +1);
        }
        int maxFreq=0;
        int element=-1;
        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
            if (entry.getValue()>maxFreq) {
                element=entry.getKey();
                maxFreq=entry.getValue();
            }
        }
        System.out.println("element with maximum freq is: "+element);
    }
    static int[] freq(int arr[]){
        Map<Integer, Integer> freq= new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        int maxFreq=Integer.MIN_VALUE;
        int minFreq=Integer.MAX_VALUE;
        int maxEle=-1;
        int minEle=-1;
        for (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            if (entry.getValue()>maxFreq) {
                maxEle=entry.getKey();
                maxFreq=entry.getValue();
            }
            if (entry.getValue()<minFreq) {
                minEle=entry.getKey();
                minFreq=entry.getValue();
            }
        }
        int[] res= new int[2];
        res[0]=maxEle;
        res[1]=minEle;
        return res;
    }
    public static void main(String[] args) {
        // System.out.println("enter size of array");
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int[] arr={1,2,3,4,5};
        int[] arr={1,2,2,3,4,5,6};
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
        // Jai Jagannath
        printAlternate(arr);
        findMod(arr);
        int[] res= freq(arr);
        System.out.println("element with highest frequency is: "+res[0]);
        System.out.println("element with lowest frequency is: "+res[1]);
    }
    
}