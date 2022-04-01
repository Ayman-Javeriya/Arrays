//find maximum product subarray 
import java.io.*;
 
public class max_product_array
{
	static int max(int x, int y)
	{
		return x>y?x:y;
	}

	static int min(int x, int y)
	{
		return x<y?x:y;
	}
 
    static int maxSubarrayProduct(int arr[])
    {
        int n = arr.length;
        int max_ending_here = 1;
 
        int min_ending_here = 1;
 
        int max_so_far = 0;
        int flag = 0;
 
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > 0)
            {
                max_ending_here = max_ending_here * arr[i];
                min_ending_here = min(min_ending_here*arr[i],1);
            }
 
            else if (arr[i] == 0)
            {
                max_ending_here = 1;
                min_ending_here = 1;
            }
 
            else {
                int temp = max_ending_here;
                max_ending_here = max(min_ending_here*arr[i] , 1);
                min_ending_here = temp * arr[i];
            }

            //System.out.println(arr[i]+" "+max_ending_here);
            //System.out.println(arr[i]+" "+min_ending_here);
 
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;

            //System.out.println(arr[i]+" "+max_so_far);
       }
 
        //if (flag == 0 && max_so_far == 0)
        if(max_so_far == 0)
            return 0;
        return max_so_far;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
 
        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
        System.out.println("Maximum Sub array product is: "
                           + maxSubarrayProduct(arr));
    }

}