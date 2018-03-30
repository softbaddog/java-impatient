package com.corejava.ch01;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class HelloWorld {
    public static final int DAYS_PER_WEEKS = 7;


    public static void main(String[] args) {
        System.out.println("Hello World!");

        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.nextInt(10));
        }

        System.out.println(DAYS_PER_WEEKS);
        System.out.println(WeekDay.FRI);

        BigInteger n1 = BigInteger.valueOf(876543210123456789L);
        System.out.println(n1);
        System.out.println(2.0 - 1.1);
        System.out.println(BigDecimal.valueOf(2, 0).subtract(BigDecimal.valueOf(11, 1)));

        String greeting = "Hello World";
        System.out.println(greeting.substring(6).equals("world"));
        System.out.println(greeting.substring(6).equalsIgnoreCase("world"));

        int n2 = 42;
        System.out.println(Integer.toString(n2));
        System.out.println(Integer.toString(n2, 2));
        System.out.println(Integer.toString(n2, 16));

        String str = "101010";
        System.out.println(Integer.parseInt(str));
        System.out.println(Integer.parseInt(str, 2));

        String strstr = "北京欢迎你";
        System.out.println(strstr.length());
        System.out.println(strstr.charAt(2));

        int codePoint = strstr.codePointAt(strstr.offsetByCodePoints(0, 2));
        int length = strstr.codePointCount(0, strstr.length());
        System.out.println(codePoint);
        System.out.println(length);

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("What's your name?");
//        String name = in.nextLine();
//        System.out.println(name);

//        Console terminal = System.console();
//        String username = terminal.readLine("User name: ");
//        char[] passwd = terminal.readPassword("Password: ");
//        System.out.println(username + " " + passwd);

        System.out.printf("%,+.2f\n", 10000.0 / 3.0);

        String name = "FZM";
        String pwd = "123456";

        String text = String.format("%s, %s", name, pwd);
        System.out.println(text);


//        String[] names = new String[10];
//        names[0] = "Tom";
//        names[1] = "Jack";
        String[] names = {"Tom", "Jack"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        ArrayList<String> friends = new ArrayList<>();
        friends.add("AAA");
        friends.add("BBB");

        Iterator<String> it = friends.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }

        ArrayList<String> people = friends;
        ArrayList<String> copiedPeople = new ArrayList<>(friends);

        people.set(1, "CCC");
        copiedPeople.set(0, "CCC");

        Collections.fill(friends,"XXX");

        for(String n: friends) {
            System.out.println(n);
        }
    }
}
