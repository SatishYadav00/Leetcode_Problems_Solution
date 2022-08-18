class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        
        for(int i :arr)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        
        List<Integer>lst=new ArrayList<>(mp.values());
        Collections.sort(lst,Collections.reverseOrder());
        
        int count=0;
        int total=n;
        int k=0;
        while(total>n/2)
        {
            total-=lst.get(k++);
            count++;
        }
        return count;
        
        
    }
}
