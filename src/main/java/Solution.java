class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;

        double logBase3 = Math.log(n) / Math.log(3);
        return Math.floor(logBase3) == logBase3; //checks if integer
    }
}