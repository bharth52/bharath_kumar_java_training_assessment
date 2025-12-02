package javabasic;

public class CountWords {
	public static void main(String[] args) {
        String s = "Hello world welcome";
        s = s.trim();
        int count = 1;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') count++;
        }

        System.out.println("Words = "+count);
    }


}
