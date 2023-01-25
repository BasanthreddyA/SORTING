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
		BubbleSort(aa);// calling the method
	}
	static void BubbleSort(int[] a){
	    for(int turn=0;turn<a.length-1;turn++){  //it checks upto it turn -1
	        for(int j=0;j<a.length-1-turn;j++){
	            if(a[j]>a[j+1]){
	                int temp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;//swaping are used because  send the bigger element to last or its poisiton 
	            }
	        }
	    }
	    System.out.println(Arrays.toString(a));
	}
}


//TC=O(N2)
