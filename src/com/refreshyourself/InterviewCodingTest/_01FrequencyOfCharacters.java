package com.refreshyourself.InterviewCodingTest;

public class _01FrequencyOfCharacters {
    //
    //FrequencyOfChars("AAABBCDDD") ==> A3B2C1D2

    public static void main(String[] args) {

        FrequencyOfChars("A3B2C1D2");
    }

    public static String FrequencyOfChars(String str) {

        String nonDup = "";

        for (int i = 0; i < str.length(); i++)

            if (!nonDup.contains("" + str.charAt(i)))

                nonDup += "" + str.charAt(i);

        String expectedResult = "";

        for (int j = 0; j < nonDup.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == nonDup.charAt(j))

                    count++;

            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        return expectedResult;
    }

}

