public int findTarget(int[] arr, int target) {
			    //1.  low 指的是 下边界， high 是上限， 扩倍然后判断边界！
			    int indexlow = 0;
			    int indexhigh = 1; 
			    
			    // 2. 扩倍   [ 1 2 3 6 7 ]
			    try{
			    	while(arr[indexhigh] < target) { 
				        indexlow = indexhigh; 
				        indexhigh = indexhigh * 2;   
				    }
			    } catch(Exception e) {
			    	// do nothing 
			    }
			    while(indexlow + 1 < indexhigh) {
					 try{   
					    // 模板binary search 
					    	int mid = indexlow + (indexhigh - indexlow) / 2; 
					        if(arr[mid] == target) {
					            return mid;
					        } else if(arr[mid] < target){
					        	indexlow = mid;
					        } else {
					        	indexhigh = mid;
					        }
					    
					 } catch(Exception e){
						 indexhigh = indexlow + (indexhigh - indexlow) / 2; 
					 }
			    }
			    //   返回index  
			    return arr[indexlow] == target ? (indexlow) : (indexhigh); 
}
