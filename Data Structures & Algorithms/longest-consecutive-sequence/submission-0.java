class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                int length = 1;
                int nextNum = num + 1;

            while(set.contains(nextNum)){
                length++;
                nextNum++;
            }
            longest = Math.max(longest, length);
            }

        }

        return longest;
    }
}
