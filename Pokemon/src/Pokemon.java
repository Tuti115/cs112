import java.util.ArrayList;
import java.util.Random;

public class Pokemon
{
    /* Declarations */
    private String name;
    private String type1;
    private String type2;
    private int level;

    private int currentHP;
    private int baseHP;
    private double attack;
    private double special_attack;

    private double defense;
    private double special_defense;
    private int speed;

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
    public int getCurrentHP()
    {
        return this.currentHP;
    }
    public int getbaseHP()
    {
        return this.baseHP;
    }
    public int getSpeed()
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
    public void setCurrentHP(int hp)
    {
        this.currentHP  = hp;
    }

    public void setBaseHP(int baseHP)
    {
        this.baseHP = baseHP;
    }
    public void setSpeed(int speed)
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

        this.currentHP = 1;
        this.baseHP = 1;
        this.attack = 1;
        this.special_attack = 1;

        this.defense = 1;
        this.special_defense = 1;
        this.speed = 1;

        this.movelist = new ArrayList<Move>();
    }

    public Pokemon(String name, String type1, String type2, int level,
                   int currentHP, int HP, double attack, double special_attack, double defense,
                   double special_defense, int speed, ArrayList<Move> list)
    {
        this.name = name;
        this.type1= type1;
        this.type2= type2;
        this.level = level;

        this.currentHP = currentHP;
        this.baseHP = HP;
        this.attack = attack;
        this.special_attack = special_attack;

        this.defense = defense;
        this.special_defense = special_defense;
        this.speed = speed;

        this.movelist = list;

    }

    /* Generation of Pokemons */
    public static Pokemon generatePikachu()
    {
        Random rand = new Random();

        String name = "Pikachu";
        String type1 = "Electric";
        String type2 = null;
        int level = 88;
        boolean isSpecial = true;
        boolean notSpecial = false;

        int baseHP, currentHP, speed;
        double attack, defense, specialAttack, specialDef;

        baseHP = rand.nextInt(243) + 211;
        currentHP = baseHP;

        attack = rand.nextInt(202) + 166;
        defense = rand.nextInt(154) + 126;

        specialAttack = rand.nextInt(193) + 163;
        specialDef = rand.nextInt(173) + 142;
        speed = rand.nextInt(270) + 221;

        Move move1 = new Move("Volt Tackle", "Electric", 120, isSpecial,
                                0.33, 15, 1, 1.5, 344);
        Move move2 = new Move("Thunderbolt", "Electric", 90, isSpecial,
                0.0, 15, 1, 1.5, 344);
        Move move3 = new Move("Iron Tail", "Steel", 100, notSpecial,
                0.0, 15, .75, 1.0, 231);
        Move move4 = new Move("Quick Attack", "Normal", 40, notSpecial,
                0.0, 30, 1, 1.0, 98);

        ArrayList<Move> list = new ArrayList<>();

        list.add(move1);
        list.add(move2);
        list.add(move3);
        list.add(move4);

        Pokemon pikachu =  new Pokemon(name, type1, type2, level, currentHP, baseHP, attack,
                specialAttack, defense, specialDef, speed, list);

        return pikachu;


    }

    public static Pokemon generateCharizard()
    {
        Random rand = new Random();

        String name = "Charizard";
        String type1 = "Fire";
        String type2 = "Flying";
        int level = 84;
        boolean isSpecial = true;
        boolean notSpecial = false;
        int HP, current, speed;
        double attack, defense, specialAttack, specialDef;

        HP = rand.nextInt(327) + 290;
        current =  HP;
        attack = rand.nextInt(247) + 202;
        defense = rand.nextInt(236) + 193;

        specialAttack = rand.nextInt(293) + 240;
        specialDef = rand.nextInt(249) + 204;
        speed = rand.nextInt(277) + 226;


        Move move1 = new Move("Flamethrower", "Fire", 90, isSpecial,
                0.0, 15, 1, 1.5, 53);
        Move move2 = new Move("Fire Blast", "Fire",  110, isSpecial,
                0.0, 5, .85, 1.5, 202);
        Move move3 = new Move("Dragon Claw", "Dragon",  80, isSpecial,
                0.0, 15, 1, 1.0, 337);
        Move move4 = new Move("Aerial Ace", "Flying", 60, notSpecial,
                0.0, 20, 2, 1.5, 332);

        ArrayList<Move> list = new ArrayList<>();
        list.add(move1);
        list.add(move2);
        list.add(move3);
        list.add(move4);

        Pokemon charizard= new Pokemon(name, type1, type2, level, current, HP, attack,
                specialAttack, defense, specialDef, speed, list);

        return charizard;
    }

    public static Pokemon generateBlastoise()
    {
        Random rand = new Random();

        String name = "Blastoise";
        String type1 = "Fire";
        String type2 = "Flying";
        int level = 84;
        boolean isSpecial = true;
        boolean notSpecial = false;
        int HP, current, speed;
        double attack, defense, specialAttack, specialDef;

        HP = rand.nextInt(325) + 305;
        current  = HP;
        attack = rand.nextInt(245) + 202;
        defense = rand.nextInt(277) + 226;

        specialAttack = rand.nextInt(249) + 204;
        specialDef = rand.nextInt(286) + 234;
        speed = rand.nextInt(236) + 196;


        Move move1 = new Move("Surf", "Water", 90, isSpecial,
                0.0, 15, 1, 1.5, 57);
        Move move2 = new Move("Water Pulse", "Water",  60, isSpecial,
                0.0, 20, 1, 1.5, 352);
        Move move3 = new Move("Ice Beam", "Ice",  90, isSpecial,
                0.0, 10, 1, 1.0, 58);
        Move move4 = new Move("Hydro Canon", "Water", 150, isSpecial,
                0.0, 25, .8, 1.5, 75);

        ArrayList<Move> list = new ArrayList<>();
        list.add(move1);
        list.add(move2);
        list.add(move3);
        list.add(move4);

        Pokemon blastoise = new Pokemon(name, type1, type2, level, current, HP, attack,
                specialAttack, defense, specialDef, speed, list);

        return blastoise;
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
        int HP, current, speed;
        double attack, defense, specialAttack, specialDef;

        HP = rand.nextInt(327) + 280;
        current = HP;
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

        Pokemon venasaur = new Pokemon(name, type1, type2, level, current, HP, attack,
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
        int HP, current, speed;
        double attack, defense, specialAttack, specialDef;

        HP = rand.nextInt(340) + 320;
        current = HP;
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

        Pokemon dragonite = new Pokemon(name, type1, type2, level, current, HP, attack,
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
        int HP, current, speed;
        double attack, defense, specialAttack, specialDef;

        HP = rand.nextInt(354) + 334;
        current  = HP;
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

        Pokemon mewtwo = new Pokemon(name, type1, type2, level, current, HP, attack,
                specialAttack, defense, specialDef, speed, list);

        return mewtwo;
    }

    /* Methods */
    public void addHP(int hp)
    {
        this.currentHP += hp;
    }


    //toString
    public String toString()
    {
        return "Pokemon: " + getName() + "\nType 1: " + getType1() + "\nType 2: " + getType2() +
                "\nLevel: " + getLevel() + "\nHP: " + getbaseHP() + "\nSpeed: "  + getSpeed() + "\nattack: " + getAttack() +
                "\nSpecial attack: " + getSpecial_attack() + "\nDefense: " + getDefense() + "\nSpecial Defense: " +
                getSpecial_defense() + "\nSpeed: " + getSpeed() + "\nMove 1: " + getMovelist().get(0).getMove_name() +
                "Move 2: " + getMovelist().get(1).getMove_name() + "\nMove 3: " + getMovelist().get(2).getMove_name() +
                "\nMove 3: " + getMovelist().get(3).getMove_name();

    }

}
