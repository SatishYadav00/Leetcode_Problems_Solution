class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
           HashSet<Integer> Set=new HashSet();
        int Sum = 0;
        int  prevSum=0; 

        for(int n : nums) {
            Sum += n;
            if(Set.contains(Sum%k)) {
                return true;
            }
            Sum %=k;
            Set.add(prevSum);
            prevSum = Sum;
        }
        return false;
    }
}
