class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Average: " + findAverage(arr));
        System.out.println("Is Prime 7: " + isPrime(7));
        System.out.println("Factorial 5: " + factorial(5));
        System.out.println("Fibonacci 5: " + fibonacci(5));
        System.out.println("Power 2^10: " + power(2, 10));
        System.out.println("Is all digits (123a12): " + isAllDigits("123a12"));
        System.out.println("Binomial C(7,3): " + binomial(7, 3));
        System.out.println("GCD(32, 48): " + gcd(32, 48));
        
        System.out.println("Permutations of IOX:");
        permute("IOX", "");
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / arr.length;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int power(int a, int n) {
        return (int) Math.pow(a, n);
    }

    public static void permute(String s, String result) {
        if (s.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            permute(s.substring(0, i) + s.substring(i + 1), result + s.charAt(i));
        }
    }

    public static boolean isAllDigits(String s) {
        return s.matches("\\d+");
    }

    public static int binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
