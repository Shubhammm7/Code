package array;

import java.util.ArrayList;
import java.util.Collections;

public class Equalize_the_Array {

	public static void main(String[] args) {
		
		int[] arr={3, 3 ,2, 1,3,4,4,4,4,4};
		int max=0,n=arr.length;
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int a:arr)
		{
			list.add(a);
		}
		
		for(int item : arr) {
            int frequency = Collections.frequency(list, item);
            max = Math.max(max, frequency);
        }
        System.out.println(max);

	}

}
