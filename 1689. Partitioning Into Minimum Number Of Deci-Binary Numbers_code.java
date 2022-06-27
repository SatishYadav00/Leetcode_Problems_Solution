class Solution {
    public int minPartitions(String n) {
        int res=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(res<(ch-'0')) res=ch-'0';
            
        }
        return res;
    }
}
