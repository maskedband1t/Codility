/*
	PROMPT:
		Scenario:
			A non-empty array A consisting of N integers is given.
			The consecutive elements of array A represent consecutive cars on a road.

			Array A contains only 0s and/or 1s:
        			0 represents a car traveling east,
        			1 represents a car traveling west.

			The goal is to count passing cars.
			We say that a pair of cars (P, Q), where 0 ≤ P < Q < N,
			 is passing when P is traveling to the east and Q is traveling to the west.
		
		Conditions:
			N is an integer within the range [1..100,000];
        		each element of array A is an integer that can have one of the following values: 
												0, 1.


	
		Write a function that:
			given a non-empty array A of N integers, returns the number of pairs of passing cars.
			The function should return −1 if the number of pairs of passing cars
			 exceeds 1,000,000,000.

*/

/*
	Solution goes here:
*/




class PassingCars {
	public int passing_cars(int[] A) {
	    /*
	     going backwards, count the number of 1's (west-bound), 
	     and update pairs every time an east-bound car is encountered 
	     with the amount of west-bound cars previously encountered
	    */
    
	    int length = A.length;
	    long pairs = 0;
    
	    int west_count = 0;
	    int index = length - 1;
    
	    while(index >= 0){
		int curr = A[index];
		if(curr == 0){
		    pairs += west_count;
		}
		else{
		    west_count++;
		}
		index--;
	    }
	    if(pairs <= 1000000000){
		return (int)pairs;
	    }
	    return -1;
	}
    }
    
    


/*
	Detected time complexity: O(N)

*/

