class Solution{

   public int[] maxSlidingWindow(int[] nums, int k){
     int i=0,j=0,m=0;
     int n=nums.length;
     List<Integer>list=new ArrayList<>();
     int [] ans=new int[n-k+1];
     while(j<n)
     {
       while(list.size()>0 && list.get(list.size()-1)<nums[j])
       {
        list.remove(list.size()-1); 
       }
       
       list.add(nums[j]);
       
       if(j-i+1<k)
          {
            j++;
           }
       else if(j-i+1==k){
        ans[m]=list.get(0);
         if(list.get(0)==nums[i])
         {
          list.remove(0);
           
         }
         j++;
         i++;
         m++;
       }

  }
   

     return ans;
     
   }
}
