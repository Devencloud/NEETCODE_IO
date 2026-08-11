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
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()==0){
            return 0;
        }
        intervals.sort((a,b)->a.start-b.start);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(intervals.get(0).end);
        int cnt = 1;

        for(int i = 1;i<intervals.size();i++){
            Interval x = intervals.get(i);
            if(x.start>= q.peek()){
                q.poll();
                q.offer(x.end);

                
            }
            else{
                q.offer(x.end);
                cnt++;
            }
           
        }
        return cnt;
        

        
    }
}