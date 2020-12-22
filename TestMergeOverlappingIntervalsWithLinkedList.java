
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMergeOverlappingIntervalsWithLinkedList {
  

  @BeforeClass
  public static void beforeTestCaseOneClass(){
  System.out.println("————————————————");
  System.out.println();
  System.out.println("Executing Test methods of Test Case One class…");
  System.out.println("————————————————");
  System.out.println();
  }

  
  @Test
  public static void testMergeOverlappingIntervalsWithLinkedList1() throws Exception{ 

    LinkedList<Interval> intervals = new LinkedList<Interval>(Arrays.asList(
      new Interval(94133,94133),
      new Interval(94200,94299),
      new Interval(94600,94699)));

    LinkedList<Interval> expectedList = new LinkedList<Interval>(Arrays.asList(
      new Interval(94133,94133),
      new Interval(94200 ,94299),
      new Interval(94600, 94699)));
     
    Assert.assertNotEquals(MergeOverlappingIntervalsWithLinkedList.mergeIntervals(intervals),expectedList); 
 } 
 @Test
  public static void testMergeOverlappingIntervalsWithLinkedList2() throws Exception{ 

    LinkedList<Interval> intervals = new LinkedList<Interval>(Arrays.asList(
      new Interval(94133,94135),
      new Interval(94134,94135),
      new Interval(94190,94195),
      new Interval(94195,94199)));

    LinkedList<Interval> expectedList = new LinkedList<Interval>(Arrays.asList(
      new Interval(94133,94135),
      new Interval(94190,94199)));
     
    Assert.assertNotEquals(MergeOverlappingIntervalsWithLinkedList.mergeIntervals(intervals),expectedList); 
 } 

 @Test
 public static void testMergeOverlappingIntervalsWithLinkedList3() throws Exception{ 

   LinkedList<Interval> intervals = new LinkedList<Interval>(Arrays.asList(
     new Interval(94133,94135),
     new Interval(94200,94299),
     new Interval(94226,94399)));
    

   LinkedList<Interval> expectedList = new LinkedList<Interval>(Arrays.asList(
     new Interval(94133 ,94135),
     new Interval(94200, 94399)));
    
   Assert.assertNotEquals(MergeOverlappingIntervalsWithLinkedList.mergeIntervals(intervals),expectedList); 
} 
}