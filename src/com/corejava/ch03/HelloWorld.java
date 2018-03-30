package com.corejava.ch03;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class HelloWorld {
    public static void main(String[] args) {
        SquareSequence squares = new SquareSequence();
        double avg = average(squares, 100);
        System.out.println(avg);

        DigitSequence digit = new DigitSequence(1729);
        while (digit.hasNext()) {
            System.out.println(digit.next());
        }

//        Runnable task = new HelloTask();
//        Thread thread = new Thread(task);
//        thread.start();
        repeatMessage("Hello,World!", 1000);
    }

    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
            for (int i = 0; i < count; i++) {
                System.out.println(text);
            }
        };
        new Thread(r).start();
    }
}
