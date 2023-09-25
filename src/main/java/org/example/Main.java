package org.example;

import java.util.Scanner;

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







