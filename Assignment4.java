package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Assignment4 {

	public static void main(String[] args) {

		countDuplicateCharacters("java");
		System.out.println();
		reverseArrayList();
		System.out.println();
		keyExistsInHash(2);
		System.out.println();
		mapToList();
		System.out.println();
		hashsetToObjectArray();
		System.out.println();
		treeSetHighAndLow();
		System.out.println();
		sortArrayList();
		System.out.println();
		getSetViewOfKeys();
	}

	public static void countDuplicateCharacters(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}

	public static void reverseArrayList() {
		List<String> l = new ArrayList<String>();
		l.add("Welcome");
		l.add("To");
		l.add("My");
		l.add("World");
		System.out.println("Before reversing here is the order " + l.toString());

		Collections.reverse(l);
		System.out.println("After reversing here is the order " + l);
	}

	public static void keyExistsInHash(int key) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Java");
		hm.put(2, "C");
		hm.put(3, "Python");
		System.out.println("Hash map is " + hm);
		Iterator<Map.Entry<Integer, String>> iterator = hm.entrySet().iterator();
		boolean isKeyPresent = false;
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			if (key == entry.getKey()) {

				isKeyPresent = true;
			}

		}
		System.out.println(key + "   " + isKeyPresent);
	}

	public static void mapToList() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Java");
		hm.put(2, "C");
		hm.put(3, "Python");
		System.out.println(hm.keySet());
		// System.out.println(hm.values());
		ArrayList<String> valueList = new ArrayList<String>(hm.values());
		System.out.println(valueList);
	}

	public static void hashsetToObjectArray() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		System.out.println("Before copying to object array " + hs);
		Object[] arr = hs.toArray();
		for (Object object : arr) {

			System.out.println(object);
		}

	}

	public static void treeSetHighAndLow() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(11);
		ts.add(99);
		ts.add(1);
		ts.add(0);
		System.out.println("lowest of tree set is " + ts.first());
		System.out.println("highest of tree set is " + ts.last());
	}

	public static void sortArrayList() {
		ArrayList<String> str = new ArrayList<String>();
		str.add("J");
		str.add("A");
		str.add("V");
		str.add("A");
		System.out.println("Before sorting Array list of string is " + str);
		Collections.sort(str);
		System.out.println("After sorting Array list of string is " + str);

	}

	public static void getSetViewOfKeys() {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("1", "Hyderabad");
		ht.put("2", "Secunderabad");
		ht.put("3", "Rangareddy");
		ht.put("4", "Medchal");

		Set<String> st = ht.keySet();
		System.out.println("Getting keys from hashtable " + st);
	}

}
