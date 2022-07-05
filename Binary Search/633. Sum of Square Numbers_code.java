class Solution {
    public boolean judgeSquareSum(int c) {
        long start = 0;
		long end =(long) Math.sqrt(c);
		
		while(start <= end)
		{
			long sq = start*start + end*end;
			if(sq == c)
				return true;
			else if(sq < c)
				start = start +1;
			else
				end = end -1;
		}
		
		return false;

    }
}
