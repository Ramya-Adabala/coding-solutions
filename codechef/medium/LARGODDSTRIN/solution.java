 public static String findLargestOddSubstring(String num) {
     //write your code here...
     int n=num.length();
     String s=num;
     for(int i=n-1;i>=0;i--){
         if(num.charAt(i)%2==1)
         return num.substring(0,i+1);
  
     }
     return "-1";
 }