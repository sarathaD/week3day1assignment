package Week3day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		String text="we learn java basics as part of java session oF learn in Java week1";
        String[] split= text.split(" ");
        int count =0;
        
        for(int i=0;i<split.length;i++) {
            for(int j=i+1;j<split.length;j++) {
                if(split[i].equalsIgnoreCase(split[j])) {
                    split[j]="";
                    count++;
                }
            }
        }
        if(count>1) {
            for(int k=0;k<split.length;k++) {
                System.out.print(split[k]+" ");
            }
        }

	}
}

