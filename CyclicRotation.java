// PROMPT: Write a function: that, given an array A consisting of N integers and an integer K, 
         //returns the array A rotated K times.


class CyclicRotation {
	public int[] cyclic_rotation(int[] A, int K) {
	    int length = A.length;
	    int[] array = A;
	    
	    // when dealing with array parameters, you should always check if empty or null
	    if(array == null || length == 0){
		return A;
	    }
    
	    for(int i = 0; i < K; i++){
		
		int last = A[length - 1]; // last element in array currently
		for(int j = length - 1; j > 0; j--){
		    A[j] = A[j - 1];
		}   
		A[0] = last;
		// completed one rotation
	    }
	    
	    return array;
	}
    }
    
    