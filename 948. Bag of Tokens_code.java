class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
     
        Arrays.sort(tokens);
        int l=0;
        int h=tokens.length-1;
        int score=0;
        int maxscore=0;
        
        
        while(l<=h)
        {
            if(power>=tokens[l])
            {  power-=tokens[l];
             l++;
             score++;
             maxscore=Math.max(maxscore,score);
            }
            else if(score>0)
            {
               power+=tokens[h--];
                score--;
            }
            else
            {
                break;
            }
        }
        return maxscore;
    }
}
