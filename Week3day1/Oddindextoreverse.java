package Week3day1;

public class Oddindextoreverse {

	public static void main(String[] args) {
		String test = "changeme";
		char[] arr = test.toLowerCase().toCharArray();
		boolean makeUppercase = true;
	    for (int i=0; i<arr.length; i++) {
	        if(makeUppercase && Character.isLetter(arr[i])) {
	            arr[i] = Character.toUpperCase(arr[i]);
	            makeUppercase = false;
	        } else if (!makeUppercase && Character.isLetter(arr[i])) {
	            makeUppercase = true;
	        }
	    }
	    String convertedString = String.valueOf(arr);
	    System.out.println(convertedString);
	}
}
/*
Pseudo Code

* Declare String Input as Follow
 
* String test = "changeme";

* a) Convert the String to character array

* b) Traverse through each character (using loop)

* c)find the odd index within the loop (use mod operator)

* d)within the loop, change the character to uppercase, if the index is odd else don't change
 
*/;