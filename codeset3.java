package CodePracSet3;

import java.util.*;

public class codeset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//1. Remove All occurrences of given character from String?(Assume Accordingly)
				String str = "hello world";
				char ch = 'l';
				String result = str.replace(String.valueOf(ch), "");
				System.out.println(result); // "heo word"
		
		//2. How to swap 2 numbers without using 3rd variable?
				int a = 5;
				int b = 10;
				a = a + b;
				b = a - b;
				a = a - b;
				System.out.println("a = " + a + ", b = " + b); // "a = 10, b = 5"
		//3. How to remove whitespaces from a string?
				String str1 = "  hello  world  ";
				String result1 = str1.replaceAll("\\s", "");
				System.out.println(result1); // "helloworld"
				
		//4. Check if two arrays contains same elements?
				int[] arr1 = {1, 2, 3};
				int[] arr2 = {3, 2, 1};
				boolean result2 = Arrays.equals(new HashSet<>(Arrays.asList(arr1)).toArray(),
				                               new HashSet<>(Arrays.asList(arr2)).toArray());
				System.out.println(result); // true
				
		//5. Find 3rd largest element in an integer array?
				int[] arr = {10, 20, 30, 40, 50};
				Arrays.sort(arr);
				int thirdLargest = arr[arr.length - 3];
				System.out.println(thirdLargest); // 30
				
		//6. How to sort HashMap by using values?
				Map<String, Integer> map = new HashMap<>();
				map.put("a", 3);
				map.put("b", 1);
				map.put("c", 2);
				Comparator<String> valueComparator = new Comparator<String>() {
				    public int compare(String s1, String s2) {
				        Integer v1 = map.get(s1);
				        Integer v2 = map.get(s2);
				        return v1.compareTo(v2);
				    }
				};

				Map<String, Integer> sortedMap = new TreeMap<>(valueComparator);
				sortedMap.putAll(map);

				System.out.println(sortedMap);				
	}	
}
