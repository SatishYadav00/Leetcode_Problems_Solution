class MedianFinder {
       ArrayList<Integer> list;
    public MedianFinder() {
        list=new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        int flag=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=num){
                list.add(i,num);
                flag=1;
                break;
            }
        }
        if(flag==0)
            list.add(num);
    }
    
    public double findMedian() {
        double ans=0;
        if(list.size()%2==0)
            ans=(list.get(list.size()/2)+list.get(list.size()/2-1))/2.0;
        else
            ans=list.get(list.size()/2);
        return ans;
    }
}
