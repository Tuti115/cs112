import java.util.ArrayList;
import java.util.Random;

public class Pokemon
{
    /* Declarations */
    private String name;
    private String type1;
    private String type2;
    private int level;

    private int HP;
    private double attack;
    private double special_attack;

    private double defense;
    private double special_defense;
    private double speed;



    private ArrayList<Move> movelist = new ArrayList<>();

    /* Accessor Methods */
    public String getName()
    {
        return this.name;
    }
    public String getType1()
    {
        return this.type1;
    }
    public String getType2()
    {
        return this.type2;
    }

    public int getLevel()
    {
        return this.level;
    }
    public int getHP()
    {
        return this.HP;
    }
    public double getSpeed()
    {
        return this.speed;
    }

    public double getAttack()
    {
        return this.attack;
    }
    public double getSpecial_attack()
    {
        return this.special_attack;
    }
    public double getDefense()
    {
        return this.defense;
    }
    public double getSpecial_defense()
    {
        return this.special_defense;
    }

    public ArrayList<Move> getMovelist()
    {
        return this.movelist;
    }
    /* Mutator Methods */
    public void setName(String name)
    {
        this.name = name;
    }
    public void setType1(String type)
    {
        this.type1 = type;
    }
    public void setType2(String type)
    {
        this.type2 = type;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }
    public void setHP(int HP)
    {
        this.HP = HP;
    }
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public void setAttack(double attack)
    {
        this.attack = attack;
    }
    public void setSpecial_attack(double special_attack)
    {
        this.special_attack = special_attack;
    }
    public void setDefense(double defense)
    {
        this.defense = defense;
    }
    public void setSpecial_defense(double special_defense)
    {
        this.special_defense = special_defense;
    }

    public void setMovelist(ArrayList<Move> moveList)
    {
        this.movelist = moveList;
    }
    /* Constructor */
    public Pokemon()
    {
        //default constructor
        this.name = "Bulbasaur";
        this.type1= "Grass";
        this.type2= null;
        this.level = 5;

        this.HP = 1;
        this.attack = 1;
        this.special_attack = 1;

        this.defense = 1;
        this.special_defense = 1;
        this.speed = 1;

        this.movelist = new ArrayList<Move>();
    }

    public Pokemon(String name, String type1, String type2, int level,
                   int HP, double attack, double special_attack, double defense,
                   double special_defense, double speed, ArrayList<Move> list)
    {
        this.name = name;
        this.type1= type1;
        this.type2= type2;
        this.level = level;

        this.HP = HP;
        this.attack = attack;
        this.special_attack = special_attack;

        this.defense = defense;
        this.special_defense = special_defense;
        this.speed = speed;

        this.movelist = list;

    }

    public Pokemon generatePikachu()
    {
        Random rand = new Random();

        String name = "Pikachu";
        String type1 = "Electric";
        String type2 = null;
        int level = 88;

        int HP, attack, defense, specialAttack, specialDef, speed;

        HP = rand.nextInt(243) + 211;
        attack = rand.nextInt(202) + 166;
        defense = rand.nextInt(154) + 126;

        specialAttack = rand.nextInt(193) + 163;
        specialDef = rand.nextInt(173) + 142;
        speed = rand.nextInt(270) + 221;

        getMovelist().add(new Move("Volt Tackle", "Electric", ))

        Pokemon pikachu =  new Pokemon(name, type1, type2, level, HP, attack,
                specialAttack, defense, specialDef, speed, list);

        return pikachu;


    }



    public static Pokemon generateVenasaur()
    {
        Random rand = new Random();

        String name = "Venasaur";
        String type1 = "Grass";
        String type2 = "Poison";
        int level = 84;
        boolean isSpecial = true;
        boolean notSpecial = false;
        int HP;
        double attack, defense, specialAttack, specialDef, speed;

        HP = rand.nextInt(327) + 280;
        attack = rand.nextInt(243) + 199;
        defense = rand.nextInt(245) + 201;

        specialAttack = rand.nextInt(277) + 226;
        specialDef = rand.nextInt(277) + 226;
        speed = rand.nextInt(240) + 196;


        Move move1 = new Move("Sludge Bomb", "Poison", 90, notSpecial,
                0.3, 10, 1, 1.5, 188);
        Move move2 = new Move("Giga Drain", "Grass",  75, isSpecial,
                0.5, 5, 1, 1.5, 202);
        Move move3 = new Move("Vine Whip", "Grass",  45, isSpecial,
                0.0, 25, 1, 1.5, 22);
        Move move4 = new Move("Razor Leaf", "Grass", 55, isSpecial,
                0.0, 25, .95, 1.5, 75);

        ArrayList<Move> list = new ArrayList<>();
        list.add(move1);
        list.add(move2);
        list.add(move3);
        list.add(move4);

        Pokemon venasaur = new Pokemon(name, type1, type2, level, HP, attack,
                specialAttack, defense, specialDef, speed, list);

        return venasaur;
    }

