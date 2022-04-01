//Minimum no. of Jumps to reach end of an array
public class no_of_jumps
{

	public static int min_no_of_jumps(int arr[], int size)
	{
		int maxS = arr[0];
		int step = arr[0];
		int jump = 1;

		if(size == 1)
			return 0;

		else if(arr[0] == 0)
			return -1;

		else{
			for(int i=1; i<size; i++)
			{
				if(i == size)
					return jump;

				maxS = Math.max(maxS,i+arr[i]);
				step--;

				if(step == 0)
				{
					jump++;
					if(i >= maxS){
						return -1;
					}
					step = maxS - i;
				}
			}
		}
		return jump;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
		//int arr[] = {2,3,7,2,6,1,7,2};
		int size = arr.length;
		int res=min_no_of_jumps(arr,size);
		System.out.println("No of minimum steps required to reach end of array: "+res);
	}
}