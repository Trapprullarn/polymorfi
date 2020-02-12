public class Main {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        arr[0] = new Volvo();
        arr[1] = new Saab();
        arr[2] = new Koenigsegg();

        arr[0].brand();
        arr[0].color();
        arr[0].fuel();
        System.out.println("");

        arr[1].brand();
        arr[1].color();
        arr[1].fuel();
        System.out.println("");

        arr[2].brand();
        arr[2].color();
        arr[2].fuel();
    }
}