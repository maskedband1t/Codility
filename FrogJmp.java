/*
	PROMPT:
		Scenario:
			A small frog wants to get to the other side of the road. 
			The frog is currently located at position X and wants to get to a position greater than or equal to Y. 
			The small frog always jumps a fixed distance, D.
			Count the minimal number of jumps that the small frog must perform to reach its target.	
		Conditions:
			X, Y and D are integers within the range [1..1,000,000,000];
        		X ≤ Y.

		Write a function that:
			given three integers X, Y and D, 
			returns the minimal number of jumps from position X to a position equal to or greater than Y.
*/

/*
	Solution goes here:
*/

class FrogJmp {
	public int frog_jmp(int X, int Y, int D) {
	    int to_go = Y - X;
	    
	    if(to_go == 0){
		return 0;
	    }
    
	    int hops = 0;
	    int remainder = to_go % D;
	    if(remainder > 0){
		hops+=1;
	    }
	    hops += to_go / D; // minimum hops
	    return hops;
	}
    }


/*
	Detected time complexity: O(1)

*/

