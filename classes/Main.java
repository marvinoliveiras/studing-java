public class Main {

    public static void main(String[] args){
        int number = 0;
        System.out.printf("%nAlert: %s%n",
            Player.alert? "yes":"no"
        );

        Player p1 = new Player(++number);
        Player p2 = new Player(++number);
        Player p3 = new Player(++number);
        
        p1.num = 10;
        p2.setLifes(10);
        p3.addLifes();
        p3.addLifes();
        p3.addLifes();
        p3.addLifes();
        p3.addLifes();
        System.out.println(p1.num);
        System.out.println(p2.getLifes());
        System.out.println(p3.getLifes());

        Player.alert = true;
        p1.info();
        p2.info();
        p3.info();
    }
}
