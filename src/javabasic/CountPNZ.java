package javabasic;

public class CountPNZ {
	
	    public static void main(String[] args) {
	        int[] arr = {-1,0,5,-2,8,0};

	        int pos=0, neg=0, zero=0;
	        for(int x:arr){
	            if(x>0) pos++;
	            else if(x<0) neg++;
	            else zero++;
	        }

	        System.out.println("Positive = "+pos);
	        System.out.println("Negative = "+neg);
	        System.out.println("Zero = "+zero);
	    }
	}



