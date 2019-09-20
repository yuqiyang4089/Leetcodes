//5. Longest Palindromic Substring
//Given a string s, find the longest palindromic substring in s.
// You may assume that the maximum length of s is 1000.

class Solution {
  private lo,maxlen
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len<2 || len == null) return s;
        for(int i =0; i<len;i++){
          extendpalindrome(s,i,i);
          extendpalindrome(s,i,i+1);
        }
        return s.substring(lo,lo+maxlen);
    }
    public void extendpalindrome(String s, int j,int k){
      while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
        j--;
        k++;
      }
      if(maxlen <k-j-1){
        maxlen = k-j-1;
        lo = j+1;
      }
    }
}
//  Notice:
// 1.len = s.length()
// 2.for(int i = 0, i<s.length(),i++)
// 3.be careful about when doing with while;
