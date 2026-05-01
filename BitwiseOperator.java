public class BitwiseOperator {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(~b);
        // System.out.println(a<<b);//a<<b==a*2^b
        // for (int i = 1; i <= 32; i++) {
        //     a=a<<1;
        //     System.out.println(a);
        // }
        // System.out.println(a>>b);//a>>b=a/2^b
        // int n=100;
        // for (int i = 1; i <= 10; i++) {
        //     n=n>>1;
        //     System.out.println(n);
        // }
        //unsigned right shift        
// 
// 
// 
//         
        int n=16;
        // if (n%2==0) {
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }
        if ((n&1)==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        int count=0;
        while (n!=0) {
            if ((n&1)!=0) {
                count++;
            }
            n=n>>1;
        }
        
        System.out.println("No. of set bits = "+ count);
        // power of two
        if (count%2!=0) {
            System.out.println("it is a power of 2");
        }
        else{
            System.out.println("not a power of two");
        }
        //OR
        if ((n&(n-1))==0) {
            System.out.println("it is a power of two");
        }
        else{
            System.out.println("not a power of two");
        }
        // swap using xor
        int i=4;
        int j=5;
        i=i^j;
        j=j^i;
        i=i^j;
        System.out.println(i);
        System.out.println(j);
        // find unique element others appear twice
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR all elements
        }
        System.out.println("Unique element is: " + result); 
        // remove last bit
        int l=10;
        System.out.println(l&(l-1));
        // get last set bit
        System.out.println(l&-l);
    }
}