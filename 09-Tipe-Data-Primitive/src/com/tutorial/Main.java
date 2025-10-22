package com.tutorial;

public class Main {
    public static void main(String[] args){

        //tipe data = integer,byte,short,long,char,boolean,char,boolean.

        //integer (satuan)
        int i = 10;
        System.out.println("==========INTEGER==========");
        System.out.println("nilai integer i = " + i);
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("besar integer = " + Integer.BYTES + " Byte");
        System.out.println("besar integer = " + Integer.SIZE + " Bit");

        //byte (satuan)
        byte b = 10;
        System.out.println("==========BYTE==========");
        System.out.println("nilai byte b = " + b);
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("besar byte = " + Byte.BYTES + " Byte");
        System.out.println("besar byte = " + Byte.SIZE + " Bit");

        //short (satuan)
        short s = 10;
        System.out.println("==========SHORT==========");
        System.out.println("nilai short s = " + s);
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("besar short = " + Short.BYTES + " Byte");
        System.out.println("besar short = " + Short.SIZE + " Bit");

        //byte (satuan)
        long l = 10L;
        System.out.println("==========LONG==========");
        System.out.println("nilai long l = " + l);
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("besar long = " + Long.BYTES + " Byte");
        System.out.println("besar long = " + Long.SIZE + " Bit");

        //char (koma)
        char c = 'p';
        System.out.println("==========CHAR==========");
        System.out.println("nilai char c = " + c);
        System.out.println("nilai max = " + Character.MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("besar char = " + Character.BYTES + " Byte");
        System.out.println("besar char = " + Character.SIZE + " Bit");

        //boolean (koma)
        boolean val = true;
        System.out.println("==========boolean==========");
        System.out.println("nilai boolean val = " + val);
        System.out.println("nilai max = " + Boolean.TRUE);
        System.out.println("nilai min = " + Boolean.FALSE);


    }
}
