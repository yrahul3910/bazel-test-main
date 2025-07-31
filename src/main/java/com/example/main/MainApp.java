package com.example.main;

import com.example.lib1.MathUtils;
import com.example.lib2.StringUtils;

public class MainApp {
    public static void main(String[] args) {
        int sum = MathUtils.add(10, 5);
        int product = MathUtils.multiply(4, 3);
        
        String original = "Hello Bazel";
        String reversed = StringUtils.reverse(original);
        String upperCase = StringUtils.toUpperCase(original);
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        System.out.println("Upper case: " + upperCase);
    }
}