
class Solution {
    public double myPow(double x, int n) {
        long power = n;
        double result = 1.0;

        if (power < 0) {
            power = -power;
        }

        while (power > 0) {
            if (power % 2 == 1) {
                result = result * x;
                power --;
            }

            x = x * x;
            power = power / 2;
        }

        if (n < 0) {
            result = 1.0 / result;
        }

        return result;
    }
}

