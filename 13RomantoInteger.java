Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        if(s.indexOf("IV") != -1){ sum -= 2 };
        if(s.indexOf("IX") != -1){ sum -= 2 };
        if(s.indexOf("XL") != -1){ sum -= 20 };
        if(s.indexOf("XC") != -1){ sum -= 20 };
        if(s.indexOf("CD") != -1){ sum -= 200 };
        if(s.indexOf("CM") != -1){ sum -= 200 };

        char c[] = s.toCharArray() ;  // be careful about writing; mistake one is string char[] c = s.toCharArray()
        for(int k = 0; k<c.length;k++){
          if(c[k] == 'M'){ sum += 1000 };
          if(c[k] == 'D'){ sum += 500 };
          if(c[k] == 'C'){ sum += 100 };
          if(c[k] == 'L'){ sum += 50 };
          if(c[k] == 'X'){ sum += 10 };
          if(c[k] == 'V'){ sum += 5 };
          if(c[k] == 'I'){ sum += 1 };

        }
        return sum;
    }
}
