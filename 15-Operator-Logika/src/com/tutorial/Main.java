package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //Operator logika --> operasi yg bisa dilakukn pd tipe data boolean
        // AND, OR, XOR, Negasii

        boolean a,b,c;

        // OR / Atsu (||)
        System.out.println("======= 0R (||) ========");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c + "\n");

        // AND / dan (&&)
        System.out.println("======= AND (&&) =======");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c + "\n");

        // XOR / (^)
        System.out.println("======= XOR (^) =======");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c + "\n");

        // NOT / negasi (!)
        System.out.println("======= NOT (!) =======");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);
        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);



    }
}
