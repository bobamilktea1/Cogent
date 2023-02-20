package CodePracSet1;

public class code {
	//Find bigger num among two
	void bigger(int x, int y) {
		if (x > y) {
		System.out.println(x);
		} else {
			System.out.println(y);
		}
	}
	
	//Swap two number 
	void swap(int x, int y) {
		System.out.println("Before swapping: " + x);
		int temp = y;
		x = y;
		y = temp;
		System.out.println("After swapping: " + x);
		
	}
	
	//Swap without extra variable
	void swap1(int x, int y) {
		System.out.println("Before swapping: " + x);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping: " + x);
	}	
	
	//Check number is even or odd using ternary operator
	void check(int num) {
		String result = (num % 2 == 0) ? num + " is even" : num + " is odd";
		System.out.println(result);
	}
	
	//Find biggest num of three
	int biggest(int x, int y, int z) {
	//int: return int here
		return Math.max(Math.max(x, y), z);
	}
	
	//Check character is a vowel or a consonant
	void checkCharacter(char ch) {
		String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? ch + " is a vowel" : ch + " is a consonant";
        System.out.println(result);
	}
	
	//Q1 Q2 I can't write them by myself

}

