
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestMergeOverlappingIntervals {
  Interval[] arr1 = new Interval[3];
  Interval[] arr2 = new Interval[3];
  Interval[] arr3 = new Interval[3];


  // @Before
  public void runBeforeTestMethod() {

    arr1[0] = new Interval(94133, 94133);
    arr1[1] = new Interval(94200, 94299);
    arr1[2] = new Interval(94600, 94699);

    arr2[0] = new Interval(2, 5);
    arr2[1] = new Interval(0, 6);
    arr2[2] = new Interval(3, 4);

    arr3[0] = new Interval(1, 10);
    arr3[1] = new Interval(100, 102);
    arr3[2] = new Interval(10000000, 100000001);


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
    //assertNotEquals("test fails",MergeOverlappingIntervals.mergeIntervals(arr3),expectedSolution3);
  

//   @Test
//   public void testMergeOverlappingIntervals2() throws Exception{ 
//   System.out.println("-------------------------------");

//     int[][] expectedSolution = new int[3][2];
//     expectedSolution[0][0]=94133;
//     expectedSolution[0][1]=94133;
//     expectedSolution[1][0]=94600;
//     expectedSolution[1][1]=94699;
//     expectedSolution[2][0]=94200;
//     expectedSolution[2][1]=94299;

//   ArrayList<Interval> solution = MergeOverlappingIntervals.mergeIntervals(arr1);
 
//   int[] convertedInterval = new int[2];
//   int[][] expectedSolution2 = new int[3][2];
//   for(int[] filler:expectedSolution2){
//       for(Interval inter: solution){
//         convertedInterval[0]=inter.start;
//         convertedInterval[1]=inter.end;
//         Arrays.asList(convertedInterval[0],convertedInterval[1]);
//       }
//   }


//    boolean check1 = Arrays.deepEquals(expectedSolution2,expectedSolution);
//    assertTrue(check1); 

//  } 
   //assertNotEquals("test fails",MergeOverlappingIntervals.mergeIntervals(arr3),expectedSolution3);
 

}