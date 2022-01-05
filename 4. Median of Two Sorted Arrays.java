class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       if(nums1.length > nums2.length) {
           int [] temp= nums1;
           nums1=nums2;
           nums2=temp;
           
       } 
        
    int lo=0;
    int h1=nums1.length;
    int comlen=nums1.length+nums2.length;
    
        
        while(lo <= h1) {
            int part1 = (lo+h1)/2;
            int part2 = (comlen+1)/2-part1;
            
            int left1=getMax(nums1,part1);
            int right1=getMin(nums1,part1);
            
            
            int left2=getMax(nums2,part2);
            int right2=getMin(nums2,part2);
            
            if(left1 <= right2 && left2 <=right1) {
                if(comlen %2==0) {
                    return (Math.max(left1,left2) + Math.min(right1,right2))/2.0;
                }
                return Math.max(left1,left2);
            }
            
            
            if(left1 >right2) {
                h1=part1-1;
                
            } else{
                lo=part1+1;
            }
            
            
            
            
        }
        return -1;
    }
    
    private int getMax(int [] nums,int partition) {
        if (partition == 0){
            return (int) Double.NEGATIVE_INFINITY;
            
        }
        else {
            return nums[partition -1];
        }
        
    }
    
    private int getMin(int [] nums,int partition) {
        if (partition == nums.length){
            return (int) Double.POSITIVE_INFINITY;
            
        }
        else {
            return nums[partition];
        }
        
    }
    
    
    
    
}
