public class gun extends Weapon{
    public double bulletpower; //for Gun only
    public double range; //for Gun only
    public gun(){
       super(2, "GUN");
       this.bulletpower = 100;
       this.range = 1;
    }
    public double getBulletpower() { return bulletpower; }
    public double getRange() { return range; }
}
