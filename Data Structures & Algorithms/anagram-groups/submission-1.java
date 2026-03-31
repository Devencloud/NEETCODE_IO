class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(m.containsKey(temp)){
                m.get(temp).add(s);
            }
            else{
                m.put(temp,new ArrayList<>());
                m.get(temp).add(s);
            }
        }
        List l1 = new ArrayList<>(m.values());
        return l1;
        
    }
}
