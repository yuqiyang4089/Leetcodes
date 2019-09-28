14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null ||strs.length ==0) return "";
        String pre = strs[0];
        int point = 1;
        while(point<strs.length){
          while(strs[point].indexOf(pre) !=0){
            pre = pre.substring(0,pre.length()-1);
          }
          point++;
        }
        return pre;
    }
}
