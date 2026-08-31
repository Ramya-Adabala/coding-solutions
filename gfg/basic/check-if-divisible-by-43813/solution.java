class Solution {
    boolean divisibleBy4(String s) {
        // code here
          int num = Integer.parseInt(s.substring(Math.max(0, s.length()- 2)));
          if(num%4==0){
              return true;
          }
          else return false;
    }
}