public class Saab extends Car {
    @Override
    public void brand() {
        System.out.println("It's a SAAB.");
    }

    @Override
    public void color() {
        System.out.println("It's red.");
    }

    @Override
    public void fuel() {
        System.out.println("It runs on diesel.");
    }
}