//Given an array of size n and a number k, fin all elements that appear more than " n/k //" times.
import java.util.*;
public class nbyk_array
{
	public static void find_element(int arr[], int n, int k)
	{
		int x = n/k;

		//creating treemap
		TreeMap<Integer,Integer> tp = new TreeMap<Integer,Integer>();

		//loop for inserting values in this treemap
		for(int i=0; i<n; i++)
		{
			tp.put(arr[i],tp.getOrDefault(arr[i],0)+1);
		}

		//Traverse the map and print all
        // the elements with occurrence
        // more than n/k times by converting map as set
        for(Map.Entry m:tp.entrySet())
        {
        	if((int)m.getValue() > x)
        		System.out.println("Elements more than n/k times: "+m.getKey());

        }
	}
	public static void main(String[] args) {
		int arr[] = {3,1,2,2,1,2,3,3};
		int n = arr.length;
		int k = 4;
		find_element(arr,n,k);
		//System.out.println("Elements more than n/k times: "+find_element(arr,n,k));
	}
}