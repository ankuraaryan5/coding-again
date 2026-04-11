import java.util.*;
public class pattern17{
    public static void main(String[] args){
        System.out.print("enter n: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>1;i--){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}