import java.math.BigInteger;

public class BigIntRewrite {
    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.ONE;

        BigInteger t = pow(x, n / 2);

        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
    public static void main(String[] args) {
        // Test cases
        int x = 2;
        int n = 10;
        BigInteger result = pow(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}