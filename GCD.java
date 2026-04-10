import java.util.*;
public class GCD {
    static int gcd(int a,int b){
      //  the largest positive integer that divides two or more integers without leaving a remainder
      while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
      }
      return a;
      // this is eucladian algorithm
    }
    public static void main(String[] args) {
      System.out.println("enter the two numbers: ");
      Scanner sc = new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      System.out.println("the greatest common divisor for "+m+" and "+n +" is: "+gcd(m,n));
    }
}