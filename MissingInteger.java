/*
	PROMPT:
		Scenario:
		
		Conditions:
			N is an integer within the range [1..100,000];
        		each element of array A is an integer within the range:
			 [−1,000,000..1,000,000].


		Write a function that:
			given an array A of N integers,
			returns the smallest positive integer (greater than 0) that does not occur in A

*/

/*
	Solution goes here:
*/

import java.util.HashSet;

class MissingInteger {
    public int missing_integer(int[] A) {
        int length = A.length;

        int min = 1;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < length; i++){
            int curr = A[i];
            
            if(!set.contains(curr)){
                if(curr > 0){ // only bother putting viable values in here (pos)
                    set.add(curr);
                }
            }    
        }
        for(int i = 0; i < length; i++){
            if(set.contains(min)){
                min++;
            }
        }
        return min;
    }
}




/*
	Detected time complexity: O(N) or O(N * log(N))

*/

