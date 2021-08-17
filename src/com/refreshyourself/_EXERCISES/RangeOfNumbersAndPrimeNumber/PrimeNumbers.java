package com.refreshyourself._EXERCISES.RangeOfNumbersAndPrimeNumber;
public class PrimeNumbers {
    private static int countOfPrimeNumber = 0;
    /**
     * @param firstNumber  The numbers must be positive and second number must be bigger than first number!
     * @param secondNumber The numbers must be positive and second number must be bigger than first number!
     */
    public static void giveYourNumberRange(int firstNumber, int secondNumber) {
        if (firstNumber < 0 || secondNumber < 0 || firstNumber > secondNumber || firstNumber < 2) {
            System.out.println("The numbers must be positive and second number must be bigger than first number! Also firstNumber must be bigger than 1");
        } else {
            int myLoopCount = Math.abs(firstNumber - secondNumber);
            int rollingNumber = firstNumber;

            for (int i = 0; i < myLoopCount; i++) {

                if (isPrime(rollingNumber)) {
                    countOfPrimeNumber++;
                    System.out.println("prime number: " + rollingNumber + " and count of prime number: " + countOfPrimeNumber);

                    if (countOfPrimeNumber >= 3)
                        break;
                }
                rollingNumber++;
            }
        }
    }
    /**
     * @param number must be positive
     * @return false or true
     */
    public static boolean isPrime(int number) {
        if (number < 0) {
            System.out.println("number must be positive!");
            return false;
        } else {
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
