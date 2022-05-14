/*
	PROMPT:
		Scenario:
			A DNA sequence can be represented as a string consisting of the letters A, C, G and T,
			which correspond to the types of successive nucleotides in the sequence.
			Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively.
			You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?

			The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters.
			There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers.
			The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).
		
		Conditions:
			N is an integer within the range [1..100,000];
        		M is an integer within the range [1..50,000];
        		each element of arrays P and Q is an integer within the range [0..N - 1];
        		P[K] ≤ Q[K], where 0 ≤ K < M;
        		string S consists only of upper-case English letters A, C, G, T.

		Write a function that:
			given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers,
			returns an array consisting of M integers specifying the consecutive answers to all queries.



*/

/*
	Solution goes here:
*/



// re-look over this

class GenomicRangeQuery {

	public int[] genomic_range_query(String S, int[] P, int[] Q) {
    
	    int M = P.length;
	    int N = S.length();
    
	    int[] min_factors = new int[M];
	    
	    int[][] tmp = new int[N][4];
    
	    // fill out table of occurances based on position in S
	    for(int i = 0; i < tmp.length; i++){
            char ch = S.charAt(i);
            switch (ch) {
            case 'A':
                tmp[i][0]++;
                break;
            case 'C':
                tmp[i][1]++;
                break;
            case 'G':
                tmp[i][2]++;
                break;
            case 'T':
                tmp[i][3]++;
                break;
            default:
                break;
            }
	    }

        // Compute prefix sum
        int[][] occurs = new int[N + 1][4];
        for (int k = 1; k < N + 1; k++) {
            for (int j = 0; j < 4; j++) {
                occurs[k][j] = occurs[k - 1][j] + tmp[k - 1][j];
            }
        }

	    for(int i = 0; i < M; i++){
            int P_index = P[i]; // both limited from 0 -> N - 1
            int Q_index = Q[i];
            // now, we have to find the minimum of what changed in the occurances table between these values
            for(int j = 0; j < 4; j++){
                if(occurs[Q_index + 1][j] - occurs[P_index][j] > 0){
                    min_factors[i] = j + 1;
                    break;
                }
            }
	    }
	    return min_factors;
	}
}





/*
	Detected time complexity: O(N + M)

*/

