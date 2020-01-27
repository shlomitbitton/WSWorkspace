import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;


public class MergeOverlappingIntervals {

	// The main function that takes a set of intervals, merges 
	// overlapping intervals and prints the result 
	public static Stack<Interval>  mergeIntervals(Interval[] arr){ 

    Stack<Interval> solution = new Stack<Interval>();
		// Test if the given set has at least one interval 
		if (arr.length <= 0) 
			return solution; 
	
		// Create an empty stack of intervals 
		Stack<Interval> stack=new Stack<>(); 
	
		// sort the intervals in increasing order of start time 
		Arrays.sort(arr,new Comparator<Interval>(){ 
			public int compare(Interval i1,Interval i2) 
			{ 
				return i1.start-i2.start; 
			} 
		}); 
	
		// push the first interval to stack 
		stack.push(arr[0]); 
	
		// Start from the next interval and merge if necessary 
		for (int i = 1 ; i < arr.length; i++) 
		{ 
			// get interval from stack top 
			Interval top = stack.peek(); 
	
			// if current interval is not overlapping with stack top, push it to the stack 
			if (top.end < arr[i].start){
				stack.push(arr[i]); 
      }
			// Otherwise update the ending range of top if ending of current interval is higher 
			else if (top.end < arr[i].end){ 
				top.end = arr[i].end; 
				stack.pop(); 
				stack.push(top); 
			} 
    } 
    
    solution = stack;
		printSolution(stack);
    return solution;
  } 

  public static void printSolution(Stack<Interval> stack){
    System.out.print("The Merged Intervals are: "); 
		while (!stack.isEmpty()) 
		{ 
      reverse(stack);
			Interval t = stack.pop(); 
			System.out.print("["+t.start+","+t.end+"] "); 
    } 
  }
  
  public static void reverse (Stack<Interval> s){
    
    if(!s.isEmpty()){
			Interval temp=(s.pop());
			reverse(s);
      insertatBottom(s, temp);
    }
  } 

  public static void insertatBottom(Stack<Interval> s, Interval t ){
		if (s.isEmpty()){
			s.push(t);
		}else{
			Interval temp= s.pop();
			insertatBottom(s, t);
			s.push(temp);
		}
  }

	public static void main(String args[]) { 
		
		Interval[] arr=new Interval[3]; 
		arr[0]=new Interval(94133,94133); 
		arr[1]=new Interval(94200,94299); 
    arr[2]=new Interval(94600,94699); 
		mergeIntervals(arr);
	} 
}

