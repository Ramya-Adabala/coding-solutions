class Solution {
    public String makeEven(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int index = -1;
        int large=arr[n-1]-'0';

        // find rightmost even digit
        for (int i = 0; i < n; i++) {
            if ((arr[i] - '0') % 2 == 0) {
                index = i;
                if(large>arr[i]-'0'){

                break;}
            }
        }

        // if no even digit found
        if (index == -1) return s;

        // swap with last digit
        char temp = arr[n - 1];
        arr[n - 1] = arr[index];
        arr[index] = temp;

        return new String(arr);
    }
}