    public static Pokemon generateDragonite()
    {
        Random rand = new Random();

        String name = "Dragonite";
        String type1 = "Dragon";
        String type2 = "Flying";
        int level = 85;
        boolean isSpecial = true;
        boolean notSpecial = false;
        int HP;
        double attack, defense, specialAttack, specialDef, speed;

        HP = rand.nextInt(340) + 320;
        attack = rand.nextInt(343) + 281;
        defense = rand.nextInt(271) + 221;

        specialAttack = rand.nextInt(280) + 229;
        specialDef = rand.nextInt(280) + 229;
        speed = rand.nextInt(242) + 198;

        Move move1 = new Move("Outrage", "Dragon", 120, isSpecial,
                rand.nextInt(3) + 2, 10, 1, 1.5, 200);
        Move move2 = new Move("Dragon Claw", "Dragon", 80, isSpecial,
                0.0, 15, 1, 1.5, 337);
        Move move3 = new Move("Thunder", "Electric",  110, isSpecial,
                0.0, 10, 1, 1.5, 202);
        Move move4 = new Move("Ice Beam", "Ice",  90, isSpecial,
                0.0, 10, 1, 1, 58);

        ArrayList<Move> list = new ArrayList<>();
        list.add(move1);
        list.add(move2);
        list.add(move3);
        list.add(move4);

        Pokemon dragonite = new Pokemon(name, type1, type2, level, HP, attack,
                specialAttack, defense, specialDef, speed, list);

        return dragonite;
    }

    public static Pokemon generateMewtwo()
    {
        Random rand = new Random();

        String name = "Mewtwo";
        String type1 = "Psychic";
        String type2 = null;
        int level = 85;
        boolean isSpecial = true;
        boolean notSpecial = false;
        int HP;
        double attack, defense, specialAttack, specialDef, speed;

        HP = rand.nextInt(354) + 334;
        attack = rand.nextInt(281) + 230;
        defense = rand.nextInt(246) + 201;

        specialAttack = rand.nextInt(359) + 293;
        specialDef = rand.nextInt(246) + 201;
        speed = rand.nextInt(317) + 259;

        Move move1 = new Move("Psychic", "Psychic", 90, isSpecial,
                0.0, 10, 1, 1.5, 94);
        Move move2 = new Move("Thunder", "Electric",  110, isSpecial,
                0.0, 10, 1, 1.5, 202);
        Move move3 = new Move("Ice Beam", "Ice",  90, isSpecial,
                0.0, 10, 1, 1, 58);
        Move move4 = new Move("Recover", "Normal",  0, notSpecial,
                0.5, 20, 1, 1, 105);

        ArrayList<Move> list = new ArrayList<>();
        list.add(move1);
        list.add(move2);
        list.add(move3);
        list.add(move4);

        Pokemon mewtwo = new Pokemon(name, type1, type2, level, HP, attack,
                specialAttack, defense, specialDef, speed, list);

        return mewtwo;
    }



    //toString
    public String toString()
    {
        return "Pokemon: " + getName() + "\nType 1: " + getType1() + "\nType 2: " + getType2() +
                "\nLevel: " + getLevel() + "\nHP: " + getHP() + "\nSpeed: "  + getSpeed() + "\nattack: " + getAttack() +
                "\nSpecial attack: " + getSpecial_attack() + "\nDefense: " + getDefense() + "\nSpecial Defense: " +
                getSpecial_defense() + "\nSpeed: " + getSpeed() + "\nMove 1: " + getMovelist().get(0).getMove_name() +
                "Move 2: " + getMovelist().get(1).getMove_name() + "\nMove 3: " + getMovelist().get(2).getMove_name() +
                "\nMove 3: " + getMovelist().get(3).getMove_name();

    }

}