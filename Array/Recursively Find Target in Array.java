public boolean findTarget(int[] arr, int target) {
    if(arr == null || arr.length == 0){
        return false;
    }
    
    int index = 0;
    return helper(arr, target, index);  // helper function which keeps track of index 

}

public boolean helper(int[] arr, int target, int index){
    if(index == arr.length){    // reach the end of the array
        return false;
    }
    
    if(arr[index] == target){
        return true;
    }
    helper(arr, target, ++index);   // If we didn't find target number at current level, enter next level by increasing index

}
