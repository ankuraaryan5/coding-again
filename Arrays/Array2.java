import java.util.*;
public class Array2{
    public static void main(String[] args){
        int[] arr = {3,4, 9,8, 12, 9,1, 11,5,5, 23, 5,4};
        // Sum of elements of array
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);
        // product of elements in an array
        // long pro=1;
        // for(int i=0;i<arr.length;i++){
        //     pro=pro*arr[i];
        // }
        // System.out.println(pro);
        // maximum and minimum value in array
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int val:arr){
            if(val>max){
                max=val;
            }
            if(val<min){
                min=val;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}