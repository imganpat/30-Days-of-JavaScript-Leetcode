class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] pMap = new int[26];
        int[] sMap = new int[26];
        int windowLength = p.length();

        for (char c : p.toCharArray()) {
            pMap[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            sMap[s.charAt(i) - 'a']++;
            if (i >= windowLength) {
                sMap[s.charAt(i - windowLength) - 'a']--;
            }
            if (Arrays.equals(pMap, sMap)) {
                res.add(i - windowLength + 1);
            }
        }

        return res;
    }
}