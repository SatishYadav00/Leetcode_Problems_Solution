class Solution {
   int s=0;
    public int totalNQueens(int n) {
        boolean[] k=new boolean[n];
        boolean[] p= new boolean[2*n-1];
        boolean[] a=new boolean[2*n-1];
        task(0, n,k,p,a);
        return s;
    }
    public void task(int x, int n, boolean[] k, boolean[] p, boolean[] a) {
        if (x==n) {
            s++;
            return;
        }
        for(int i=0;i<n;i++) 
        {
            if(!k[i]&&!p[i+x]&&!a[n-1-x+i]) 
            {
                k[i]=p[i+x]=a[n-1-x+i]=true;
                task(x+1,n,k,p,a);
                k[i]=p[i+x]=a[n-1-x+i]=false;
            }
        }
    }
}
