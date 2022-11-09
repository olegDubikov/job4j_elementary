package ru.job4j.loop;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // объект для считывания числа с консоли
        int password; // переменная для сохранения полученного числа от пользователя
        do { // открываем цикл
            System.out.println("Введите пароль: "); // вывод сообщения до проверки
            password = scanner.nextInt(); // сохраняем введенный пользователем пароль
        } while (password != 555); // повторяем блок do{}, пока пароль не равен 555
        System.out.println("Пароль введён успешно!"); // выводим на печать подтверждение введения правильного пароля
    }
}
