class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> finalInterval;
            if(intervals.size()==0)
            {
                    return finalInterval;
            }
            sort(intervals.begin(),intervals.end());
            vector<int> temp=intervals[0];
            for(auto a : intervals){
                    if(a[0]<=temp[1])
                    {
                            temp[1]=max(a[1],temp[1]);
                    }
                 else
                 {
                    finalInterval.push_back(temp);
                         temp=a;
                 }            
    }
             finalInterval.push_back(temp);
              return finalInterval;
            
            
            
    }
};
