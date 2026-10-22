
class Solution {
    public double myPow(double x, int n) {
        long power = n;
        double result = 1.0;

        if (power < 0) {
            power = power*(-1);
        }

        while (power > 0) {
            if (power % 2 == 1) {
                result = result * x;
                power --;
            }
            else{
                x = x * x;
                power = power / 2;
            }
        }

        if (n < 0) {
            result =(double) 1.0 / (double)result;
        }

        return result;
    }
}

