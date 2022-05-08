// Prompt: Write function that, given a positive integer N, returns the length of its longest binary gap.
	// The function should return 0 if N doesn't contain a binary gap.
import java.util.Stack;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class BinaryGap {
    public int binary_gap(int N) {
        // write your code in Java SE 8
        String bin_rep = Integer.toBinaryString(N);
        Stack<Integer> stack = new Stack<Integer>();
        String[] chars = bin_rep.split(""); // now this should only be populated with 0 or 1
        int max = 0;

        for(String bin_char : chars) {
            if(bin_char.equals("0")) {
                stack.push(0);
            }
            else{
                int j = stack.size();
                if(j > max){
                    max = j;
                }
                stack.clear();
            }
        }
        return max;
    }
}
