class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        List<Seed>plant=new ArrayList<>();
        for(int i=0;i<plantTime.length;i++){
            plant.add(new Seed(plantTime[i],growTime[i]));
        }
        Collections.sort(plant,(a,b) ->(b.growTime-a.growTime));

        int time=0;
        int ans=0;
        for(int i=0;i<plantTime.length;i++)
        {
            time=time+plant.get(i).plantTime;
            ans=Math.max(ans,time+plant.get(i).growTime);
        }
        return ans;

    }
    private class Seed{
        int plantTime;
        int growTime;

        public Seed(int p,int g)
        {
            this.plantTime=p;
            this.growTime=g;
        }
    }
}
