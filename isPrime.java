import java.util.*;
public class isPrime {
    static boolean isPrime(int n){
      if(n<=1){
        System.out.println("Invalid input");
        return false;
      }
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
    }
    public static void main (String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
          System.out.println(n + " is a prime number");
        }
        else{
          System.out.println(n+" is not a prime number");
        }
    }
}