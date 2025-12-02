package javabasic;
import java.util.*;

public class linearsearch {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);

	        int row = sc.nextInt();

	        int[] arr = new int[row];
	        System.out.println("enter the elements :");
	        for(int i=0;i<row;i++)
	        {
	        	arr[i]=sc.nextInt();
	        	
	        }
	        System.out.println("to search which one");
	        int ans=0;
	        int search = sc.nextInt();
	        for(int i=0;i<row;i++)
	        {
	        	if(arr[i]==search)
	        	{
	        		ans=i+1;
	        	}
	        }
	        System.out.println("elemet "+ search +" is found at "+ans);
	        }
}