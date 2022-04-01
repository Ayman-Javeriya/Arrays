/*Merge 2 sorted arrays without using Extra space.
After Merging 
First Array: 1 2 3 5 8 9 
Second Array: 10 13 15 20
*/
import java.util.Arrays;

public class merge_two_arrays
{
	public static void main(String[] args) {
		int arr1[] = {1,5,9,10,15,20};
		int arr2[] = {2,3,8,13};

		int m = arr1.length;
		int n = arr2.length;

		int i = 0;
		int j = 0;
		int k = m-1;

		int temp = 0;

		//while loop to traverse both the arrays 
		while(i <= k && j < n)
		{
			if(arr1[i] < arr2[j])
				i++;

			else{

				temp = arr2[j];
				arr2[j] = arr1[k];
				arr1[k] = temp;
				j++;
				k--;
			}
			//System.out.println("arr1[i]: "+arr1[i]+" for i= "+i);
			//System.out.println("arr1[k]: "+arr1[k]+" for k= "+k);
			//System.out.println("arr2[j]: "+arr2[j]+" for j= "+j);
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println("After merging 1st array: "+Arrays.toString(arr1));
		System.out.println("After merging 2nd array: "+Arrays.toString(arr2));
	}
} 