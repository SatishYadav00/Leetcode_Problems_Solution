class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        
        int l = 0;
        int r = heights.length - 1;
        int answer = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (isPossible(heights, bricks, ladders, mid)) {
                answer = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return answer;
    }
    
    public boolean isPossible(int[] h, int b, int l, int idx) {
        List<Integer> jumps = new ArrayList<>();
        for (int i = 1; i <= idx; i++) {
            if (h[i] > h[i-1]) {
				//  jump required
                jumps.add(h[i] - h[i-1]);
            }
        }
        Collections.sort(jumps, Collections.reverseOrder());
        int neededBricks = 0;
        for (int i = l; i < jumps.size(); i++) {
            neededBricks += jumps.get(i);
            if (neededBricks > b) {
                return false;
            }
        }
        return true;
    }
}
