6. ZigZag Conversion
The string "PAYPALISHIRING" is written in a zigzag
pattern on a given number of rows like this: (you may want
to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = s.length();
        StringBuffer [] sb = new StringBuffer [numRows];
        for (int i = 0; i<numRows;i++){
          sb[i] = new StringBuffer();      //one mistake of mising ()
        }
        int point = 0;
        while(point<len){
          for(int i = 0; i<numRows && point < len;i++){
            sb[i].append(c[point++]);
          }
          for(int i = numRows-2; i>=1 && point <len;i--){  // opposite way back to store should be -2!!!,and till i=1 rather than 0 should stop!!! 
            sb[i].append(c[point++]);
          }
        }
        for(int k =1; k <numRows; k++){
          sb[0].append(sb[k]);
        }
        return sb[0].toString();


    }
}
