package q1.solution;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		ProductOfList pl = new ProductOfList(list);
		System.out.println(pl.sumOfList().toString());
	}

}
