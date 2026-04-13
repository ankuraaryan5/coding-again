import java.util.*;
public class String3{
    static void printString(String str){
        int n=str.length();
        for(int i=0; i<n;i++){
            char ch= str.charAt(i);
            System.out.print(ch);
        }
        System.out.println();
    }
    static int countLength(String str){
        int count=0;
        // for(char ch:str){
        //     count++;
        // }
        // for(char ch:str.toCharArray()){
        //     count++;
        // }
        // OR
        char[] arr=str.toCharArray();
        count=arr.length;
        return count;
    }
    static int vowelCount(String str){
        int count=0;
        for(char ch:str.toLowerCase().toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    static String reverseStr(String str){
        // StringBuilder rev=new StringBuilder();
        // int n=str.length()-1;
        // for(int i=n;i>=0;i--){
        //     rev.append(str.charAt(i));
        // }
        // return rev.toString();
        //OR
        int n=str.length();
        String newStr="";
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            newStr=newStr+ch;
        }
        return newStr;
    }
    static boolean isPalindrome(String str){
        // int n=str.length();
        // String newStr="";
        // for(int i=n-1;i>=0;i--){
        //     char ch=str.charAt(i);
        //     newStr=newStr+ch;
        // }
        // // return str==newStr;
        // return str.equals(newStr);
        //OR
        String newStr=reverseStr(str);
        return newStr.equals(str);
    }
    public static void main(String[] args){
        System.out.println("ENter your string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printString(str);
        System.out.println("length of string is: "+countLength(str));
        System.out.println("coutn of vowels in str is: "+vowelCount(str));
        System.out.println("String after reversal is: "+ reverseStr(str));
        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
    }
}