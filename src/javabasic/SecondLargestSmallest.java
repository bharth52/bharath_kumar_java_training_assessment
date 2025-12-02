package javabasic;

public class SecondLargestSmallest {

    public static void main(String[] args) {
        int[] arr = {10,5,20,8};

        int largest=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>largest){
                second=largest;
                largest=x;
            } else if(x>second && x!=largest){
                second=x;
            }
        }

        System.out.println("Second Largest = "+second);
    }
}

