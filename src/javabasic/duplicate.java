package javabasic;

public class duplicate {


    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4};
        int[] temp = new int[arr.length];
        int size = 0;

        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<size;j++){
                if(temp[j]==arr[i]) found = true;
            }
            if(!found) temp[size++] = arr[i];
        }

        for(int i=0;i<size;i++) System.out.print(temp[i]+" ");
    }
}
