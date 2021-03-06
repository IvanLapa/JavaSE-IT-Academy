package com.companyJD1.lecture12_exceptions;

/**Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
 * Добавить вконструктор своего класса возможность указания сообщения.
 */

public class Mission4 {
    public static void main(String[] args) {
        try {
            throwExcaption();
        } catch (My_Exception ex) {
            ex.printStackTrace();
        }
    }
    static void throwExcaption() throws My_Exception {
        throw new My_Exception("qwe");
    }
    private static class My_Exception extends RuntimeException {
        My_Exception(String x){
            super(x);
        }
    }
}