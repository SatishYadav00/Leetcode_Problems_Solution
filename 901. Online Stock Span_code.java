class StockSpanner {
    
    class Pair {
        private final int index;
        private final int value;
        
        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
        
        public int getIndex() {
            return this.index;
        }
        
        public int getValue() {
            return this.value;
        }
        
        public String toString() {
            return this.index + ":" + this.value;
        }
    }

    private final LinkedList<Pair> s;
    private int index;
    
    public StockSpanner() {
        this.s = new LinkedList<>();
    }
    
    //100,80,
    public int next(int price) {        
        System.out.println(s);
        if(s.size() > 0 && s.peek().getValue() <= price) {
            Pair pair = null;
            while(s.size() > 0 && s.peek().getValue() <= price) {
                pair = s.pop();                
            }
            int r = index + 1;
            if(s.size() > 0) {              
                r = index - s.peek().getIndex(); 
            }
                s.push(new Pair(index, price));
                index++;            
            return r;
        }
        else {
            s.push(new Pair(index, price));
            index++;
            return 1;
        }
    }
}
