/*
	PROMPT:
		Scenario:
			N/A
		Conditions:
			N is an integer within the range [0..100,000];
        		each element of array A is an integer within the range [−1,000,000..1,000,000].


		Write a function that:
			given an array A consisting of N integers, 
			returns the number of distinct values in array A.

*/

/*
	Solution goes here:
*/
import java.util.HashSet;
class Distinct {
    public int distinct(int[] A) {
        
        int size = 0;
        int length = A.length;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < length; i++){
            int curr = A[i];
            if(!set.contains(curr)){
                set.add(curr);
            }
        }
        size = set.size();
        return size;
    }
}


/*
	Detected time complexity: O(N*log(N)) or O(N)

*/

