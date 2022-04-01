//Find the "Kth" max and min element of an array 
import java.util.*;
public class kth_mix_max_element
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the kth element: ");
		int k = sc.nextInt();

		int arr[] = {54,89,76,55,12,10};
		int temp = 0;

		//1st sort whole array
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			//System.out.print(arr[i]+" ");
		}
			System.out.println("MIN Element: "+arr[0]);
			System.out.println("MAX Element: "+arr[k-1]);
	}
}