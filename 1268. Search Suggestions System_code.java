class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
       List<List<String>> ls = new ArrayList<>();
		 Arrays.sort(products);
		
		//<Product Value, Id in sorted array>
        TreeMap<String, Integer> tm = new TreeMap<>();
        List<String> productList = Arrays.asList(products);
        
        for(int i = 0; i<products.length; i++){
            tm.put(products[i], i);
        }
        
        String key = "";
        for(char ch : searchWord.toCharArray()){
            key += ch;
			
		
           String ceiling = tm.ceilingKey(key);   
		   
     
          String floor = tm.floorKey(key + "{");     //using opening bracket here to cover the complete range of lowercase characters as we have ASCII value of z is 122 & ASCII value of '{' is 123, In order to cover the range starting from 'm' (ATQ) up till the last char of z, basically it will check in this range m<=words<=m{  (here m is first char of our searchword)
            
            if(ceiling == null || floor == null)    //this condition will avoid null pointer exception 
            {
                break;
            }           
            ls.add(productList.subList(tm.get(ceiling), Math.min(tm.get(ceiling)+3,tm.get(floor)+1))); 
        }
        
        while(ls.size()<searchWord.length()){     //if list size is less than the length of our searchword then we return empty list here
            ls.add(new ArrayList<>());
        }
        
        return ls;
        
    
    }
}
