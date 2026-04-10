import java.util.*;
public class pattern1{
    public static void main(String[] args){
        System.out.print("enter n: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // int i=sc.nextInt();
        // int j=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}