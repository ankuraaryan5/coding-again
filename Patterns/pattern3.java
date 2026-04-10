import java.util.*;
public class pattern3{
    public static void main(String[] args){
        System.out.print("enter n: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // int i=sc.nextInt();
        // int j=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}