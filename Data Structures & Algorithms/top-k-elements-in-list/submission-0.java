class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1 );
        }
        List<Map.Entry<Integer,Integer>> l1 = new ArrayList<>(map.entrySet());
        l1.sort((a,b)->b.getValue()-a.getValue());
        int[] res = new int[k];
        for(int i= 0;i<k;i++){
            res[i] = l1.get(i).getKey();
        }
        return res;
        
    }
}
