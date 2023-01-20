public class Main {
    public static void main(String[] args) {
        Car11 Zapor1 = new Car11();
        Car11 Zapor2 = new Car11();

        System.out.println(Zapor1.getAge());
        System.out.println(Zapor1.calculateIndex());
        System.out.println(Zapor2.power);
        System.out.println(Zapor2.upgradePower(50));
        System.out.println(Zapor2.calculateIndex());

    }
}