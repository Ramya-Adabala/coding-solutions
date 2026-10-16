import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            if (line == null) break;

            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            String a = br.readLine().trim();

            ArrayList<Integer> onePositions = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    onePositions.add(i);
                }
            }

            long k = onePositions.size();

            // Case 1: All zeros
            if (k == 0) {
                sb.append(n * m).append("\n");
                continue;
            }

            // Case 2: Total ones is odd
            if ((k * m) % 2 != 0) {
                sb.append(0).append("\n");
                continue;
            }

            long target = (k * m) / 2;
            long r = target % k;

            if (r == 0) {
                // Split occurs between two full copies
                int firstOne = onePositions.get(0);
                int lastOne = onePositions.get((int) k - 1);
                long leadingZeros = firstOne;
                long trailingZeros = n - 1 - lastOne;

                sb.append(leadingZeros + trailingZeros + 1).append("\n");
            } else {
                // Split occurs inside a copy
                int idx1 = onePositions.get((int) r - 1);
                int idx2 = onePositions.get((int) r);

                sb.append(idx2 - idx1).append("\n");
            }
        }

        System.out.print(sb);
    }
}