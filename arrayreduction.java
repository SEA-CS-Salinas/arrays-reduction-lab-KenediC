//(c) A+ Computer Science
//www.apluscompsci.com
//Name Kenedi Carson

//Import needed utilities
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class ArrayReduction{
    /*min_cost() method- Uses a PriotityQueue in order to determine the min cost of the array.
    @param int[] r
    @return int minCount*/
	public static int min_cost( int[] r ){
		PriorityQueue<Integer> pq;
		pq = new PriorityQueue<Integer>();
		int sum = 0;
		int minCost = 0;
		for(int obj : r){
		    pq.add(obj);
		    
		    }
		  
		while(pq.size() > 1){
		    sum = 0;
		    sum += pq.remove();
		    sum += pq.remove();
		    pq.add(sum);
		    minCost += sum;
		}
		return minCost;	
	}
	
	public static void main( String[] args ){
		int[] s0 = {212};
		System.out.println( ArrayReduction.min_cost(s0));
		
		int[] s1 = {25,10,20};
		System.out.println( ArrayReduction.min_cost(s1));		
			
		int[] s2 = {1,2,3};
		System.out.println( ArrayReduction.min_cost(s2));	
			
		int[] s3 = {1,2,3,4,7,22,33,54,-66,3,4,5,76,7,999};
		System.out.println( ArrayReduction.min_cost(s3));	
			
		int[] s4 = {1,1,1,1,1};
		System.out.println( ArrayReduction.min_cost(s4));	
			
		int[] s5 = {1,1};
		System.out.println( ArrayReduction.min_cost(s5));						
	}
}


/* EXPECTED OUTPUT
 0
85
9
947
12
2
*/

