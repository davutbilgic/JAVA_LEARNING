package com.refreshyourself._30_CommandLineArguments_VargArgs_WrapperClasses.WrapperClasses;

public class WrapperClass {
    public static void main(String[] args) {

        //Auto-boxing and Auto-unboxing
        Integer i1 = new Integer(12);
        Integer i2 = 12; // int 12 is auto boxed to Integer2
        int i3 = i1; //Integer i1 is auto-unboxed to int 12

        Double d1 = 3.14; // double 3.14 is auto-boxed d1
        double d2 = new Double(12.5); // Double 12.5 is auto-unboxed to double
        double d3 = d1; // d1 with reference type Double auto-unboxed to double


        //Converting String to Primitive
        Boolean.parseBoolean("true");
        //Character -> None
        Byte.parseByte("1");
        Short.parseShort("1");
        Integer.parseInt("1");
        Long.parseLong("1");
        Float.parseFloat("1");

        // Converting String to wrapper class
        Boolean.valueOf("1");
        //Character -> None
        Byte.valueOf("1");
        Short.valueOf("1");
        Integer.valueOf("1");
        Long.valueOf("1");
        Float.valueOf("1");


        //tried some example
        Boolean b1 = true;
        boolean b2 = true;
        Boolean b3 = new Boolean(true);
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1==b3);
        System.out.println(b1.equals(b3));

        String s1 = "stringValue";
        String s2 = "stringValue";
        String s3 = new String("stringValue");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

    }
}
