class Solution {
    public boolean isPalindrome(String s) {
        String strs = s.toLowerCase();
        int left = 0;
        int right = strs.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
