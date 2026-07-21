class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> check = new HashMap();
        for(String str: strs){
            char [] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(!check.containsKey(sorted)){
                check.put(sorted, new ArrayList());
            }
            check.get(sorted).add(str);
        }
        return new ArrayList<>(check.values());
    }
}
