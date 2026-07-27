class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        int missing = 0;
        int arr [] = new int[2];
        for (int i=0; i<nums.length;i++ ){
            missing =target-nums[i];
            if(map.containsKey(missing)){
                int num1 = map.get(missing);
                int num2 =i;
                
                if(num1==num2)
                    continue;
                if(num1<num2){
                    arr[0]=num1;
                    arr[1]=num2;
                }
                else{
                    arr[0]=num2;
                    arr[1]=num1;
                }
                return arr;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}
