class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String>ans=new ArrayList<>();
        HashMap<String ,Integer> hm=new HashMap<>();
        PriorityQueue<Map.Entry<String,Integer>> mheap=new PriorityQueue<>(
        new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer>w1,Map.Entry<String,Integer>w2)
            {
                if(w1.getValue() != w2.getValue())
                {
                    return w2.getValue()-w1.getValue();
                }
                return w1.getKey().compareTo(w2.getKey());
            }
        });


       for(String s:words)
       hm.put(s,hm.getOrDefault(s,0)+1);
       for (Map.Entry<String, Integer> entry : hm.entrySet())
			mheap.offer(entry);
		while (k > 0) {
			ans.add(mheap.poll().getKey());
			k--;
		}
   return ans;
    }
}
