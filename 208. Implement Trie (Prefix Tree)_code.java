class Trinode{
        Trinode [] child=new Trinode[26];
        boolean isEnd=false;
}

class Trie {

    
           Trinode root;
            public Trie(){
                    root=new Trinode();
            }
        
    
    
    public void insert(String word) {
        
            Trinode node=root;
            for(int i=0;i<word.length();i++)
            {
                    char c=word.charAt(i);
                    if(node.child[c-'a']==null)
                    {
                            node.child[c-'a']=new Trinode();
                            
                    }
                    node=node.child[c-'a'];
            }
            node.isEnd=true;
    }
    
    public boolean search(String word) {
          Trinode node=root;
            for(int i=0;i<word.length();i++)
            {
                    char c=word.charAt(i);
                    if(node.child[c-'a']==null)
                    {
                             return false;
                    }
                     node=node.child[c-'a'];
            }
            return node.isEnd;
                    
    }
    
    public boolean startsWith(String prefix) {
            
         Trinode node=root;
            for(int i=0;i<prefix.length();i++)
            {
                    char c=prefix.charAt(i);
                    if(node.child[c-'a']==null)
                    {
                             return false;
                    }
                     node=node.child[c-'a'];
            }
            return true;
    }
}
