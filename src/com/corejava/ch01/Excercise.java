package com.corejava.ch01;

import java.math.BigInteger;
import java.util.Scanner;

public class Excercise {
    // 测试
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
        demo6();
    }

    public static void demo1() {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println("二进制：b" + Integer.toString(input, 2));
        System.out.println("八进制：0" + Integer.toString(input, 8));
        System.out.println("十六进制：0x" + Integer.toString(input, 16));

        System.out.printf("%.2f", 1.0 / input);
    }

    public static void demo2() {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(input % 360);
        System.out.println(Math.floorMod(input, 360));
    }

    public static void demo3() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println(max);
        System.out.println(Math.max(a, Math.max(b, c)));
    }

    public static void demo4() {
        System.out.println(Math.nextUp(1.0));
        System.out.println(Math.nextUp(Double.MAX_VALUE));
        System.out.println(Math.nextUp(Double.MIN_VALUE));
    }

    public static void demo5() {
        double a = Math.nextUp(Integer.MAX_VALUE);
        int b = (int)a;
        System.out.println(b);

        String str = String.valueOf(a);
        int idx = str.indexOf(".");
        String strNum = str.substring(0, idx);
        int c = Integer.parseInt(strNum);
        System.out.println(c);
    }

    public static void demo6() {
        BigInteger result = new BigInteger("1");
        for (int n = 2; n <= 1000; n++) {
            // 1*2*3*4*5=120
            result = result.multiply(BigInteger.valueOf(n));
        }
        System.out.println(result);
    }
}
