public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("�������", "��������",2002);

        System.out.println("������ ����� 1");
        System.out.println("����: " + car1.getColor());
        System.out.println("����� ����: " + car1.getBrand());
        System.out.println("��� �������: " + car1.getYear());

        System.out.println("\n������ ����� 2");
        System.out.println("����: " + car2.getColor());
        System.out.println("����� ����: " + car2.getBrand());
        System.out.println("��� �������: " + car2.getYear());

        car1.start();
        car1.stop();
        car2.start();
        car2.stop();

        System.out.println("Done");



    }
}