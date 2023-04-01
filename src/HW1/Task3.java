package HW1;

import java.util.Random;
//��� ������. ���� ����������:
//1. ����������� ������� �������
//2. ������������ ������� �������
//3. ������ ������������ �������� �������
//4. ������ ������������� �������� �������
//5. �������� ������� ������������ ������� � �����������
public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(4, 10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100, 100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i]<min){
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("\nmax = " + max + ", max index = " + maxIndex);
        System.out.println("min= " + min + ", min index = " + minIndex);

        array[maxIndex] = min;
        array[minIndex] = max;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
