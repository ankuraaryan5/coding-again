import java.util.*;
public class arePrime {
    static boolean isPrime(int n){
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
    }
    public static void main (String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Invalid input");
            return;
        }
        System.out.print("Prime numbers from 2 to "+ n+" are ");
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }   
        }
    }
}