class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
		for (int i = 0; i < mat.length; i++) {
			minHeap.add(new int[] { i, search(mat[i]) });
		}
		int[] ans = new int[k];
		for (int i = 0; i < k; i++) {
			ans[i] = minHeap.poll()[0];
		}
		return ans;
	}

	//return occurence of first 1 in array.
	private int search(int[] input) {
		int l = 0;
		int r = input.length;
		int mid;
		while (l < r) {
			mid = (l + r) / 2;
			if (input[mid] == 1) {
				l = mid + 1;
			} else {
				r = mid;
			}
		}
		return l;
        
    }
}
