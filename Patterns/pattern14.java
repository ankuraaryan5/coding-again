import java.util.*;
public class pattern14{
    public static void main(String[] args){
        System.out.print("enter n: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}