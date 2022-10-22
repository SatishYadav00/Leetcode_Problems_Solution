class Solution {
    public String minWindow(String s, String t) {
         if(s.length()<t.length()) return "";

        String ans="";
        HashMap<Character,Integer> m=new HashMap<>();

        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }

        int match=0,dmtch=t.length();

        HashMap<Character,Integer> m1=new HashMap<>();
        int i=-1,j=-1;

        while(true){
            boolean flag1=false;
            boolean flag2=false;
            // accquire
            while(i<s.length()-1 && match<dmtch){
                i++;
                char ch=s.charAt(i);
                m1.put(ch,m1.getOrDefault(ch,0)+1);
                if(m1.getOrDefault(ch,0)<=m.getOrDefault(ch,0)){
                    match++;
                }
                flag1=true;
            }
            //collect and release answers
            while(j<i && match==dmtch){
                String temp=s.substring(j+1,i+1);
                if(ans.length()==0 || temp.length()<ans.length()){
                    ans=temp;
                }
                j++;
                char c=s.charAt(j);
                if(m1.get(c)==1){
                    m1.remove(c);
                }else{
                    m1.put(c,m1.get(c)-1);
                }

                if(m1.getOrDefault(c,0)<m.getOrDefault(c,0)){
                    match--;
                }
                flag2=true;
            }
            if(!flag1 && !flag2){
                break;
            }
        }
        return ans;
    }
}
