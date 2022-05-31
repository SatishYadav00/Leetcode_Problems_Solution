class Solution {
    public boolean hasAllCodes(String s, int k) {
        if (s.length() <= k)
            return false;
        
        int n = (int) Math.pow(2, k);
        int[] store = new int[n];
        
        for (int i = 0; i <= s.length() - k; i++)
        {
            int ans = 0;
            for (int j = i + k - 1; j >= i; j--) {
                if (s.charAt(j) == '1')
                    ans += (int) Math.pow(2, (i + k - 1) - j);
            }
            store[ans]++;
        }
        
        for (int i = 0; i < n; i++)
            if(store[i] == 0)
                return false;
       
        return true;
        
    }
}
