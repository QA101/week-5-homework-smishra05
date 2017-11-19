import java.util.Scanner;
public class StringHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an input string ");
		String inputstr = input.next();
		System.out.println("The count is "+Codecount(inputstr));
		System.out.print("Enter 2 strings ");
		String input1 = input.next();
		String input2 = input.next();
		System.out.println("The result of matching is "+ Match2Strings(input1,input2));
		System.out.print("Enter a string of even length ");
		String input3 = input.next();
		System.out.println("The first half of string is "+ FirstHalf(input3));
		System.out.print("Enter a string to print its reverse ");
		input.nextLine();
		String input4 = input.nextLine();
		String revstring = Reverse(input4);
		System.out.println("The reverse of the string is "+ revstring);
		input.close();
	}
	
	
	/*
	 * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
		countCode("aaacodebbb") â†’ 1
		countCode("codexxcode") â†’ 2
		countCode("cozexxcope") â†’ 2
	 */
	public static int Codecount(String input)
	{
		int count=0;
		
		for(int i=0;i<input.length();i++)
		{
			if((i+3<input.length())&&input.charAt(i)=='c'&&input.charAt(i+1)=='o'&&input.charAt(i+3)=='e')
			{
				count++;
			}
		}
		return count;
		
	}
	/*
	2. Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

			endOther("Hiabc", "abc") → true
			endOther("AbC", "HiaBc") → true
			endOther("abc", "abXabc") → true
	*/
	public static boolean Match2Strings(String input1,String input2)
	{
		//convert both to same cases
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		if(input1.endsWith(input2)||input2.endsWith(input1))
		return true;
		else
		return false;
				
	}
	/*
	 * 3. Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") â†’ "Woo"
firstHalf("HelloThere") â†’ "Hello"
firstHalf("abcdef") â†’ "abc"
	 */
	public static String FirstHalf(String input3) 
	{
		// TODO Auto-generated method stub
		String firsthalf = "";
		for(int i=0;i<(input3.length()/2);i++)
		{
			firsthalf = input3.substring(0, (input3.length()/2));
		}
		return firsthalf;
	}

/*
4. Reverse a string
reverseString(â€œHello thereâ€�) > â€œereht olleHâ€� 
reverseString(â€œSeattle is coolâ€�) > â€œlooc si elttaeSâ€�
reverseString(â€œI love Javaâ€�) > â€œavaJ evol Iâ€�
*/
	
	public static String Reverse(String input4) {
		// TODO Auto-generated method stub
		        int len = input4.length();
		        char[] tempCharArray = new char[len];
		        char[] charArray = new char[len];
		        
		        // put original string in an 
		        // array of chars
		        for (int i = 0; i < len; i++) {
		            tempCharArray[i] = 
		                input4.charAt(i);
		        } 
		        
		        // reverse array of chars
		        for (int j = 0; j < len; j++) {
		            charArray[j] = tempCharArray[len - 1 - j];
		        }
		        
		        String reverseString = new String(charArray);
		        return reverseString;
		    }
	}

