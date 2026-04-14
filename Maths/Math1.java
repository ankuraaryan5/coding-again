import java.util.*;
public class Math1{
    static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean checkPalindrome(int i){
        if(i==rev(i)){
            return true;
        }
        return false;
    }
    static int rev(int i){
        int rev=0;
        while(i>0){
            int digit=i%10;
            rev=rev*10+digit;
            i=i/10;
        }
        return rev;
    }
    static int sum(int i){
        int sum=0;
        while(i>0){
            int digit=i%10;
            sum=sum+digit;
            i=i/10;
        }
        return sum;
    }
    static int count(int i){
        int count=0;
        while(i>0){
            i=i/10;
            count++;
        }
        return count;
    }
    static void print(int i){
        while(i>0){
            int digit=i%10;
            System.out.print(digit+" ");
            i=i/10;
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("digits in the given number are: ");
        print(n);
        System.out.println();
        System.out.println("there are total "+count(n)+" digits in the given number");
        count(n);
        System.out.println("Sum of digits of "+n+" is: "+sum(n));
        System.out.println(n +" after reversal becomes: "+rev(n));
        if(checkPalindrome(n)){
            System.out.println(n+" is a palindrome");
        }
        else{
            System.out.println(n+" is not a palindrome");
        }
        if(isPrime(n)){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is a not prime number");
        }
    }
}