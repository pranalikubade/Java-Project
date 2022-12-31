package com.bridgelabzs;

public class DataTypes {

    public static void main(String[] args) {
        int i= -2147483647;
        System.out.println("i =" + i);

        long l=2147483648789065L;
        System.out.println("l =" + l);

        /* Type Conversion */
        int i1=(int)l;
        System.out.println("long to int =" + i1);

        float f=7.89067F;
        System.out.println("f =" + f);

        double d = 6.4096523445455667;
        System.out.println("d ="+d);

        /* Type Conversion */
        float f1=(float)6.4096523445455667;
        System.out.println("double to float=" +f1);

        char ch = 'C';
        System.out.println("ch ="+ch);

    }
}
