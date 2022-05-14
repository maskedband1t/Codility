/*
	PROMPT:
		Scenario:
			pure math solution, not realistic interview question.
		Conditions:
			A and B are integers within the range [0..2,000,000,000];
        		K is an integer within the range [1..2,000,000,000];
        		A ≤ B.
	
		Write a function that:
			given three integers A, B and K, 
			returns the number of integers within the range [A..B] that are divisible by K, i.e.:
			{ i : A ≤ i ≤ B, i mod K = 0 }
*/

/*
	Solution goes here:
*/

class CountDiv {
	/*
         returns the multiples in interval [0,B] - multiples in [0,A], 
         and if A is also itself a multiple, adds 1
         */

	public int count_div(int A, int B, int K){
		return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
	}
}

/*
	Detected time complexity: O(1)

*/

