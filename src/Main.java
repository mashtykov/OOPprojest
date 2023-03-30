public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Красный", "Мерседес",2002);

        System.out.println("Машина номер 1");
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Марка авто: " + car1.getBrand());
        System.out.println("Год выпуска: " + car1.getYear());

        System.out.println("\nМашина номер 2");
        System.out.println("Цвет: " + car2.getColor());
        System.out.println("Марка авто: " + car2.getBrand());
        System.out.println("Год выпуска: " + car2.getYear());

        car1.start();
        car1.stop();
        car2.start();
        car2.stop();

        System.out.println("Done");



    }
}