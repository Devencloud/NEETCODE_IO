class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for(String t:strs){
            char[] arr = t.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(m.containsKey(temp)  ){
                m.get(temp).add(t);

            }
            else{
                m.put(temp,new ArrayList<>());
                m.get(temp).add(t);
            }
        }
        return new ArrayList<>(m.values());

    }
}
