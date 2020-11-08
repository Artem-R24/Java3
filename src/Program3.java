import java.util.LinkedList;
import java.util.ArrayList;
public class Program3 {

	public static void main(String[] args) {
		final int N=10000;
		final int max=100;
		long time=0;
		LinkedList<Integer> l_list=new LinkedList<Integer>();
		ArrayList<Integer> a_list=new ArrayList<Integer>();
		Table l_list_table=new Table();
		Table a_list_table=new Table();
		for(int i=0;i<N;i++)
		{
			long startTime = System.currentTimeMillis();
			l_list.add(i%200);
		    long endTime = System.currentTimeMillis();
			time+=(endTime-startTime);
		}
		l_list_table.set_add(time);
		time=0;
		for(int i=0;i<N;i++)
		{
			long startTime = System.currentTimeMillis();
			int value=l_list.get(i);
		    long endTime = System.currentTimeMillis();
			time+=(endTime-startTime);
		}
		l_list_table.set_get(time);
		time=0;
		for(int i=0;i<N;i++)
		{
			long startTime = System.currentTimeMillis();
			l_list.remove();
		    long endTime = System.currentTimeMillis();
			time+=(endTime-startTime);
		}
		l_list_table.set_remove(time);
		time=0;
		for(int i=0;i<N;i++)
		{
			long startTime = System.currentTimeMillis();
			a_list.add((int)(Math.random()*max));
		    long endTime = System.currentTimeMillis();
			time+=(endTime-startTime);
		}
		a_list_table.set_add(time);
		time=0;
		for(int i=0;i<N;i++)
		{
			long startTime = System.currentTimeMillis();
			a_list.get(i);
		    long endTime = System.currentTimeMillis();
			time+=(endTime-startTime);
		}
		a_list_table.set_get(time);
		time=0;
		for(int i=0;i<N;i++)
		{
			long startTime = System.currentTimeMillis();
			a_list.remove(a_list.size()-1);
		    long endTime = System.currentTimeMillis();
			time+=(endTime-startTime);
		}
		l_list_table.set_add(time);
		time=0;
		System.out.println("For linked list:");
		l_list_table.print_table();
		System.out.println(" ");
		System.out.println("For array list:");
		a_list_table.print_table();
	}
	

}
