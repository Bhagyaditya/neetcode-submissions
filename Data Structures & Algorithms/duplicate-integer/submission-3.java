class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> k = new HashSet<>();
        for (int i=0; i<nums.length;i++){
            if(k.contains(nums[i]))
                return true;
            k.add(nums[i]);
        }
        return false;
    }
}