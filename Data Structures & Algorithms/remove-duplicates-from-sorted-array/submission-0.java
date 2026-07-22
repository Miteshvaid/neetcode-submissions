class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        int unique = 0;

        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else if(nums[i] != nums[i-1]){
                nums[k+1] = nums[i];
                k++;
                unique++;
            }
             
        }
            return k+1;
    }
}