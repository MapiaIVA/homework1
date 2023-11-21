package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static boolean continueExecution = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (continueExecution) {
            //Task roster
            int numberOfTask = taskRoaster();
            switch (numberOfTask) {
                case 1: {
                    //Task1
                    task1();
                    break;
                }
                case 2: {
                    //Task2
                    task2();
                    break;
                }
                case 3: {
                    //Task3
                    task3();
                    break;
                }
                case 4: {
                    //Task4
                    task4();
                    break;
                }
                case 5: {
                    //Task5
                    task5();
                    break;
                }
                case 6: {
                    //Task6
                    task6();
                    break;
                }
                case 7: {
                    //Task7
                    task7();
                    break;
                }
                case 8: {
                    //Task8
                    task8();
                    break;
                }
                case 9: {
                    //Task9
                    task9();
                    break;
                }

                case 10: {
                    //Task10
                    task10();
                    break;
                }
                case 11: {
                    //Task12
                    task11();
                    break;
                }
                default:
                    System.out.println("Выберите задание!");
                    break;
            }
            nextTaskQuestion();
        }


    }

    public static int taskRoaster() {
        System.out.print("Выберите задание для проверки: ");
        return scanner.nextInt();
    }

    public static void nextTaskQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите проверить другую задачу?  Да/Нет: ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("да")) {
            continueExecution = true;
        } else if (choice.equalsIgnoreCase("нет")) {
            scanner.close();
            continueExecution = false;
        }
    }

    public static void task1() {
        System.out.println("Your time is limited, ");
        System.out.println("so don’t waste it living someone else’s life ");
        System.out.println("Steve Jobs");
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую цифру: ");
        double char1 = scanner.nextDouble();
        System.out.print("Введите вторую цифру: ");
        double char2 = scanner.nextDouble();
        double procent = char1 / char2;
        System.out.println("Результат: " + procent);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую цифру: ");
        int char1 = scanner.nextInt();
        System.out.print("Введите вторую цифру: ");
        int char2 = scanner.nextInt();
        System.out.print("Введите третью цифру: ");
        int char3 = scanner.nextInt();
        int number = char1 * 100 + char2 * 10 + char3;
        System.out.println("Сформированное число: " + number);
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую цифру: ");
        int char1 = scanner.nextInt();
        System.out.print("Введите вторую цифру: ");
        int char2 = scanner.nextInt();
        System.out.print("Введите третью цифру: ");
        int char3 = scanner.nextInt();
        System.out.print("Введите четвертую цифру: ");
        int char4 = scanner.nextInt();
        System.out.print("Введите пятую цифру: ");
        int char5 = scanner.nextInt();
        System.out.print("Введите шестую цифру: ");
        int char6 = scanner.nextInt();
        int number = char6 * 100000 + char5 * 10000 + char3 * 1000 + char4 * 100 + char2 * 10 + char1;
        System.out.println("Сформированное число: " + number);
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();

        if (month == 1) {
            System.out.println("Winter");
            String info = scanner.nextLine();
            System.out.println(info);
        }
        if (month >= 3 && month <= 5) {
            System.out.println("Spring");
            String info = scanner.nextLine();
            System.out.println(info);
        }
        if (month >= 6 && month <= 8) {
            System.out.println("Summer");
            String info = scanner.nextLine();
            System.out.println(info);
        }
        if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
            String info = scanner.nextLine();
            System.out.println(info);
        }
    }

    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите метры: ");
        double char1 = scanner.nextDouble();
        System.out.print("1- мили, 0- дюймы, 2-ярды ");
        double uuu = scanner.nextDouble();
        {
            if (uuu == 1) {
                double result;
                result = char1 * 0.006;
                System.out.println("Результат: " + result);
            } else if (uuu == 0) {
                double result;
                result = char1 * 39.3701;
                System.out.println("Результат: " + result);
            } else if (uuu == 2) {
                double result;
                result = char1 * 1.09361;
                System.out.println("Результат: " + result);
            }
        }
    }

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.print("Even number ");
        } else if (num % 2 != 0) {
            System.out.print("Odd number ");
        }
    }

    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало диапазона:");
        int start = scanner.nextInt();
        System.out.println("Введите конец диапазона:");
        int end = scanner.nextInt();
        System.out.println("Таблица умножения в диапазоне от " + start + " до " + end);
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

    }

    public static void task9() {
        int[] array = generateRandomArray(10, -10, 10);

        int min = array[0];
        int max = array[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < 0) {
                negativeCount++;
            } else if (array[i] > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество нулей: " + zeroCount);
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        return array;
    }

    public static void task10() {
        int[] numbers = generateRandomArray(10);

        int[] evenNumbers = getEvenNumbers(numbers);
        int[] oddNumbers = getOddNumbers(numbers);
        int[] negNumbers = getNegativeNumbers(numbers);
        int[] posNumbers = getPositiveNumbers(numbers);

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Массив четных чисел: " + Arrays.toString(evenNumbers));
        System.out.println("Массив нечетных чисел: " + Arrays.toString(oddNumbers));
        System.out.println("Массив отрицательных чисел: " + Arrays.toString(negNumbers));
        System.out.println("Массив положительных чисел: " + Arrays.toString(posNumbers));
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10) - 5;
        }

        return array;
    }

    public static int[] getEvenNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }

    public static int[] getOddNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }

    public static int[] getNegativeNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number < 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int number : array) {
            if (number < 0) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }

    public static int[] getPositiveNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number > 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int number : array) {
            if (number > 0) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }
    public static void task11() {
        int[] array = {1, 3, 4, 5, 6, 9};

        System.out.println("Исходный массив: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип сортировки (1 - по возрастанию, 2 - по убыванию):");
        int choice = scanner.nextInt();

        if (choice == 1) {
            sortAscending(array);
            System.out.println("Отсортированный массив по возрастанию: " + Arrays.toString(array));
        } else if (choice == 2) {
            sortDescending(array);
            System.out.println("Отсортированный массив по убыванию: " + Arrays.toString(array));
        } else {
            System.out.println("Некорректный выбор типа сортировки.");
        }

        scanner.close();
    }

    public static void sortAscending(int[] array) {
        Arrays.sort(array);
    }

    public static void sortDescending(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    }




