// bubble sort places the largest element in the lst place subsequently
public class BubbleSort {
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            boolean swapped=false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j+1]^arr[j];
                    arr[j]=arr[j]^arr[j+1];
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}