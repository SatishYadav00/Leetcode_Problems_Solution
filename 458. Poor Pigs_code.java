class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int x=(minutesToTest)/(minutesToDie)+1;
        int n= (int)Math.ceil(Math.log(buckets)/Math.log(x));
        return n;
    }
}
