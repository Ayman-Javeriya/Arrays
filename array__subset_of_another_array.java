//Find whether an array is a subset of another array
import java.io.*;
import java.util.*;
public class array__subset_of_another_array
{

	public static void check_subarray(int arr1[], int arr2[])
	{
		Set<Integer> s = new HashSet<Integer>();

		//for loop for inserting arr1[] elements into set
		for(int i=0; i<arr1.length; i++)
			s.add(arr1[i]);

		int arr1_size = s.size();

		//second loop for inserting 2nd array elements
		for(int i=0; i<arr2.length; i++)
			s.add(arr2[i]);

		int arr2_size = s.size();

		//checking size of both arrays
		if(arr1_size == arr2_size)
			System.out.println("arr2[] is subset of arr1[]");
		else
			System.out.println("arr2[] is not subset of arr1[]");
	}

	public static void main(String[] args) {
		int arr1[] = {3,10,2,15,8,29};
		int arr2[] = {29,22,15};

		check_subarray(arr1,arr2);
	}
}