package com.refreshyourself._EXERCISES.RangeOfNumbersAndPrimeNumber;

public class FindPrimeNumber {

    /**
     *
     * @param givenNumber must be positive and Integer type
     * @return If the number is a prime, method return true otherwise return false
     */
    public static boolean isPrime(long givenNumber) {
        if (givenNumber < 0) {
            System.out.println("Given number must be positive!");
            return false;
        } else if (givenNumber == 1) {
            return false;
        } else {
            for (int i = 2; i < givenNumber; i++) {

                if (givenNumber % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
