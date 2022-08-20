class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(startFuel==target) return 0;
        int count=0;
        int start=startFuel;
        
        PriorityQueue<Integer>pri=new PriorityQueue<>((a,b) ->(b-a));
        
        for(int [] station :stations)
        {
            int next=station[0];
            int fuel=station[1];
            System.out.println(fuel);
            while(start <next)
            {
              if(pri.isEmpty()) return -1;
           
            int maxFuel=pri.poll();
           
            start=start+maxFuel;
            count++;
            }
            pri.offer(fuel);
            
        }
        
        while(start < target)
        {
         
            if(pri.isEmpty()) return -1;
           
            int maxFuel=pri.poll();
            start=start+maxFuel;
            count++;
        
        
        }
        
        
        return count;
    }
}
