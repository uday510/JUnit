package com.app;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int modulo(int a, int b) {
        return a % b;
    }
    public int leftShift(int a, int b) {
        return a << b;
    }
    public int rightShift(int a, int b) {
        return a >> b;
    }
    public int unsignedRightShift(int a, int b) {
        return a >>> b;
    }
    public int and(int a, int b) {
        return a & b;
    }
    public int or(int a, int b) {
        return a | b;
    }
}
