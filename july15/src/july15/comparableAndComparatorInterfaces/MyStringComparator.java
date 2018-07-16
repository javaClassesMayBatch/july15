package july15.comparableAndComparatorInterfaces;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()){
			return -1;
		}else if(s1.length() > s2.length()){
			return 1;
		}else{
			//return s1.compareTo(s2);
			//return s2.compareTo(s1); //for reverse sort
			return s1.compareToIgnoreCase(s2); //for case insensitive sort
		}
	}

}
