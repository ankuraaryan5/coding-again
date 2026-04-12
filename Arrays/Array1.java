// about arrays
import java.util.*;
public class Array1{
    public static void main(String[] args){
        // initialisation
        int[] arr;
        // allocation
        arr= new int[5];// array is allocated with 5 elements, all initialized to 0
        // init
        int[] brr={1,2,4};
        // access
        for(int val:brr){
            System.out.print(val);
        }
        //taking input
        System.out.println("enter array values");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}