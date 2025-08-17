class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length(), needleLength = needle.length();
        if(needleLength == 0) return -1;
        for(int i = 0; i <= (haystackLength - needleLength); i++)
            if(haystack.substring(i, i + needleLength).equals(needle))
                return i;
        return -1;
    }
}