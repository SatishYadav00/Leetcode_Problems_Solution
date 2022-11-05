public class Solution {
    public class Node{
         boolean isWord = false;
         Node[] children = new Node[26];
        boolean eow = false;  //end of word
        public Node(){
               for(int i=0;i<26;i++)
            {
               children[i]=null;
            }

        }
    }
    
    Node root = new Node();
    boolean[][] flag;
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> result = new HashSet<>();
        flag = new boolean[board.length][board[0].length];
        
        insert(words);
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(root.children[board[i][j] - 'a'] != null){
                    search(board, i, j, root, "", result);
                }
            }
        }
        
        return new LinkedList<>(result);
    }
    
    private void insert(String[] words){
        for(String word: words){
             Node curr=root;
        for(int level=0;level<word.length();level++)
        {
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;

        }
    }
    
    private void search(char[][] board, int i, int j, Node node, String word, Set<String> result){
        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || flag[i][j]|| node.children[board[i][j] - 'a'] == null){
            return;
        }
        
        flag[i][j] = true;
        node = node.children[board[i][j] - 'a'];
        if(node.eow){
            result.add(word + board[i][j]);
        }
        
        search(board, i-1, j, node, word + board[i][j], result);
        search(board, i+1, j, node, word + board[i][j], result);
        search(board, i, j-1, node, word + board[i][j], result);
        search(board, i, j+1, node, word + board[i][j], result);
        
        flag[i][j] = false;
    }
}
