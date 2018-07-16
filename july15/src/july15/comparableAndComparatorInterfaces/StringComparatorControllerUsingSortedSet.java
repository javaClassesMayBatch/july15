package july15.comparableAndComparatorInterfaces;

import java.util.SortedSet;
import java.util.TreeSet;

public class StringComparatorControllerUsingSortedSet {
	
	public static void main(String a[]){		
		SortedSet<String> s1 = new TreeSet<String>(new MyStringComparator());
		s1.add("AAA");
		System.out.println(s1.add("aa"));//aa
		System.out.println(s1.add("Aa"));//aa
		System.out.println(s1.add("aA"));//aa
		
		s1.add("aB");//aB
		s1.add("Ab");//aB
		s1.add("AB");//aB
		
		s1.add("Ba");
		s1.add("A");
		s1.add("B");
		s1.add("BB");
		s1.add("CC");
		s1.add("C");
		s1.add("BBB");
		System.out.println(s1);
		System.out.println("AAA".compareTo("ABC"));
	}

}
