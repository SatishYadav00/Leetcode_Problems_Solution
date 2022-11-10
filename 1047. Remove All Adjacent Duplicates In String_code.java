class Solution {
    public String removeDuplicates(String s) {
          Stack<Character> stack = new Stack<>();

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if (stack.isEmpty()){
                stack.push(ch);
            }
            else if(ch==stack.peek()){
                    stack.pop();
            }
            else
                stack.push(ch);
        }

        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()){
            str.insert(0,stack.pop());
        }

        return str.toString();
    }
}
