package q5.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Solution5 solution = new Solution5();
		
		Set<String> set = new HashSet<String>(Arrays.asList("de","deal","dae","deaog","dss"));
		
		System.out.println(solution.getListSamePrefix(set, "de"));
	}

}
