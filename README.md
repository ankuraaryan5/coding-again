# coding-again

# binary-search-code
function binarySearch(arr, target){
    n=arr.length-1;
    low = 0;
    high=n;
    iteration=0;
    while (low<=high){
        iteration++;
        mid=low+(high-low)/2;
        if(target<arr[mid]){
            high=mid-1;
            console.log("updating high = ", high)
        }
        else if(target>arr[mid]){
            low=mid+1;
            console.log("updating low = ", low)
        }
        else{
            console.log("fount it = ", mid)
            return mid
        }
    }
    console.log("Iterations:", iteration);
    return -1
}
binarySearch([1,2,3,7,9], 7)

# linear-search
function linearSearch(arr, target){
    n=arr.length;
    iteration=0
    for(i=0;i<n;i++){
        iteration++;
        if(arr[i]==target){
            console.log("found it at",i);
            return i;
        }
    }
    console.log("Iterations:", iteration);
    return -1;
}
linearSearch([1,2,3,7,9], 7)
