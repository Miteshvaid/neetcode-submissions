class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int val : nums1) {
            set.add(val);
        }
        for (int val : nums2) {
            set2.add(val);
        }

        // for (int i = 0; i < nums1.length; i++) {
        //     for (int j = 0; j < nums2.length; j++) {
        //         set.add(nums1[i]);
        //         set2.add(nums2[j]);
        //     }
        // }
        
        HashSet<Integer> ans1 = new HashSet<>();

        for (int val : nums1) {
            if (!set2.contains(val)) {
                ans1.add(val);
            }
        }

        HashSet<Integer> ans2 = new HashSet<>();

        for (int val : nums2) {
            if (!set.contains(val)) {
                ans2.add(val);
            }
        }

        List<Integer> list1 = new ArrayList<>(ans1);
        List<Integer> list2 = new ArrayList<>(ans2);
        return Arrays.asList(list1, list2);
    }
}