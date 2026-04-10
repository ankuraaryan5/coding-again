import java.util.*;
public class pattern4{
    public static void main(String[] args){
        System.out.print("enter n: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}