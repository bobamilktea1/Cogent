package CodePracSet2;
import java.util.*; 

public class CodingSet2 {
	
	//1. Find all substring of a string
	public static void main(String[] args) {
		String s = "hello";
		int n = s.length();
		for (int i = 0; i<n;i++) {
			for (int j = i+1; j<=n;j++) {
				System.out.println(s.substring(i,j));
			}
		}
		
	//2. Print reverse string		
        String s1 = "hello";
        int n1 = s1.length();
        String rev = "";     
        
        // Loop to traverse the original string from end to start
        for(int i=n-1; i>=0; i--) {  
        	
            // Append each character to the reverse string
            rev = rev + s1.charAt(i);
        }       
        System.out.println("Reverse string: " + rev);
	
	
	//3. Check Given No is palindrome or Not
        String s2, rev1 = ""; // Objects of String class  
        Scanner in = new Scanner(System.in);   
        System.out.println("Enter a string/number: ");  
        s2 = in.nextLine();   
        int length = s2.length();   
        for ( int i = length - 1; i >= 0; i-- )  
           rev1 = rev1 + s2.charAt(i);  
        if (s2.equals(rev1))  
           System.out.println("This string/number is a palindrome.");  
        else  
           System.out.println("This string/number is not a palindrome.");   
	
      //4. How to add two matrices
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,1,1},{1,1,1},{1,1,1}};
        int c[][]=new int[3][3];

        for(int i = 0;i<3;i++){
           for(int j = 0;j<3;j++){
              c[i][j] = a[i][j]+b[i][j];
              System.out.print(c[i][j]+" ");
           } System.out.println();//new line    
            
        }
        
       //5. How to multiply two matrix in java Program  
        int d[][]={{1,2,3},{4,5,6},{7,8,9}};
        int e[][]={{1,1,1},{1,1,1},{1,1,1}};
        int f[][]=new int[3][3];

        for(int i = 0;i<3;i++){
           for(int j = 0;j<3;j++){
              f[i][j] = d[i][j]*e[i][j];
              System.out.print(f[i][j]+" ");
           }
           System.out.println();
        }
        
        //6. How to replace string with another string in java Program
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a string: ");
        	String str = sc.nextLine();
        	System.out.print("Enter the substring to replace: ");
        	String substr = sc.nextLine();
        	System.out.print("Enter the replacement string: ");
        	String replacement = sc.nextLine();
        	String newStr = str.replace(substr, replacement);
        	System.out.println("The new string is: " + newStr);
        //7. How to Generate random number in java Program
        	Scanner scc = new Scanner(System.in);
            System.out.print("Enter the lower bound: ");
            int min = scc.nextInt();
            System.out.print("Enter the upper bound: ");
            int max = scc.nextInt();
            int range = max - min + 1;
            int rand = (int) (Math.random() * range) + min;
            System.out.println("The random number is: " + rand);
        //8. Binary search Program in java
        //9. How to create Method Overriding program in java	
	}
	}
