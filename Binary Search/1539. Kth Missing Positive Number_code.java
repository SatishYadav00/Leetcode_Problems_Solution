class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int l=0;
        int h=arr.length-1;
        
        
        while (l<=h){
            
       int mid=l+(h-l)/2;
            
      if (arr[mid]-mid-1>=k){
        h=mid-1;
      }
       else {
        l=mid+1;
        }
     }
       return l+k;
    }
}
