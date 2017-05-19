


import java.util.Random;

public class Battle
{
    /* Declarations */
    private boolean battle_over;

    /* Initializations */
    static Random r = new Random();
    private static double[][] TypeDamageModifiers =
        {{1.0, 1.0, 1.0, 1.0, 1.0, .5, 1.0, 0.0, .5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0},
                {2.0, 1.0, .5, .5, 1.0, 2.0, .5, 0.0, 2.0, 1.0 , 1.0, 1.0, 1.0, .5, 2.0, 1.0, 2.0},
                {1.0, 2.0, 1.0, 1.0, 1.0, .5, 2.0, 1.0, .5, 1.0, 1.0, 2.0, .5, 1.0, 1.0, 1.0, 1.0},
                {1.0, 1.0, 1.0, .5, .5, .5, 1.0, .5, 0.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0},
                {1.0, 1.0, 0.0, 2.0, 1.0, 2.0, .5, 1.0, 2.0, 2.0, 1.0, .5, 2.0, 1.0, 1.0, 1.0, 1.0},
                {1.0, .5, 2.0, 1.0, .5, 1.0, 2.0, 1.0, .5, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0},
                {1.0, .5, .5, .5, 1.0, 1.0, 1.0, .5, .5, .5, 1.0, 2.0, 1.0, 2.0, 1.0, 1.0, 2.0},
                {0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, .5, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, .5},
                {1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, .5, .5, .5, 1.0, .5, 1.0, 2.0, 1.0, 1.0},
                {1.0, 1.0, 1.0, 1.0, 1.0, .5, 2.0, 1.0, 2.0, .5, .5, 2.0, 1.0, 1.0, 2.0, .5, 1.0},
                {1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 2.0, .5, .5, 1.0, 1.0, 1.0, .5, 1.0},
                {1.0, 1.0, .5, .5, 2.0, 2.0, .5, 1.0, .5, .5, 2.0, .5, 1.0, 1.0, 1.0, .5, 1.0},
                {1.0, 1.0, 2.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, .5, .5, 1.0, 1.0, .5, 1.0},
                {1.0, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, .5, 1.0, 1.0, 1.0, 1.0, .5, 1.0, 1.0, 0.0},
                {1.0, 1.0, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, .5, .5,  .5, 2.0, 1.0, 1.0, .5, 2.0, 1.0},
                {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, .5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0},
                {1.0, .5, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, .5, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, .5}

            };
    private String[] type_names =
            {"Normal", "Fight", "Flying", "Poison", "Ground", "Rock", "Bug", "Ghost",
                    "Steel", "Fire", "Water", "Grass", "Electric", "Psychic", "Ice", "Dragon", "Dark"};

    /* Accessor Methods */
    public boolean getBattle_Over()
    {
        return this.battle_over;
    }

    /* Mutator Methods */
    public void setBattle_over(boolean over)
    {
        this.battle_over = over;
    }

    /* Methods */
    public void wildBattle(Player player, Pokemon wildPoke)
    {
        setBattle_over(true);

        int activePoke = 0;
        Thread t1 = new Thread(new Audio());
        t1.start();

        while(!getBattle_Over())
        {

            userDecision();



        }
    }

    public void userDecision()
    {
        int decision = -1;

        switch(decision)
        {
            case 0:
                //ATTACK

                break;
            case 1:
                //ITEMS
                break;
            case 2:
                //POKeMON
                break;
            case 3:
                //RUN
            default:
                //SHOULD NOT HIT

        }


    }


    public boolean isWildBattleOver(Player player, Pokemon wild)
    {
        boolean teamFainted = true;
        boolean wildFainted = true;
        int index = 0;
        Pokemon mon;
        Object obj;

        while (teamFainted && index < player.getPokemonList().size())
        {
            obj = player.getPokemonList().get(index);

            mon = (Pokemon) obj;

            if(mon.getCurrentHP() > 1)
                teamFainted = false;

            index++;
        }

        if(wild.getCurrentHP() > 1)
            wildFainted = false;


        if(wildFainted || teamFainted)
        {
            return true;
        }

        return false;
    }




    public boolean effectMove(Move move)
    {
        if(move.getPower() <= 0 || move.getModifier() > 0)
        {
            return true;
        }

        return false;
    }

    public void calculateSpecialMove(Pokemon pokemon, int index)
    {

        String name = pokemon.getMovelist().get(index).getMove_name();

        switch(name)
        {
            case "Recover":
                int random = r.nextInt(50) + 25 ;
                double dRandom = random / 100;

                double temp = pokemon.getbaseHP() * dRandom;
                int recover = (int) temp;

                pokemon.addHP(recover);
                break;
            case "Volt Tackle":


        }
    }

    public double calculateMoveEffectiveness(Pokemon attacker, int moveNum, Pokemon defender)
    {
        Move move = attacker.getMovelist().get(moveNum);
        Random rand = new Random();

        int attackerlvl;
        double attackstat, defendstat, critical, damage, power, stab, random, typemod, modifier;

        attackerlvl = attacker.getLevel();
        power = move.getPower();
        stab = move.getStab();
        random = (rand.nextInt(100) + 85) / 100; //need to get a decimal

        if(!move.getIsSpecial())
        {
            attackstat = attacker.getAttack();
            defendstat = defender.getDefense();
        }
        else
        {
            attackstat = attacker.getSpecial_attack();
            defendstat = defender.getSpecial_defense();
        }

        typemod = getTypeDamageModifierElement(move, defender);
        critical = calculateCritical(attacker);

        modifier = stab * random * typemod * critical;
        damage = ((((((2 * attackerlvl) / 5) + 2) * power * (attackstat/defendstat)) / 50) + 2) * modifier;

        return damage;
    }

    public double getTypeDamageModifierElement(Move move, Pokemon defender)
    {
        String attackType, defendType;

        attackType = move.getType();
        defendType = defender.getType1();

        int attackerNum = -1;
        int defenderNum = -1;
        int index = 0;



        while(attackerNum == -1)
        {
            try
            {
                if(attackType.equals(type_names[index]))
                    attackerNum = index;

                index++;
            }

            catch(IndexOutOfBoundsException e)
            {
                System.out.println("Type number was not found.");
                System.exit(0);
            }
        }

        index = 0;

        while(defenderNum == -1)
        {
            try
            {
                if(defendType.equals(type_names[index]))
                    defenderNum = index;

                index++;
            }

            catch(IndexOutOfBoundsException e)
            {
                System.out.println("Type number was not found.");
                System.exit(0);
            }
        }

        return TypeDamageModifiers[attackerNum][defenderNum];
    }

    public double calculateCritical(Pokemon attacker)
    {
        Random r = new Random();
        double critical;
        int randomNum, threshold;

        randomNum = r.nextInt(255);
        threshold = attacker.getSpeed() / 2 ;

        //critical value will be 2 if random num is less than threshold
        if(randomNum < threshold)
        {
            critical = 2;
        }
        else
        {
            critical = 1;
        }

        return critical;
    }

}