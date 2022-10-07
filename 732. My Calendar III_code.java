class MyCalendarThree {
     private TreeMap<Integer,Integer> temp;
    public MyCalendarThree() {
        temp=new TreeMap<>();
    }
    
    public int book(int start, int end) {
        temp.put(start,temp.getOrDefault(start,0)+1);
        temp.put(end,temp.getOrDefault(end,0)-1);
        int activeBooking=0;
        int maxActiveBookings=0;

       for(int events:temp.values())
       {
           activeBooking +=events;
           maxActiveBookings=Math.max(activeBooking,maxActiveBookings);
       }
       return maxActiveBookings;

    }
}
