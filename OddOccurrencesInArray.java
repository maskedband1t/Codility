/*
	PROMPT:
	A non-empty array A consisting of N integers is given. 
	The array contains an odd number of elements, and each element of the array can be paired
	with another element that has the same value, except for one element that is left unpaired.
	
	Write a function that:
	given an array A consisting of N integers fulfilling the above conditions, 
	returns the value of the unpaired element.
*/
import java.util.HashSet;


class OddOccurrencesInArray {
    public int odd_occurrences_in_array(int[] A) {
        // array specified as non-empty
        
        /*
            use hashset, if element doesnt exist, add to set, if element exists, remove from set.
            at end, keep track of what remains in set
        */
        HashSet<Integer> set = new HashSet<Integer>();
        int length = A.length;

        for(int i = 0; i < length; i++){
            int tmp = A[i]; // access only once, preference
            if (set.contains(tmp)) {
                set.remove(tmp);
            }
            else {
                set.add(tmp);
            }
        }
        
        for(int s : set){
            return s; // only 1 value expected in set
        }
        return 0; // should never reach here
    }
}

/*
	Detected time complexity:
	O(N) or O(N*log(N)) -> 100%
*/

