17. Letter Combinations of a Phone Number
Given a string containing digits from 2-9 inclusive, return all possible letter
combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given
below. Note that 1 does not map to any letters.

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedLits<String>();
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if digits.isEmpty() return ans;
        ans.add("");
        for(i = 0; i < digits.length(); i++){
          int x = Character.getNumericValue(digits.charAt(i));
          if(ans.peeck().length() == i){
            String h = ans.remove();
            for(char s : mapping[x].toCharArray){
              ans.add(h+s);
            }
          }
        }
        return ans;
    }
}
