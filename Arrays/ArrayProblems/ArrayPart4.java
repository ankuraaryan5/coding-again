package Arrays.ArrayProblems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayPart4 {
    static void twoSum(int[] arr, int target){
        int ans[]=new int[2];
        boolean found=false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target) {
                    ans[0]=arr[i];
                    ans[1]=arr[j];
                    found=true;
                    // break; 
                }
            }
            // if (found) {
            //     break; //it will give the first pair satisfying the condition
            //     // if not used the last pair satisfying the condition is returned
            // }
        }
        if (found) {
            System.out.println("the given pair is");
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i]+" ");
            }
        }
        System.out.println();
    }
    static void threeSum(int[] arr, int target){
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==target) {
                        System.out.println(i+" , "+j+" , "+ k);
                    }
                }
            }
        }
    }
    static void removeDuplicates(int[] arr){
        // HashMap<Integer, Integer> map=new HashMap<>();
        // for (int i : arr) {
        //     map.put(i, map.getOrDefault(i,0)+1);
        // }
        // // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        // //     System.out.println("key: "+ entry.getKey() +" is present "+ entry.getValue()+" times");
        // // }
        // for (int i : map.keySet()) {
        //     System.out.print(i+ " ");
        // }
        // System.out.println();
        // System.out.println("there are "+ map.keySet().size()+ " unique elements");
        int i=0;
        int j=1;
        while (j<arr.length) {
            if (arr[i]==arr[j]) {
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        for (int j2 = 0; j2 <= i; j2++) {
            System.out.print(arr[j2]+" ");
        }
        System.out.println();
    }
    static int firstRepeatingElement(int[] arr){
        // brute force approach
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[i]==arr[j]) {
        //             return arr[i];
        //         }
        //     }
        // }
        // return -1;
        HashMap<Integer, Integer> freq= new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        // for (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
        //     if (entry.getValue()>1) {
        //         return entry.getKey();
        //     }
        // } // this might not store the original order
        for (int i : arr) { // so we can iterate over the array to preserve original order
            if (freq.get(i) > 1) {
                return i;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int n= arr.length;
        int[] leftSum= new int[n];
        int[] rightSum= new int[n];
        leftSum[0]=arr[0];
        for(int i=1;i<n;i++){
            leftSum[i]=leftSum[i-1]+arr[i];
        }
        rightSum[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (leftSum[i]==rightSum[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,8,2,0,9,-1};
        // twoSum(arr,7);
        // threeSum(arr, 7);
        int[] nums ={ 1,2,3,3,4,5,6,7 };
        System.out.println(firstRepeatingElement(nums));
        removeDuplicates(nums);
        int[] xyz={1,7,3,6,5,6};
        System.out.println(findPivot(xyz));// find the element where sum of elements in left == sum of elements in right

    }
}