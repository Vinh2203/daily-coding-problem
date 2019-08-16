package q1.solution;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductOfList {
	
	private List<Integer> list;
	
	public ProductOfList(List<Integer> list) {
		this.list = list;
	}

	public List<Integer> sumOfList(){
		
		List<Integer> listResult = new LinkedList<>();
		int productAll = this.list.stream().reduce((a,b) -> a * b).get();
		listResult = this.list.stream().map(i -> productAll/i).collect(Collectors.toList());
		
		return listResult;
	}
}
