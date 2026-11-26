class Solution {
   public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
       int i = 0, j = 0, k = 0;
       ArrayList<Integer> al = new ArrayList<>();

       while (i < a.length && j < b.length && k < c.length) {
           if (a[i] == b[j] && b[j] == c[k]) {
               if (al.isEmpty() || al.get(al.size() - 1) != a[i]) {
                   al.add(a[i]);
               }
               i++;
               j++;
               k++;
           } else if (a[i] < b[j]) {
               i++;
           } else if (b[j] < c[k]) {
               j++;
           } else {
               k++;
           }
       }

       return al;
   }
}