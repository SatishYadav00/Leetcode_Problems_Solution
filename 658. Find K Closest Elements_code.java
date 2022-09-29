class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int l=0;
        int h=arr.length-1;
      
        
        List<Integer> res=new ArrayList<>();
          
        while(h-l+1>k)
        {
            if(Math.abs(x-arr[l])>Math.abs(x-arr[h]))
            {
                l++;
            }
            else if(Math.abs(x-arr[l])<=Math.abs(x-arr[h]))
            {
                h--;
            } 
        }
            for(int i=l;i<=h;i++)
            {
              res.add(arr[i]);
            }
        return res;
            
        }
        
    }
