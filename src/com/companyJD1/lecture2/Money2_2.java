package com.companyJD1.lecture2;

import com.companyJD1.lecture3.FactorialFor3_7;

import java.util.Scanner;

//  Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
//  Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").
//  Использовать конструкцию if-else.

public class Money2_2 extends FactorialFor3_7 {
    public static void main(String[] args) {
        System.out.println("Введите сумму денег в рублях:");
        Scanner sc = new Scanner(System.in);
        int sum_money = sc.nextInt();
        int result1 = sum_money % 10;
        int result2 =  sum_money % 100;
            if (sum_money==0 || result1== 0) {
            System.out.println(sum_money + " " + "рублей");
        }   else if (sum_money>=11 && sum_money<=19) {
            System.out.println(sum_money + " " + "рублей");
        }   else if (result2 >= 11 && result2<=19) {
            System.out.println(sum_money + " " + "рублей");
        }   else if (result1>=2 && result1<=4) {
            System.out.println(sum_money + " " + "рубля");
        }   else if (result1>=5){
            System.out.println(sum_money + " " + "рублей");
        }   else {
            System.out.println("Пожалуйста, введите корректную сумму");
        }
    }
}