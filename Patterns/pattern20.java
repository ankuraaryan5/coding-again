import java.util.*;
public class pattern20{
    public static void main(String[] args){
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print((char)('A'+k-1));
            }
            for(int l=i-2;l>=0;l--){
                System.out.print((char)('A'+l));
            }
            System.out.println();
        }
    }
}