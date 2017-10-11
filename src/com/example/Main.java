package com.example;

public class Main {

    public static void main(String[] args) {
        int x = 10021;
        System.out.println(reverse(x));
    }

    public static Integer reverse(Integer x) {
        String reverse;
        if (x < 0) {
            reverse = String.valueOf(Math.abs(x));
        } else {
            reverse = String.valueOf(x);
        }
        StringBuilder solution = new StringBuilder();
        for (int i = reverse.length() - 1; i >= 0; --i) {
            solution.append(reverse.charAt(i));
        }
        try {
            if (x < 0) {
                return -Integer.valueOf(solution.toString());
            }
            return Integer.valueOf(solution.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
