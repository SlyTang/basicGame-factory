class Weapon {
     public static final int GREAT_SWORD = 1;
     public static final int GUN = 2;
     public int type;
     public String name; // Weapon name
     public Weapon( int type, String name) {
         this.type = type;
         this.name = name;
     }
     public int getType() { return type; }
     public String getName() { return name; }
    }
