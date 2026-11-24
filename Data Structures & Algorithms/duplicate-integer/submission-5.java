class Solution {
    public boolean hasDuplicate(int[] nums) {
        var x = new HashSet<Integer>();
        for(int i:nums){
            x.add(i);
        }
        return x.size()!=nums.length;
    }
}