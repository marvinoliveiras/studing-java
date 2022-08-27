public class Car {
    private String name;
    private Boolean power;
    private Boolean destroyed;
    private int shielding;
    private Boolean weapon;

    public Car(String name){
        this.name=name;
        this.power=false;
        this.destroyed=false;
        this.shielding=0;
        this.weapon=false;
    }
    public String getName(){
        return this.name;
    }
    public Boolean getPower(){
        return this.power;
    }
    public void setPower(Boolean power){
        this.power=power;
    }
    public Boolean getDestroyed(){
        return this.destroyed;
    }
    public void setDestroyed(Boolean destroyed){
        this.destroyed=destroyed;
    }
    public Boolean getWeapon(){
        return this.weapon;
    }
    public void setWeapon(Boolean weapon){
        this.weapon = weapon;
    }
    public int getShielding(){
        return this.shielding;
    }
    public int setShielding(int shielding){
        return this.shielding = shielding;
    }
    public void takeDamage(int damage){
        this.shielding-=damage;
        if(this.shielding<=0){
            this.shielding=0;
            this.power=false;
            this.destroyed=true;
        }
    }
    public void info(){
        System.out.println("--------------------------------------");
        System.out.printf("Name........:%s%n",this.name);
        System.out.printf("Power.......:%s%n",this.power ? "Yes" : "No");
        System.out.printf("Destroyed...:%s%n",this.destroyed ? "Yes" : "No");
        System.out.printf("Shielding...:%s%n",this.shielding);
        System.out.printf("Weapon......:%s%n",this.weapon ? "Yes" : "No");
    }
}
