package com.epam.hometask4;
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        int number;
        String str = "";
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            number = sc.nextInt();
            while (number > 0) {
                int binary = number % 2;
                str = binary + str;
                number = number / 2;
            }
            System.out.println("Двоичное число : " + str);
            sc.close();
        }
    }