package com.companyJD1.lecture12_exceptions;

public class Mission5 extends Exception {
    public static void main(String[] args) {
        Exception exception = new Exception("My_exception");
        try {
            throw exception;
        } catch (Exception e) {
            System.out.println(exception);
        }
    }
}