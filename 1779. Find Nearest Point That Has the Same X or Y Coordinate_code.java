class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1; //Initial as -1, so if no valid point, return -1
        int distance = Integer.MAX_VALUE;
        int i = 0;
        for(int[] point : points){
            if(point[0] == x || point[1] == y){
                int curDistance = Math.abs(point[0] - x) + Math.abs(point[1] - y);
                if(curDistance < distance){ // only update distance when current distance is less, so it keeps the smallest index when multiple same distance point exists
                    distance = curDistance;
                    index = i;
                }
            }
            i++;
        }
        return index;
    }
}
