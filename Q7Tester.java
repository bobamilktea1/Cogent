package CodePracSet3;

public class Q7Tester {

	public static void main(String[] args) {
        String expression1 = "()[]{}";
        System.out.println(codeset3Q7.isBalanced(expression1)); // true
        
        String expression2 = "(]";
        System.out.println(codeset3Q7.isBalanced(expression2)); // false
        
        String expression3 = "([)]";
        System.out.println(codeset3Q7.isBalanced(expression3)); // false
        
        String expression4 = "{()}[]";
        System.out.println(codeset3Q7.isBalanced(expression4)); // true
    }

}
