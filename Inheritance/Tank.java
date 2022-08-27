public class Tank extends Car{
    private final int MAX_WEAPON=100;
    private final int MIN_WEAPON=0;
    private int numberOfWeapons=0;
    public Tank(String name, int shielding ) {
        super(name);
        super.setWeapon(true);
        super.setShielding(shielding);
        this.numberOfWeapons = 100;
    }
    public void setNumberOfWeapons(int numberOfWeapons){
        this.numberOfWeapons += numberOfWeapons;
        if(this.numberOfWeapons > MAX_WEAPON){
            this.numberOfWeapons = MAX_WEAPON;
        }
        if(this.numberOfWeapons < MIN_WEAPON){
            this.numberOfWeapons = MIN_WEAPON;
        }
    }
    public void shoot(){
        if(this.numberOfWeapons > MIN_WEAPON){
            setNumberOfWeapons(-1);
        }else{
            System.out.println("Without weapons!");
        }
    }
    public void info(){
        super.info();
        System.out.printf("N. of Weapon:%s%n",this.numberOfWeapons);
    }
}
