// I chose to use LinkedList so I can determined  the last element in the list.


import java.util.Arrays;
import java.util.LinkedList;

public class MergeOverlappingIntervalsWithLinkedList {

  public static LinkedList<Interval> mergeIntervals(LinkedList<Interval> intervals) {

    if (intervals.size() <= 1) {
      return intervals;
    }
    LinkedList<Interval> solution = new LinkedList<Interval>();
    for (Interval current : intervals) {
      if (solution.isEmpty() || solution.getLast().end < current.start) {
        solution.add(current);
      } else {
        solution.getLast().end = Math.max(current.end, solution.getLast().end);
      }
    }
    print(solution);
    return solution;
  }

  public static void print(LinkedList<Interval> intervals) {
    if (!intervals.isEmpty()) {
      System.out.print("Interval list: ");
      for (Interval interval : intervals) {
        System.out.println("[" + interval.start + " " + interval.end + "],");
      }
    }
  }

  public static void main(String args[]) {

    LinkedList<Interval> intervals = new LinkedList<Interval>(
        Arrays.asList(new Interval(94133, 94133), new Interval(94200, 94299), new Interval(94600, 94699)));
    print(intervals);
    mergeIntervals(intervals);
  }

}