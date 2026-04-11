import java.util.*;
public class pattern19{
    public static void main(String[] args){
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}