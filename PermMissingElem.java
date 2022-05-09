/*
	PROMPT:
		Scenario:
			An array A consisting of N different integers is given. 
			The array contains integers in the range [1..(N + 1)],
			which means that exactly one element is missing.
		Conditions:
			N is an integer within the range [0..100,000];
        		the elements of A are all distinct;
        		each element of array A is an integer within the range [1..(N + 1)].


		Write a function that:
			given an array A, returns the value of the missing element.

*/

/*
	Solution goes here:
*/



class PermMissingElem {
	public int perm_missing_elem(int[] A) {
	    
	    // sum of N sequential numbers will always be [n * (n + 1)] // 2
	    // idea is to take the expected sum and subtract the actual sum to find the missing number
	    
	    // long data type used to avoid overflow from given input range
	    long max = A.length + 1;
    
	    long expected_sum = ((max + 1) * max) / 2;
	    long actual_sum = 0;
    
	    for(int i = 0; i < A.length; i++){
		actual_sum += A[i];
	    }
	    // cast back to int as result will not be susceptible to overflow
	    return (int)(expected_sum - actual_sum);
	}
    }
    
    



/*
	Detected time complexity: O(N) or O(N * log(N))

*/

