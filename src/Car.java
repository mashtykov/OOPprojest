public class Car {
    private String color;
    private String brand;
    private int year;

    public void start(){
        System.out.println("двигатель запущен");
    }
    public void stop(){
        System.out.println("двигатель остановлен");
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Car(){

    }

    public Car(String color, String brand, int year) {
        this.color = color;
        this.brand = brand;
        this.year = year;
    }
}
