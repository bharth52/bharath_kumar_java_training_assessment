package javabasic;

public class LinearSearch1 {

	public static void main(String[] args) {
		 
		        int[] arr = {5,9,2,7};
		        int key = 7;

		        for(int i=0;i<arr.length;i++){
		            if(arr[i]==key){
		                System.out.println("Found at index "+i);
		                return;
		            }
		        }
		        System.out.println("Not found");
		    }
		}

