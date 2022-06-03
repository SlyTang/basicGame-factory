import java.util.Scanner;
class PlayGame {
     public static Scanner sc = new Scanner(System.in);
     public static void main(String []args) {
         System.out.println("select weapon 1=sword 2=gun");
         int input = sc.nextInt();

         if (input == 1) {
             sword s = new sword();
             System.out.println("Your weapon: " + s.getName());
             System.out.print("Input the charge: ");
             double charge = sc.nextDouble();
             System.out.println("Damage on Great Sword: "
            + (charge * s.getSharpness() * 100));
        }else if (input == 2) {
             gun g = new gun();
             System.out.println("Your weapon: " + g.getName());
             System.out.print("Distance to target: ");
             double distance = sc.nextDouble();
             System.out.println("Damage on Gun: "
            + (g.getBulletpower() * g.getRange() / distance));
         }
      }
}