package javabasic;

public class SubstringCount {
	public static void main(String[] args) {
        String s = "abababab";
        String sub = "ab";
        int count = 0, index = 0;

        while((index = s.indexOf(sub, index)) != -1){
            count++;
            index += sub.length();
        }

        System.out.println("Occurrences = "+count);
    }
}

