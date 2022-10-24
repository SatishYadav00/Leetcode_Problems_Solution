class Solution {
    public int maxLength(List<String> arr) {
        List<String> str=new ArrayList<>();
        int ans=0;

        str.add("");
        for(String s : arr)
        {
            if(!isValid(s))
            continue;

            List<String> newAns=new ArrayList<>();
            for(String candidate : str)
            {
                String temp = candidate+s;
                if(isValid(temp))
                {
                    newAns.add(temp);
                    ans=Math.max(ans,temp.length());
                }

            }
            str.addAll(newAns);
        }
    
    return ans;
}


private boolean isValid(String s)
{
    if(s.length() >26 ) return false;
    int [] freq=new int[26];
    char[] arr=s.toCharArray();
    for(char ch : arr)
    {
        freq[ch-'a']++;
        if(freq[ch-'a']>1)
        {
            return false;
        }
    }
    return true;
} 
        
        
}
