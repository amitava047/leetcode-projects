class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (sSet.contains(c)) {
                sSet.remove(s.charAt(left));
                left++;
            }

            sSet.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}