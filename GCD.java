import java.util.*;
public class GCD {
    static int gcd(int a,int b){
      //  the largest positive integer that divides two or more integers without leaving a remainder
      for(int i=Math.min(a,b);i>0;i--){
        if(a%i==0&&b%i==0){
          return i;
        }
      }
      return 1;
    }
    public static void main(String[] args) {
      System.out.println("enter the two numbers: ");
      Scanner sc = new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      System.out.println("the greatest common divisor for "+m+" and "+n +" is: "+gcd(m,n));
    }
}