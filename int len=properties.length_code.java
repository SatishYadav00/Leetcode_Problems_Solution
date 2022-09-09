class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int count=0;
        Arrays.sort(properties,(a,b)->(a[0]==b[0]) ? Integer.compare(b[1],a[1]): Integer.compare(a[0],b[0]));
         int len=properties.length;
        int max=properties[len-1][1];
        
        for(int i=len-2;i>=0;i--)
        {
            if(properties[i][1]<max){
                count++;
            }
            else
            {
                max=properties[i][1];
            }
        }
        return count;
        
    }
}
