class Solution {
    public String sandwichedVowel(String str) {
        // code here
        if(str.length() < 3){
                  return str;
              }

              StringBuilder sb = new StringBuilder();

              sb.append(str.charAt(0));

              for(int i=1; i<str.length() - 1; i++){
                  char l = str.charAt(i-1);
                  char c = str.charAt(i);
                  char r = str.charAt(i+1);

                  if(l != 'a' && l != 'e' && l != 'i' && l != 'o' && l != 'u'){
                       if(r != 'a' && r != 'e' && r != 'i' && r != 'o' && r != 'u'){
                           if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                                  continue;
                           }
                      }
                  }
                  sb.append(c);

              }

              sb.append(str.charAt(str.length()-1));

              return sb.toString();
    }
}