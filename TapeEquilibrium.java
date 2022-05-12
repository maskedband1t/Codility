/*
	PROMPT:
		Scenario:
		A non-empty array A consisting of N integers is given. 
		Array A represents numbers on a tape.
		Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: 
			A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
		
		The difference between the two parts is the value of: 
			|(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
		In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
		
		Conditions:
			N is an integer within the range [2..100,000];
        		each element of array A is an integer within the range [−1,000..1,000].


		Write a function that:
			given a non-empty array A of N integers, 
			returns the minimal difference that can be achieved.
*/

/*
	Solution goes here:
*/



import java.util.HashMap;
import java.lang.Math;

class TapeEquilibrium {
    public int tape_equilibrium(int[] A) {
        int min = Integer.MAX_VALUE;
        int length = A.length;
        int total = 0;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < length; i++){
            total += A[i]; // left sum will include the value at this index
            map.put(i, total); // map contains key: index , value: left sum at this index
        }

        for(int i = 0; i < length - 1; i++){ // last index can be ignored
            int sum_left = map.get(i);
            int sum_right = total - sum_left;
            int tmp = Math.abs(sum_left - sum_right);
            if(tmp < min){
                min = tmp;
            }
        }
        return min;
    }
}


/*
	Detected time complexity: O(N)

*/

