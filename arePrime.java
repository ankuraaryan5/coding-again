import java.util.*;
public class arePrime {
    public static void main (String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Invalid input");
            return;
        }
        boolean[] arePrime=new boolean[n+1];
        for(int i=0;i<n;i++){
            arePrime[i]=true;
        }
        arePrime[0]=false;
        arePrime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(arePrime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    arePrime[j]=false;
                }
            }
        }
        System.out.print("Prime numbers from 2 to "+ n+" are ");
        for(int i=2;i<=n;i++){
            if(arePrime[i]){
                System.out.print(i+" ");
            }
        }
    }
}