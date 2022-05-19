public class NestedIterator implements Iterator<Integer> {
    
    List<Integer> lst=new ArrayList<Integer>();
    int index=0;
    public NestedIterator(List<NestedInteger> nestedList) {
        getElements(nestedList,lst);
    }

    @Override
    public Integer next() {
        int nextElem=0;
        if(hasNext()){
             nextElem=lst.get(index);
            index++;
        }
        return nextElem;
    }

    @Override
    public boolean hasNext() {
        if(index>lst.size()-1){
            return false;
        }
        return true;
    }
    
    public List<Integer> getElements(List<NestedInteger> nestedList,List<Integer> lst){
        for(int i=0;i<nestedList.size();i++){
            if(nestedList.get(i).isInteger()){
                lst.add(nestedList.get(i).getInteger());
            }else{
                getElements(nestedList.get(i).getList(),lst);
            }
        }
        
        return lst;
    }
}
