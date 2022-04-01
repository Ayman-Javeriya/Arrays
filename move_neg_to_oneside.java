//Move all the negative elements to one side of the array 
public class move_neg_to_oneside
{
	public static void main(String[] args) {
		
		int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6};
		int j=0; 
		int temp=0;

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < 0)
			{
				if(i != j)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
				System.out.println(j+" "+arr[j]); //this statement is to understand working of i.
			}
		}

		//printing the result
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}