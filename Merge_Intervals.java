//Merge Intervals
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Merge_Intervals
{

	public static void mergeinterval(Interval arr[])
	{

		//if array has only one interval
		if(arr.length <= 0)
			return;

		//new stack for inserting intervals
		Stack<Interval> stack = new Stack<>();

		//sorting intervals of stating time in asending order
		//Comparator is one type of interface which is used to compare two objects of user define classes of array or any data types
		Arrays.sort(arr, new Comparator<Interval>(){
			public int compare(Interval i1, Interval i2)
			{
				return i1.start - i2.start;
			}
		});

		//push the first interval to stack
		stack.push(arr[0]);

		//start traversing and merging if needed
		for(int i=0; i<arr.length; i++)
		{
			//peek retrive the top element of stack
			Interval top = stack.peek();

			////if current element not overlpping and move it to stack
			if(top.end < arr[i].start)
			{
				stack.push(arr[i]);
			}

			// Otherwise update the ending time of top if ending of current
            // interval is more
            else if(top.end < arr[i].end)
            {

            	top.end = arr[i].end;
            	stack.pop();
            	stack.push(top);
            }

		}

		//print content of stack
		System.out.print("The Merged Intervals are: ");
		while(!stack.isEmpty())
		{
			Interval t = stack.pop();
			System.out.print("["+t.start+","+t.end+"] ");
		}


	}

	public static void main(String[] args) {

		Interval arr[] = new Interval[5];
		arr[0] = new Interval(1,3);
		arr[1] = new Interval(2,4);
		arr[2] = new Interval(5,7);
		arr[3] = new Interval(6,8);
		arr[4] = new Interval(10,13);
		
		//function to implement main code
		mergeinterval(arr);
	}
}

class Interval
{
	int start,end;
	Interval(int start, int end)
	{
		this.start = start;
		this.end = end;
	}
}