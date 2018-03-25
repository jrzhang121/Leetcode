// You are climbing a stair case. It takes n steps to reach to the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Note: Given n will be a positive integer.


    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int cur = 0;
        int pre1 = 2;
        int pre2 = 1;
        
        for(int i = 3; i <= n; i++){
            cur = pre1 + pre2;   // Get the number of ways of getting to current stair
            pre1 = pre2;    // Update previous stairs
            pre2 = cur;
        }
        
        return cur;
    }
    
    
    
    //         if(n == 1){
//             return 1;
//         }
        
//         if(n == 2){
//             return 2;
//         }
        
//         return climbStairs(n - 1) + climbStairs(n - 2);