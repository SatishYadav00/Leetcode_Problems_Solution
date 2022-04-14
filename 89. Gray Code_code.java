class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer>res=new ArrayList<>();
            res.add(0);
            
            if(n==0) return res;
            res.add(1);
            int curr=1;
            for(int i=2;i<=n;i++)
            {
                    curr *=2;
                    for(int j=res.size()-1;j>=0;j--)
                    {
                            res.add(curr+res.get(j));
                    }
            }
            return res;
    }
}
