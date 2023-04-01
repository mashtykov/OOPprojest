package HW1;

import java.util.Arrays;
import java.util.Random;

//Используя датчик случайных чисел, заполнить массив из 20 элементов. вывести полученные массивы на экран
//Дан массив. Необходимо напечатать:
//1. Все неотрицательнве элементы
//2. Все элементы, не превышающие число 100
public class Task2 {
    public static void main(String[] args) {
        Double[] array = new Double[20];
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            array[i] = r.nextDouble(-200,200); ;
        }
//        for (int i = 0; i < 20; i++) {
//            System.out.println(array[i] + " ");

            System.out.println(Arrays.deepToString(array));
        System.out.println();
        for (int i = 0; i < 20 ; i++) {
            if (array[i]>0){
                System.out.print(array[i] + " ");
           }
            System.out.println();
        }

        for (int i = 0; i < 20; i++) {
            if (array[i]<=100){
                System.out.print(array[i] + " ");
            }
        }


        }
    }


