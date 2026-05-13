import java.util.Scanner;
import java.util.*;

public class ArrayBeginner {
    static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum / arr.length;
    }

    static void multiplyby10(int[] arr) {
        // for (int i : arr) {
        // i=i*10;
        // }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
        }
    }

    static boolean linearSearch(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    static int max(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > maxi) {
                maxi = i;
            }
        }
        return maxi;
        // return Math.max(0, 0);
    }

    static int[] getSum(int[] arr) {
        int posSum = 0;
        int negSum = 0;
        for (int i : arr) {
            if (i < 0) {
                negSum = negSum + i;
            } else {
                posSum = posSum + i;
            }
        }
        int ans[] = { posSum, negSum };
        return ans;
    }

    static int[] getZeroOneCount(int[] arr) {
        int zeroCnt = 0;
        int oneCnt = 0;
        for (int i : arr) {
            if (i == 0) {
                zeroCnt++;
            } else if (i == 1) {
                oneCnt++;
            }
        }
        return new int[] { zeroCnt, oneCnt };
    }

    static int unsorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return arr[i + 1];
            }
        }
        return -1;
    }

    static int[] swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            arr[i] = arr[i] ^ arr[i + 1];
            arr[i + 1] = arr[i + 1] ^ arr[i];
            arr[i] = arr[i] ^ arr[i + 1];
        }
        return arr;
    }

    static int[] swapExtreme(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[end] ^ arr[start];
            arr[start] = arr[start] ^ arr[end];
            start++;
            end--;
        }
        return arr;
    }

    static int[] intersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    intersection.add(i);
                }
            }
        }
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] arr ={-3,6,-8,7,-4};
        // int[] arr ={0,0,1,1,1,0,1,1,0};
        int[] arr = { 0, 1, 1, 32, 43, 87, 23, 98, 87 };
        System.out.println("average of array elements is " + getAverage(arr));
        // System.out.println("array after getting multiplied is ");
        // multiplyby10(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        // System.out.println("enter element to search");
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // if (linearSearch(arr, n)) {
        // System.out.println(n+" is present in array");
        // }
        // else{
        // System.out.println(n+" is not present in the array");
        // }
        System.out.println("maximum number in the array is " + max(arr));
        int ans[] = getSum(arr);
        System.out.println("sum of postive elements in the array is " + ans[0]);
        System.out.println("sum of negative elements in the array is " + ans[1]);
        int cnt[] = getZeroOneCount(arr);
        System.out.println("no. of zeros = " + cnt[0]);
        System.out.println("no. of ones =" + cnt[1]);
        System.out.println("first unsorted element is: " + unsorted(arr));
        System.out.println("array before swaps is");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        swapAlternate(arr);
        System.out.println("array after swaps is");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("array before swaps is");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        swapExtreme(arr);
        System.out.println("array after swaps is");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("array intersection elements are" + Arrays.toString(intersection(arr1, arr2)));
    }
}