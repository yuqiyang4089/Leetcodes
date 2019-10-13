7. Reverse Integer
Given a 32-bit signed integer, reverse digits of an integer.
class Solution {
    public int reverse(int x) {
        int result = 0, newresult;
        int tail = 0;
        while(x != 0){
          tail = x % 10;
          x = x/10;
          newresult = result * 10 + tail;
          if((newresult - tail)/10 != result){
            return 0;
          }
          result = newresult;
        }
        return result;
    }
}
