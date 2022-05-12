/*
	PROMPT:
		Scenario:
			A non-empty array A consisting of N integers is given.
			A permutation is a sequence containing each element from 1 to N once, and only once.
		Conditions:
			N is an integer within the range [1..100,000];
        		each element of array A is an integer within the range [1..1,000,000,000].


		Write a function that:
			given an array A, returns 1 if array A is a permutation and 0 if it is not.

*/

/*
	Solution goes here:
*/

import java.util.HashSet;

class PermCheck {
    public int perm_check(int[] A) {
        int length = A.length; // N
        int expected_sum = (length * (length + 1)) / 2;
        int sum = 0;
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < length; i++){
            int curr = A[i];
            if(set.contains(A[i]))  {return 0;}
            else {set.add(A[i]);}
            
            sum += curr;
        }
        if(sum != expected_sum){
            return 0;
        }


        return 1;
    }
}


/*
	Detected time complexity: O(N) or O(N * log(N))

*/

