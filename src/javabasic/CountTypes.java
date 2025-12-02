package javabasic;

public class CountTypes {
	
	    public static void main(String[] args) {
	        String s = "Abc123@#";
	        int d=0,a=0,spec=0;

	        for(char c : s.toCharArray()){
	            if(Character.isDigit(c)) d++;
	            else if(Character.isLetter(c)) a++;
	            else spec++;
	        }

	        System.out.println("Letters = "+a);
	        System.out.println("Digits = "+d);
	        System.out.println("Special = "+spec);
	    }
	}



