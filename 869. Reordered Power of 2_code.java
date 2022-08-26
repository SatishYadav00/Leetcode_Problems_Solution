class Solution {
    public boolean reorderedPowerOf2(int n) {
        
      int Count[] = Count(n);
        int num = 1;
        for (int i = 0; i < 31; i++) {
            int[] PowerCount = Count(num);
            if (Equal(Count, PowerCount)) {
                return true;
            }
            num*= 2;
        }
        return false;
    }

    private int[] Count(int N) {
        int Count[] = new int[10];
        while (N != 0) {
            Count[N % 10]++;
            N /= 10;
        }
        return Count;
    }

    private boolean Equal(int ar1[], int ar2[]) {
        for (int i = 0; i < ar2.length; i++) {
            if (ar1[i] != ar2[i]) {
                return false;
            }
        }
        return true;
    }
}
