package HW1;

import java.util.Scanner;
import static java.util.Arrays.deepToString;

//Заполнить массив из десяти элементов 1,2,...10
//Дан массив. Разработать программу для:
//1. расчета квадратного корня из любого элемента массива
//2. расчета среднего арифметического двух любых элементов массива
public class Task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        System.out.println("Введите любые 10 чисел: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println("Введите номер элемента массива для поиска квадратного корня");
        System.out.println("Квадратный корень= " + sqrt(array[sc.nextInt()]));

        System.out.println("Введите два номера элемнта массива для поиска ср. арифметического ");
        System.out.println("Среднее арифметическое = " + avg(array[sc.nextInt()], array[sc.nextInt()]));

        System.out.println(deepToString(array));
//        for (int i = 0; i < 10; i++) {
//            System.out.print(array[i] + " ");
        }

    public static double sqrt(int element) {
    return Math.sqrt(element);
    }

    public static double avg(int element1, int element2) {
        return (element1 + element2)/2.0;
    }

}

