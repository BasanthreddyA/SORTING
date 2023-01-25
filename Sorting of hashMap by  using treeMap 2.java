import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int[] a={10,20,30,40};
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<a.length;i++){
        mp.put(a[i],i);
        }
       
        for(Map.Entry<Integer,Integer>maa:mp.entrySet()){
            System.out.println(maa.getKey()+" "+maa.getValue());
        }
        System.out.println(mp);
        //After sorting the Hashing by using the tree map
        
        
        TreeMap<Integer,Integer>mm=new TreeMap<>(mp);
        for(Map.Entry<Integer,Integer> aa:mm.entrySet()){
            System.out.println(aa);
        }
       // System.out.println(mm);
        
//		System.out.println("Hello World");
	}
}
