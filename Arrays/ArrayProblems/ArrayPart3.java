import java.util.*;
public class ArrayPart3 {
    static void sortZeroAndOne(int[] arr){
        // method 1
        // int zero=0;
        // int ones=0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i]==0) {
        //         zero++;
        //     }
        //     else{
        //         ones++;
        //     }
        // }
        // for (int i = 0; i < zero; i++) {
        //     arr[i]=0;
        // }
        // for (int i = zero; i < arr.length; i++) {
        //     arr[i]=1;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // method 2
        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // method 3
        int n=arr.length;
        int i=0;
        int j=n-1;
        while (i<j) {
            if (arr[i]==1&&arr[j]==0) {
                arr[i]=0;
                arr[j]=1;
            }
            if (arr[i]==0) {
                i++;
            }
            if (arr[j]==1) {
                j--;
            }
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]+" ");
        }
        System.out.println();
    }
    static void missingNum(int[] arr){
        // method 1
        // int sum=0;
        // int actualSum=0;
        // for (int i = 0; i <= arr.length; i++) {
        //     sum=sum+i;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     actualSum=actualSum+arr[i];
        // }
        // System.out.println("the missing number is "+ (sum-actualSum));
        // method 2
        int xorSum=0;
        for (int i : arr) {
            xorSum=xorSum^i;
        }
        for (int i = 0; i <= arr.length; i++) {
            xorSum=xorSum^i;
        }
        System.out.println("the missing number is "+ xorSum);
    }
    static void uniqueEle(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum=sum^i;
        }
        System.out.println("the unique number is "+ sum);
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,0,0,0,0,1};
        sortZeroAndOne(arr);
        int[] nums={0,1,2,4,5,6,7,8};
        missingNum(nums);
        int[] ele={1,1,2,2,3,3,5,4,4,6,6};
        uniqueEle(ele);
    }
}