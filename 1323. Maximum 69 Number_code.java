class Solution {
    public int maximum69Number (int num) {
        int rdc=-1;
        int count=0;
        int n=num;
        while(n>0)
        {
            int a=n%10;
            if(a==6) rdc=count;
            count++;

            n=n/10;
        }
        double ans= ((num) + (3 * Math.pow(10,rdc)));
        return (int) ans;
    }
}
