class Solution {

    public int[] findOrder(int numCourses, int[][] pre) {
     
       int[] ingress=new int[numCourses];
       ArrayList<ArrayList<Integer>> graph=graph_creator(numCourses,pre);
       Arrays.fill(ingress,0);
       for(int i=0;i<numCourses;i++){
           for(int j:graph.get(i)){
           ingress[j]++;
           }
       }
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<numCourses;i++){
           if(ingress[i]==0) q.add(i);
       }
       ArrayList<Integer> ans=new ArrayList<>();
       while(!q.isEmpty()){
           int node=q.poll();
           ans.add(node);
           for(int i:graph.get(node)){
               ingress[i]--;
               if(ingress[i]==0) q.add(i);
           }
       }
       if(ans.size()!=numCourses) return new int[0];
       int[] output=new int[ans.size()];
       for(int i=0;i<ans.size();i++){
           output[i]=ans.get(i);
       }
       return output;
   }
   ArrayList<ArrayList<Integer>> graph_creator(int n,int[][]pre){
       ArrayList<ArrayList<Integer>> graph=new ArrayList<>(n);
       for(int i=0;i<n;i++) graph.add(new ArrayList<>());
       for(int[] temp:pre) graph.get(temp[1]).add(temp[0]);
       return graph;
   }
}
