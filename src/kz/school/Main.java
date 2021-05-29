package kz.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        chooseAction();
    }

    public static void chooseAction(){
        System.out.println("Welcome to LMS!");
        System.out.println("Выберите действие:");
        System.out.println("1 Добавить книгу");
        System.out.println("2 Удалить книгу");
        System.out.println("3 Изменить название книги");
        System.out.println("4 Найти книгу");

        int choose;
        Scanner scn  = new Scanner(System.in);
        choose = scn.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Вы выбрали действие добавить книгу");

            case 2:
                System.out.println("Вы выбрали действие удалить книгу");
                break;
            case 3:
                System.out.println("Вы выбрали действие изменить название книги");
                break;
            case 4:
                System.out.println("Вы выбрали действие найти книгу");
                break;
            default:
                System.out.println("Неправильный ввод, введите команду еще раз");
                chooseAction();
        }
    }
}
