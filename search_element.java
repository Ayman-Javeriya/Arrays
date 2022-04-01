import java.util.*;
public class search_element
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int size = sc.nextInt();

		//declaring array
		int arr[]= new int[size];

		System.out.println("Enter elements ");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}

		//searching element
		System.out.print("Enter element to be search: ");
		int x = sc.nextInt();

		for(int i=0 ;i<arr.length; i++)
		{
			if(arr[i] == x)
			{
				System.out.println("Element found at "+i+" index");
			}
		}


	}
}