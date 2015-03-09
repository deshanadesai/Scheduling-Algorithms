import java.util.*;
import java.io.*;

public class FCFS
{
	public static void schedule(int[] pid, int[] run, int[] arrival)
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		int qcount = 0;
		int current_time = arrival[0];
		int count = 0;

		for(int i=0;i<run.length;i++)
		{
			queue.add(pid[i]);
			qcount++;
		}

		while(!queue.isEmpty())
		{
			if(current_time == arrival[count])
			{
				current_time = current_time + run[count];
				count++;
				queue.remove();
				continue;

			}
			else if(current_time <arrival[count])
			{
				current_time = arrival[count] + run[count];
				count++;
				queue.remove();
				continue;
			}
			else if(current_time > arrival[count])
			{
				current_time = current_time + run[count];
				count++;
				queue.remove();
				continue;
			}

		}
		System.out.println(current_time);

	}


	public static void main(String args[])
	{
		  int arrival[]=new int[] {0,0,0,3};
        int run[]=new int[] {5,2,3,1}; 
        int pid[] = new int[]{0,1,2,3};
  		schedule(pid, run, arrival);
	}
}