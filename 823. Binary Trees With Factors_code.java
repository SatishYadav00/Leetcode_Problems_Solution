class Solution {
    static final int MD = 1000000007;
    public int numFactoredBinaryTrees(int[] arr) {
        long count=0;
        Arrays.sort(arr);
        HashMap<Integer,Long>mp=new HashMap<>();
        
        mp.put(arr[0],count);
        
        for(int i=0;i<arr.length;i++)
        {
            long sum=1;
            for(int j=0;j<i;j++)
            {
                 if(arr[i]%arr[j]==0 && mp.containsKey(arr[i]/arr[j]))
                 {
                  sum+=(mp.get(arr[i]/arr[j]) * mp.get(arr[j]));
                     }
            }
            
            mp.put(arr[i],sum);
            count+=sum;
        }
        return  (int) (count%MD);
        
    }
}
