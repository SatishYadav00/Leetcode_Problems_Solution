class Solution {
    public int[] sortByBits(int[] arr) {
        
         int[][] map = new int[arr.length][2];
        for (int i=0; i < arr.length; i++){
            map[i][0]= oneBits(arr[i]);
            map[i][1]= arr[i];
        }
        Arrays.sort(map, (a,b)-> (a[0]!=b[0])?a[0]-b[0]:a[1]-b[1]);
        int[] result = new int[arr.length];
        for (int i = 0; i <arr.length; i++)
            result[i]=map[i][1];
        return result;
    }
    private Integer oneBits(int num){
        int result = 0;
        while(num!=0){
            result += (num & 1);
            num=num>>1;
        }
        return result;
    }
    }
