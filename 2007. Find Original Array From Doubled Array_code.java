class Solution {
    public int[] findOriginalArray(int[] changed) {
         List<Integer> result = new ArrayList<>();
         Queue<Integer> q = new java.util.LinkedList();
        
        Arrays.sort(changed);
        
        for(int num : changed){
            if(!q.isEmpty() && num == q.peek()){
                q.poll();
            }else{
                q.offer(num * 2);
                result.add(num);
            }
        }
        
        return !q.isEmpty() ? new int[] {} :  result.stream().mapToInt(i -> i).toArray();
    }
}
