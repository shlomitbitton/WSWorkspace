
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestMergeOverlappingIntervals {
  Interval[] arr1 = new Interval[3];
  Interval[] arr2 = new Interval[3];
  Interval[] arr3 = new Interval[3];


  @Before
  public void runBeforeTestMethod() {

    arr1[0] = new Interval(94133, 94133);
    arr1[1] = new Interval(94200, 94299);
    arr1[2] = new Interval(94600, 94699);

    arr2[0] = new Interval(2, 5);
    arr2[1] = new Interval(0, 6);
    arr2[2] = new Interval(3, 4);


  }

  @Test
   public void testMergeOverlappingIntervals1() throws Exception{ 
   
    int[][] expectedSolution = new int[1][2];
    expectedSolution[0][0]=0;
    expectedSolution[0][1]=6;

    ArrayList<Interval> solution = MergeOverlappingIntervals.mergeIntervals(arr2);
    int[][] convertedSolution = new int[solution.size()][2];
    for(Interval i:solution){
      convertedSolution[0][0] = i.start;
      convertedSolution[0][1] = i.end;
      
    }
    
    boolean check1 = Arrays.deepEquals(convertedSolution, expectedSolution);
    assertTrue(check1); 

  } 
   
  @Test
  public void testMergeOverlappingIntervals2() throws Exception{ 
  System.out.println("-------------------------------");

    int[][] expectedSolution = new int[3][2];
    List<Integer> list = new ArrayList<Integer>();
    expectedSolution[0][0]=94133;
    expectedSolution[0][1]=94133;
    expectedSolution[1][0]=94600;
    expectedSolution[1][1]=94699;
    expectedSolution[2][0]=94200;
    expectedSolution[2][1]=94299;

    for(int i=0;i<expectedSolution.length;i++){
      for(int j=0;j<expectedSolution[i].length;j++){
        list.add(expectedSolution[i][j]);
        System.out.println("list: "+list);
      }
    }


  ArrayList<Interval> solution = MergeOverlappingIntervals.mergeIntervals(arr1);
  List<Integer> listSolution = new ArrayList<Integer>();
 
  for(Interval inter:solution){
    listSolution.add(inter.start);
    listSolution.add(inter.end);
    System.out.println("listSolution: "+listSolution);
  }
  assertEquals(list,listSolution); 

 } 

}