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
		insertionSort(aa);// calling the method
	}
	static void insertionSort(int[] a){
	    for(int i=1;i<a.length;i++){  //it checks upto length-1
	   int currentpos=a[i];
	   int previous=i-1;
	   while(previous>=0 && a[previous]>currentpos){
	       a[previous+1]=a[previous];
	       previous--;
	   }
	   a[previous+1]=currentpos;
	    }
	    System.out.println(Arrays.toString(a));
	}
}


//TC=O(N2)
