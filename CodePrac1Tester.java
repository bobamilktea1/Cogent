package CodePracSet1;

public class CodePrac1Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		code b = new code();
		b.bigger(50, 100);
		
		code s = new code();
		s.swap(50,100);
		
		code sn = new code();
		sn.swap1(50, 100);
		
		code c = new code();
		c.check(5);
		c.check(10);
		
		code bn = new code();
		System.out.println("The largest number is: " + bn.biggest(5, 10, 15));
		
		code cc = new code();
		cc.checkCharacter('a');
        cc.checkCharacter('b');
        cc.checkCharacter('e');
        cc.checkCharacter('y');
    }
}
