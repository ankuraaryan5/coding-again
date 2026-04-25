# What is a time complexity?
time taken by your code to solve a particular problem depending on the input size

# why time complexity?
helps in writing better faster and efficient code

# What is space complexity?
space/memory taken by your code to solve a particular problem depending on the input size

# units to represent complexity
1. Big-O --> worst case --> upper bound
2. Theta --> Avg case
3. Omega --> best case --> lower bound

# Increasing order of complexity
- O(1)
<!-- 
int x = 10;
System.out.print(x); 
-->

- O(log n)
<!-- 
while(n>1){
    n=n/2;
}
ex. binary search
 -->

- O(√n)
- O(n)
<!-- 
int [] arr = new int[n];
for(int i=0; i<n;i++){
    System.out.println(i)
} 
-->

- O(n log n)
- O(n²)
<!-- 
    int [][] arr = new int[n][n];
  for(int i=0; i<n;i++){
    for(int j=0;j<n;j++){
        System.out.println(i+" , "+j);
    }
}   
 -->

- O(n³)
- O(2ⁿ)
- O(n!)
- O(nⁿ)

# What is auxillary space?
Auxiliary space refers to the extra or temporary memory that an algorithm uses while executing, beyond the input data itself.

Example: 
int sumArray(int[] arr) {
    int sum = 0; // auxiliary space here is constant (O(1)) because only one extra variable is used.
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}



# Time vs Space tradeoff
faster code uses more memory 
less memory uses more time

# what is time complexity of int[] arr= new int[n]; ?

Time Complexity (allocation only): O(1)
Because the system just reserves a contiguous block of memory of size n in one step, regardless of the value of n

Space Complexity: O(n)
