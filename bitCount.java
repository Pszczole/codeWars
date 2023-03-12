/*
Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number.
You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class BitCounting {

	public static int countBits(int n){
		String binary = Integer.toBinaryString(n);
    Pattern pattern = Pattern.compile("1");
    Matcher matcher = pattern.matcher(binary);
    
    int count = 0;
    while (matcher.find()) {
    count++;
    }
    
    return count;
    
	}
	
}
