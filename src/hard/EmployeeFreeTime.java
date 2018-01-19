package hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by stengali on 1/18/18.
 */

class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
public class EmployeeFreeTime {

    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> result = new ArrayList<>();
        List<Interval> timeLine = new ArrayList<>();

        for(List<Interval> i : schedule) {
            timeLine.addAll(i);
        }

        Collections.sort(timeLine, ((a, b) -> a.start - b.start));
        Interval temp = timeLine.get(0);
        for(Interval each : timeLine) {
            if(temp.end < each.start) {
                result.add(new Interval(temp.end, each.start));
                temp = each;
            } else {
                temp = temp.end < each.end ? each : temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        EmployeeFreeTime obj = new EmployeeFreeTime();
        Interval i1 = new Interval(1,2);
        Interval i2 = new Interval(5,6);
        Interval i3 = new Interval(1,3);
        Interval i4 = new Interval(4,10);
        Interval i5 = new Interval(10,15);
        List<Interval> inp = new ArrayList<>();
        inp.add(i1);
        inp.add(i2);

        List<Interval> inp2 = new ArrayList<>();
        inp2.add(i3);
        List<Interval> inp3 = new ArrayList<>();
        inp3.add(i4);
        List<Interval> inp4 = new ArrayList<>();
        inp4.add(i5);
        List<List<Interval>> input = new ArrayList<>();
        input.add(inp);
        input.add(inp2);
        input.add(inp3);
        input.add(inp4);

        for(Interval i : obj.employeeFreeTime(input)) {
            System.out.println(i.start + " "+i.end);
        }
        System.out.println();
    }
}
