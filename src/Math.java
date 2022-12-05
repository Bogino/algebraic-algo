public class Math {

    public static long pov(int base, int power) {

        long result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }

    public static int fibbo(int order) {

        int firstValue = 1;
        int secondValue = 1;
        int fibboValue = 0;

        for (int i = 3; i <= order; i++) {
            fibboValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = fibboValue;
        }

        return fibboValue;
    }

    public static int recursiveFibbo(int order) {

        if (order == 0 || order == 1) return order;
        return recursiveFibbo(order - 1) + recursiveFibbo(order - 2);
    }

    public static int getPrimesCount(int n) {

        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int n) {

        int dividerCount = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dividerCount++;
            }
        }

        return dividerCount == 2;
    }
}
