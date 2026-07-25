class Solution {
public:
    int maxProduct(int n) {
        
        vector <int> x;
        int cnt=0;

        while (n){
            int y=n%10;
            x.push_back(y);
            n=n/10;
            cnt++;
        }
        sort(x.begin(),x.end());
        return x[cnt-1]* x[cnt-2];

    }
};