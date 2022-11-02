class Solution {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String>hs=new HashSet<>();
        Queue<String>q=new LinkedList<>();

        q.add(start);
        hs.add(start);
        int ans=0;   //steps

        while(!q.isEmpty())
        {
         int size=q.size();

         for(int i=0;i<size;i++)
         {
             String str=q.remove();
             if(str.equals(end))
             return ans;

             for(char c:new char[] {'A','C','G','T'})
             {
                 for(int j=0;j<str.length();j++)
                 {
                     String s=str.substring(0,j)+c+str.substring(j + 1);

                     if(!hs.contains(s) && Arrays.asList(bank).contains(s))
                     {
                         q.add(s);
                         hs.add(s);
                     }
                 }
             }
         }
         ans++;
        }
        return -1;
    }
}
