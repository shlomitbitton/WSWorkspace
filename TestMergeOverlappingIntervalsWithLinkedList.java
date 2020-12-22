
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class TestMergeOverlappingIntervalsWithLinkedList {
  
  @Test
  public void testMergeOverlappingIntervalsWithLinkedList() throws Exception{ 

    LinkedList<Interval> intervals = new LinkedList<Interval>(Arrays.asList(
    new Interval(94133,94133),
    new Interval(94200,94299),
    new Interval(94226,94399)));

    LinkedList<Interval> expectedList = new LinkedList<Interval>(Arrays.asList(
      new Interval(94133,94133),
      new Interval(94200,94399)));
     
     // assertThat(MergeOverlappingIntervalsWithLinkedList.mergeIntervals(intervals).equals(expectedList)).isTrue();
    Assert.assertEquals(MergeOverlappingIntervalsWithLinkedList.mergeIntervals(intervals),expectedList); 
 } 
}