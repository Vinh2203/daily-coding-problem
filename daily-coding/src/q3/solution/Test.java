package q3.solution;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Solution3 solution = new Solution3();
		
		List<Integer> list = Arrays.asList(-1,-2,1,5,8,4,100);
		
		System.out.println(solution.getNumberIntegerMissing(list));
	}

}
