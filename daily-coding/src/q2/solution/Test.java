package q2.solution;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int cpt  = 0; cpt <= 7; cpt++) {
			list.add(cpt);
		}
		
		UtilsList utilsList = new UtilsList(list);
       System.out.println(utilsList.isSumFromNumberInList(8));
	}

}
