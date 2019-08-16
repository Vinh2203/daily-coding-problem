package q2.solution;

import java.util.List;

public class UtilsList {

	private List<Integer> list;
	
	/**
	 * instancie liste et taille
	 * @param list
	 * @param taille
	 */
	public UtilsList(List<Integer> list) {
		this.list = list;
	}
	
	/** 
	 * Ask Daily Coding problem
	 * @param sum
	 * @return
	 */
	public boolean isSumFromNumberInList(int sum) {
		
		for(int tmp :  this.list) {
			if(tmp > sum) {
				continue;
			}else {
				int diff = sum - tmp;
				if(this.list.indexOf(diff) != -1 && this.list.indexOf(diff) != this.list.indexOf(tmp)) {
					System.out.println("the two number is : "+ tmp +" + "+ diff);
					return true;
				}	
			}
		}
		
		return false;
	}
}
