package org.example;

import java.util.Scanner;
        /*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        и возвращает введенное значение. Ввод текста вместо числа не должно приводить
        к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

        public class Main {
            public static float getFractionalNumber() {
                float number = 0.0f;
                boolean validInput = false;
                Scanner scanner = new Scanner(System.in);

                while (!validInput) {
                    try {
                        System.out.print("Введите дробное число: ");
                        String input = scanner.nextLine();
                        number = Float.parseFloat(input);
                        validInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Не правильный ввод. Введите дробное число.");
                    }
                }

                scanner.close();
                return number;
            }

            public static void main(String[] args) {
                float enteredNumber = getFractionalNumber();
                System.out.println("Ваше число: " + enteredNumber);
            }
        }







