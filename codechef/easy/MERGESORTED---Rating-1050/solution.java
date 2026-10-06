import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[m];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        
       
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                sb.append(a[i]).append(" ");
                i++;
            } else {
                sb.append(b[j]).append(" ");
                j++;
            }
        }
        
      
        while (i < n) {
            sb.append(a[i]).append(" ");
            i++;
        }
        
      
        while (j < m) {
            sb.append(b[j]).append(" ");
            j++;
        }
        
        System.out.println(sb.toString().trim());
    }
}