import java.util.*;
public class StringHW{
    static String upperCase(String str){
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(ch>='a'&&ch<='z'){
                ch=(char) (ch-32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    static int countConsonant(String str){
        int count=0;
        for(char ch:str.toLowerCase().toCharArray()){
            if((ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&!Character.isWhitespace(ch))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("No. of consonants in string is: "+countConsonant(str));
        System.out.println("Converting to uppercases: "+upperCase(str));
    }
}