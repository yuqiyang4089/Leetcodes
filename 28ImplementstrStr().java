Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle
is not part of haystack.

class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length, l2 = needle.length;
        String h;
        if(l2 > l1) return -1;
        else if(l2 == 0) return 0;
        int threshold = l1 - l2;
        for(int i = 0; i <= threshold; i++){
          if( haystack.subString(i,i+l2).equals(needle)) return i;
        }
        return -1;
    }
}

be careful about .equals(). the difference between == and equals()
