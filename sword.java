public class sword extends Weapon{
    public double sharpness; //for Great Sword only
    public sword(){
       super(1, "GREAT_SWORD");
       this.sharpness = 100; 
    }
    public double getSharpness() { return sharpness; }
}
