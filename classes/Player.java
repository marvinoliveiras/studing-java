public class Player{
    public int num=0;
    private int lifes=1;
    private int maxLifes=3;
    static boolean alert=false;
    static int numberOfPlayers=0;
    public Player(int number){
        this.num=number;
        this.lifes=3;
        System.out.printf("%n Created Player, number %d!%n", number);
        numberOfPlayers++;
    }
    public int getLifes(){
        return this.lifes;
    }
    public void setLifes(int lifes){
        if(lifes > maxLifes){
            this.lifes=maxLifes;
            return;
        }
        this.lifes=lifes;
    }
    public void addLifes(){
        if(lifes < maxLifes){
            this.lifes++;
            return;
        }
    }
    public void info(){
        System.out.printf("%nPlayer: %d", this.num);
        System.out.printf("%nLifes: %d", this.lifes);
        System.out.printf("%nAlert: %s", alert ? "yes": "no");
        System.out.printf("%nPlayers: %s", numberOfPlayers);
        System.out.printf("%n----------------------------%n");
    }
}