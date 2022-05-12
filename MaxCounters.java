/*
	PROMPT:
		Scenario:
			You are given N counters, initially set to 0,
			and you have two possible operations on them:
        			increase(X) − counter X is increased by 1,
        				max counter − all counters are set to the maximum value of any counter.

			A non-empty array A of M integers is given.
			This array represents consecutive operations:
        			if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
        			if A[K] = N + 1 then operation K is max counter.

	
		Conditions:
			N and M are integers within the range [1..100,000];
        		each element of array A is an integer within the range [1..N + 1].

		Write a function that:
			given an integer N and a non-empty array A consisting of M integers,
			returns a sequence of integers representing the values of the counters	

*/

/*
	Solution goes here:
*/


// TAKEAWAY: if you have to update all values in collection to same value,
// minimize operations by saving this update until another need to update, or last possible moment
class MaxCounters {
    public int[] max_counters(int N, int[] A) {
        int num_operations = A.length;
        int[] counter_values = new int[N]; // initialized to all zeroes
        
        int max_value = 0;
        int min_value = 0;

        for(int i = 1; i <= num_operations; i++){
            // perform each operation to the counter_values array
            int operation = A[i - 1];

            if(operation < (N + 1)){

                if(counter_values[operation - 1] < min_value){
                    counter_values[operation - 1] = min_value + 1;
                }

                else{counter_values[operation - 1] += 1;}
                int tmp = counter_values[operation - 1];

                if(tmp > max_value){
                    max_value = tmp;
                }
            }
            else{ // sweep all values to max value
                min_value = max_value;
            }
        }
        // deal with any values that didnt get updated post-sweep
        for(int i = 1; i <= N; i++){
            if(counter_values[i - 1] < min_value){
                counter_values[i - 1] = min_value;
            }
        }
        return counter_values;
    }
}




/*
	Detected time complexity:

*/

