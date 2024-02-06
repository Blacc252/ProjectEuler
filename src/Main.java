public class Main {
    public static void main(String[] args) {
        //Q1 multiples
        System.out.println("Q1");
        int limit = 1000; // Change this to your desired limit
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0) {
                sum += i; // Add the multiple of 3 to the sum
            }
        }System.out.println("The sum of multiples of 3 below " + limit + " is: " + sum);
        System.out.print("__________________________________________________________");
        System.out.println();

        //Q10 Summation of Primes
        System.out.println("Q10");
        long maxNumber = 2000000L;
        long primeSum = 0;
        for (long i = 2; i < maxNumber; i++) {
            if (isPrime(i)) {
                primeSum += i;
            }
        }
        System.out.println("The sum of all primes below " + maxNumber + " is: " + primeSum);
        System.out.print("__________________________________________________________");
        System.out.println();

        //Q5
        System.out.println("Q5");
        int target = 20;
        long result = findSmallestMultiple(target);
        System.out.println("The smallest positive number evenly divisible by all numbers from 1 to " + target + " is: " + result);
        System.out.print("__________________________________________________________");
        System.out.println();

        //Q2 Even Fibonacci Numbers
        System.out.println("Q2");
        int max = 4000000;
        long total = 0;
        int a = 1;
        int b = 2;
        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println("The sum of even Fibonacci numbers up to " + limit + " is: " + sum);
        System.out.print("__________________________________________________________");
        System.out.println();

        //Q6 Sum Square Difference
        System.out.println("Q6");
        int n = 100;
        long sumOfSquares = 0;
        long res = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i*i;
            res += i;
        }
        long squareOfSum = res*res;
        long sumSquareDiff = squareOfSum - sumOfSquares;
        System.out.println("The sum square difference for the first " + n + " natural numbers is: " + sumSquareDiff);
        System.out.print("__________________________________________________________");
        System.out.println();

        //Q9
        System.out.println("Q9");
        int summ = 1000; // The required sum
        int aa=0, bb=0, cc=0;
        for (aa=1; aa<summ/3; aa++) {
            for (bb=aa+1; bb<summ/2; bb++) {
                cc = summ-aa-bb;
                if (aa*aa + bb*bb == cc*cc) {
                    break;
                }
            }
            if (aa*aa+bb*bb== cc*cc) {
                break;
            }
        }
        System.out.println("The Pythagorean triplet that satisfies a + b + c = 1000 is: a = " + aa + ", b = " + bb + ", c = " + cc);
        System.out.println("The product abc is: " + (aa * bb * cc));
        System.out.print("__________________________________________________________");
        System.out.println();
    }
    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static long findSmallestMultiple(int target) {
        long lcm = 1;
        for (int i = 2; i <= target; i++) {
            lcm = getLCM(lcm, i);
        }
        return lcm;
    }
    public static long getLCM(long a, long b) {
        return (a * b) / getGCD(a, b);
    }
    public static long getGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}