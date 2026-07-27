class Solution {
    public int search(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid = end - st;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                st = mid+1;
            if(nums[mid]>target)
             end= mid-1;
        }
    return -1;
    }
}
