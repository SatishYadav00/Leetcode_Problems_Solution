class Solution {
    public String makeGood(String s) {
        
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(!st.isEmpty() && Math.abs(st.peek()-c)==32)
            {
                st.pop();

            }
            else
            {
                st.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0)
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
