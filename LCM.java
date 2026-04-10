import java.util.*;
public class LCM {
    static int lcm(int a, int b){
      return (a*b)/gcd(a,b);
    }
    static int gcd(int a,int b){
      while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
      }
      return a;
    }
    public static void main(String[] args) {
      System.out.println("enter the two numbers: ");
      Scanner sc = new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      System.out.println("the lcm for "+m+" and "+n +" is: "+lcm(m,n));
    }
}