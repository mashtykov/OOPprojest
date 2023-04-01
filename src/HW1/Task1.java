package HW1;

import java.util.Scanner;
import static java.util.Arrays.deepToString;

//��������� ������ �� ������ ��������� 1,2,...10
//��� ������. ����������� ��������� ���:
//1. ������� ����������� ����� �� ������ �������� �������
//2. ������� �������� ��������������� ���� ����� ��������� �������
public class Task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        System.out.println("������� ����� 10 �����: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println("������� ����� �������� ������� ��� ������ ����������� �����");
        System.out.println("���������� ������= " + sqrt(array[sc.nextInt()]));

        System.out.println("������� ��� ������ ������� ������� ��� ������ ��. ��������������� ");
        System.out.println("������� �������������� = " + avg(array[sc.nextInt()], array[sc.nextInt()]));

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

