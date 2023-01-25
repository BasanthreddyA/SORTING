//it compares the first element with second element when it is bigger element it going to swap the elements to  its position
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt(); //taking input of array
	    int[] aa=new int[size];//inst the array
	    for(int i=0;i<aa.length;i++){
	        aa[i]=sc.nextInt(); //taking input to array
	    }
		selectionSort(aa);// calling the method
	}
	static void selectionSort(int[] a){
	    for(int i=0;i<a.length-1;i++){  //it checks upto length-1
	    int minpos=i;
	        for(int j=i+1;j<a.length;j++){
	            if(a[minpos]<a[j]){
	                minpos=j;
	            }
	        }
	        int temp=a[minpos];
	                a[minpos]=a[i];
	                a[i]=temp;//it selects the particular element(smmalest number) and it going to the swap the element elements 
	    }
	    System.out.println(Arrays.toString(a));
	}
}


//TC=O(N2)
