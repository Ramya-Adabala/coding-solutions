class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
Map<Character,Character> obj1=new HashMap<>();
Map<Character,Character> obj2=new HashMap<>();
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    char th=t.charAt(i);
    if(obj1.containsKey(ch) && obj1.get(ch)!=th)
 return false;
 if(obj2.containsKey(th) && obj2.get(th)!=ch)
 return false;
 obj1.put(ch,th);
 obj2.put(th,ch);
 }
 return true;
    }
}