package com.companyJD1.lecture20_thread_executer;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**Написать программу, бесконечно считывающую пользовательские числа из консоли.
 * Эти числа представляют собой количество секунд.
 * При каждом вводе числа, должна создаваться задача, которая засыпает на введённое число секунд и затем выводит "Я спал N секунд".
 * Однако нужно сделать так, чтобы все задачи выполнялись в одном и том же потоке в порядке ввода.
 * Т.е. в программе есть 2 потока: главный и поток для выполнения всех задач по очереди.
 * При вводе -1 программа должна завершать свою работу.
 */

public class Mission1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExecutorService executor_service = Executors.newSingleThreadExecutor();
        while (true) {
            int time = sc.nextInt();
            if(time == -1){
                executor_service.shutdown();
            }
            executor_service.submit(() -> {
                try {
                    TimeUnit.SECONDS.sleep(time);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.out.println("Я спал " + time + " секунд");
            });
        }
    }
}
