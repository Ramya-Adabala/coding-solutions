class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int t = start;
            start = destination;
            destination = t;
        }

        int res = 0, total = 0;
        for (int i = 0; i < distance.length; i++) {
            if (i >= start && i < destination) {
                res += distance[i]; 
            }
            total += distance[i]; 
        }

        return Math.min(res, total - res);
    }
}