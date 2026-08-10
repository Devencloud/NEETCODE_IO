/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()==0 || intervals.size()==1){
            return true;
        }
        intervals.sort((a,b)->a.start-b.start);
        for(int i = 1;i<intervals.size();i++){
            int prevEnd = intervals.get(i-1).end;
            int currStart = intervals.get(i).start;
            if(currStart<prevEnd){
                return false;
            }
        }
        return true;
        

    }
}
