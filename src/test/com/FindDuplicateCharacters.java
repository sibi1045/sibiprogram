package test.com;

import java.util.*;

public class FindDuplicateCharacters {
	public static void findDuplicateCharacters(String str) {
	   
	    Map<Character, Integer> charFreqMap = new HashMap<>();	    
	    char[] chars = str.toCharArray();
	    for (char c : chars) {	  
	        if (charFreqMap.containsKey(c)) {
	            charFreqMap.put(c, charFreqMap.get(c) + 1);
	        } 	 
	        else {
	            charFreqMap.put(c, 1);
	        }
	    }
	 
	    for (Map.Entry<Character, Integer> entry : charFreqMap.entrySet()) {
	        if (entry.getValue() > 1) {
	            System.out.println("Duplicate character: " + entry.getKey() + "=" + entry.getValue()+" times repeated ");
	        }
	    }
	}
	
	public static void main(String[] args) {
		findDuplicateCharacters("automation tesing");
	}
}
