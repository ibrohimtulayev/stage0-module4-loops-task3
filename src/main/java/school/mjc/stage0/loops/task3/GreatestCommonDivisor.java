package school.mjc.stage0.loops.task3;

import java.math.BigInteger;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        BigInteger gcd = BigInteger.valueOf(first).gcd(BigInteger.valueOf(second));
        System.out.println( gcd);
    }


}

