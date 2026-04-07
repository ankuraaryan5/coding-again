//inverted pyramid
import java.util.*;
public class InvertedPyramid {
    public static void main(String[] args) {
      // inverted pyramid
      int n=5;
      for(int i=n;i>0;i--){
        for(int j=0;j<=n-i-1;j++){
          System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
}