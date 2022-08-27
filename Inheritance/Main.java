public class Main {
    public static void main(String[] args) {
        Car c1=new Car("Golf");
        c1.setPower(true);
        c1.info();

        Tank c2 = new Tank("Panther", 100);
        c2.info();

        c2.shoot();
        c2.shoot();
        c2.shoot();
        c1.takeDamage(50);

        c2.info();
        c1.info();

        System.out.println();
        Plane plane1 = new Plane("PT1", 1);
        plane1.info();
    }
}
