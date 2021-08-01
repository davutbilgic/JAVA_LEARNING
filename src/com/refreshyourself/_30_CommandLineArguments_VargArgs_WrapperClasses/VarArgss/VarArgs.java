package com.refreshyourself._30_CommandLineArguments_VargArgs_WrapperClasses.VarArgss;

public class VarArgs {

    public static void main(String[] args) {

        Calculator c = new Calculator();
        int nums[] ={2,3,77};
        c.printAllArrayNumbers(nums);
        c.printAllNumbers(1,2,3,4,54,3453,2435);
        c.printAllNumbers(654,823,78,65,6,7163);


        c.printAll(true, false, "myStrings", 45, 36.23f, 12.02d, c.hashCode());


    }
}
