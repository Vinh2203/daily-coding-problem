package q5.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution5 {
	
	public List<String> getListSamePrefix(Set<String> set, String prefix){
		List<String> listSamePrefix = new ArrayList<>();
		int sizePrefix = prefix.length();
		for(String tmp : set) {
			if(tmp.startsWith(prefix)) {
				listSamePrefix.add(tmp);
			}
		}
		
		return listSamePrefix;
	}

}
