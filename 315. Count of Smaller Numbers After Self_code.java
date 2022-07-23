class Solution {
   
	
    public List<Integer> countSmaller(int[] nums) {
	
        int[] count = new int [nums.length];
		
        int[] index = new int [nums.length];
		
        for (int i = 0; i<nums.length; ++i){
            count[i] = 0;
            index[i] = i;
        }
        
	
        merge(nums, 0, nums.length, count, index);
        
		
        Integer[] ans = new Integer[nums.length];
        for (int i = 0; i<nums.length; ++i){
            ans[index[i]] = count[i];
        }
        return Arrays.asList(ans);
    }
    void merge(int[] arr, int l, int r, int[] count, int[] index){
	   
        if (r-l < 2) return;
		
		
        final int m = (l+r)/2;
        merge(arr, l, m, count, index);
        merge(arr, m, r, count, index);
		
		
        int[] tmp_arr = new int[r-l];
        int[] tmp_count = new int[r-l];
        int[] tmp_index = new int[r-l];
        int i = 0;
        int left = l;
        int right = m;
        while (left < m && right < r){
		
            if (arr[left] <= arr[right]){
                tmp_arr[i] = arr[left];
                tmp_count[i] = count[left];
                tmp_index[i] = index[left];
                
		
                tmp_count[i] += right-m;
				
                ++left;
            }else {
                tmp_arr[i] = arr[right];
                tmp_count[i] = count[right];
                tmp_index[i] = index[right];
                ++right;
            }
            ++i;
        }
        
		
        while (left < m){
          
            tmp_arr[i] = arr[left];
            tmp_count[i] = count[left];
            tmp_index[i] = index[left];
            
			
            tmp_count[i] += r-m;
			
            ++i;
            ++left;
        }
		
		
        for (int j = 0; j<i; ++j){
            arr[j+l] = tmp_arr[j];
            count[j+l] = tmp_count[j];
            index[j+l] = tmp_index[j];
        }
        return;
    }
}
