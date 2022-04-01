//Find the Union and Intersection of the two sorted arrays.
public class union_intersection
{
	public static void main(String[] args) {

		//declaring two arrays.
		int arr1[] = {1,3,4,5,7,10};
		int arr2[] = {2,3,5,6,9,12,13};
		int i=0;
		int j=0;

		//code for Union order
		//loop will be countine to compare and print orders in asending order.
		System.out.print("Union of Array: "); 
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				System.out.print(arr1[i]+" ");
				i++;
			}
			else if(arr2[j]<arr1[i])
			{
				System.out.print(arr2[j]+" ");
				j++;
			}
			else{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}

		
		//printing remaining elements 
		while(i<arr1.length)
		{
			System.out.print(arr1[i]+" ");
			i++;
		}

		while(j<arr2.length)
		{
			System.out.print(arr2[j]+" ");
			j++;
		}
		System.out.println();
		System.out.println();

		//code for intersection
		System.out.print("Intersection of Array: ");
		for(int a=0; a<arr1.length; a++)
		{
			for(int b=0; b<arr2.length; b++)
			{
				if(arr1[a] == arr2[b])
				{
					System.out.print(arr1[a]+" ");
				}
			}
		}

	}
}