package q3.solution;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution3 {
	
	public int getNumberIntegerMissing(List<Integer> list) {
		int result = 0;
		
		//Get Value max+1
		int max = list.stream().mapToInt(v -> v)
			      .max().orElseThrow(NoSuchElementException::new) + 1;
		
		// Construct a list from 1 -> max
		List<Integer> listComplet = IntStream.range(1, max).boxed().collect(Collectors.toList());
		
		//Get list number missing in list
		listComplet.removeAll(list);
		
		//Get min number in list missing
		result = listComplet.stream().mapToInt(v -> v)
			      .min().orElseThrow(NoSuchElementException::new);
		
		return result;
	}

}
