class MyStack {
        
        static Queue<Integer>q1=new LinkedList<Integer>();
        static Queue<Integer>q2=new LinkedList<Integer>();
        int curr_size;

    public MyStack() {
        curr_size=0;
    }
    
    public void push(int x) {
        curr_size++;
            q2.add(x);
            
            
            while(!q1.isEmpty())
            {
                    q2.add(q1.peek());
                    q1.remove();
            }
            
            Queue<Integer> q=q1;
                           q1=q2;
                            q2=q;
    }
    
    public int pop() {
        if(q1.isEmpty())
        {
                return -1;
        }
           int x =q1.remove();
           curr_size--;
            return x;
            
    }
    
    public int top() {
             if(q1.isEmpty())
        {
                return -1;
        }
            return q1.peek();
        
    }
    
    public boolean empty() {
            if(curr_size==0)
            return true;
            else 
              return false;
    }
}
