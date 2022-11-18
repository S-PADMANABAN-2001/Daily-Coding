class Solution {
    static int noOfOpenDoors(Long N) {
        // code here
        double ans = Math.sqrt(N);
        return (int)(Math.floor(ans));
    }
};
