class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int sum,n=nums.size();
            int out;
            int min=INT_MAX;
            sort(nums.begin(),nums.end());
            for(int i=0;i<n-2;i++)
            {
                    if(i==0 || nums[i] !=nums[i-1])
                    {
                            int L=i+1;
                            int R=n-1;
                    
                    while(L<R)
                    {
                            sum=nums[i]+nums[L]+nums[R];
                            if(sum==target)
                                    return sum;
                            else if(sum<target)
                                    L++;
                            else
                                    R--;
                            if(abs(sum-target)<min)
                            {
                                    out=sum;
                                    min=abs(sum-target);
                            }
                    }
            }
            
                    
    }
    return out;
    }
};

// JAVA code

class Solution {
    public int threeSumClosest(int[] nums, int target) {
          int sum,n=nums.length;
            int out=0;
            int min=Integer.MAX_VALUE;
          Arrays.sort(nums);
            for(int i=0;i<n-2;i++)
            {
                    if(i==0 || nums[i] !=nums[i-1])
                    {
                            int L=i+1;
                            int R=n-1;
                    
                    while(L<R)
                    {
                            sum=nums[i]+nums[L]+nums[R];
                            if(sum==target)
                                    return sum;
                            else if(sum<target)
                                    L++;
                            else
                                    R--;
                            if(Math.abs(sum-target)<min)
                            {
                                    out=sum;
                                    min=Math.abs(sum-target);
                            }
                    }
            }
            
                    
    }
    return out;
    }
}
