class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int n = allowed.length();
        for (int i = 0; i < n; i++)
            set.add(allowed.charAt(i));
        int ans = 0;
        for (String word : words) {
            int l = word.length();
            boolean good = true;
            for (int i = 0; i < l; i++)
                if (!set.contains(word.charAt(i))) {
                    good = false;
                    break;
                }
            if (good)
                ans++;
        }
        return ans;
    }
}