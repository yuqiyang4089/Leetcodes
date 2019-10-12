The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String str = countAndSay(n-1);
        StringBuilder curr = new StringBuilder();
        char c = "0";
        for(int i = 0, len = curr.length(); i<len; i++){
          c = curr.atChar(i);
          int count = 1;
          while((i + 1) < len && curr.atChar(i + 1) == c){
            count ++;
            i ++;
          }
          curr.append(count+""+c)    // important to change digital to string
        }
        return curr.toString();
    }
}
