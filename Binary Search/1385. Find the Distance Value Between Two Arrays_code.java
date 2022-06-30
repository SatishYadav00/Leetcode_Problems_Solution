class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int n=arr1.length;
        int c=0;
        Arrays.sort(arr2);
        
        for(int i=0;i<n;i++)
        {
            if(val(arr2,arr1[i],d))
             c++;
        }
        return c;
        
    }
    
    boolean val(int arr2[],int e,int d)
    {
        int i=0;
        int j=arr2.length-1;
           
        while(i <= j) {
            int mid =(i+j)/2;
            int dif = arr2[mid] - e;
            if(Math.abs(dif) <= d) {
                return false;
            } else if(arr2[mid] > e) {
                j= mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return true;
    }
}
