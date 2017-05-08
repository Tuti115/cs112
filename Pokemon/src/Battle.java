


import java.util.Random;

public class Battle
{
    /* Initializations */

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


    /* Methods */


    public void wildBattle(Player player, Pokemon wildPoke)
    {

        boolean playerTeamAlive = true;
        boolean wild = true;
        int activePoke = 0;

        Thread t1 = new Thread(new PokemonAudio(1));
        t1.start();

        while(playerTeamAlive && wild)
        {


            //not complete

        }
    }

    public double calculateMove(Pokemon attacker, int moveNum, Pokemon defender)
    {
        Move move= attacker.getMovelist().get(moveNum);
        Random rand = new Random();

        int attackerlvl;
        double attackstat, defendstat, critical, damage, power, stab, random, typemod, modifier;

        attackerlvl = attacker.getLevel();
        power = move.getPower();
        stab = move.getSTAB();
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

        typemod = getTypeDamageModifierElement(attacker, move, defender);

        modifier = stab * random * typemod * critical;



        damage = ((((((2 * attackerlvl) / 5) + 2) * power * (attackstat/defendstat)) / 50) + 2) * modifier;


        return damage;
    }

    public double getTypeDamageModifierElement(Pokemon attacker, Move move, Pokemon defender)
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
                if(attacker.equals(type_names[index]))
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
                if(defender.equals(type_names[index]))
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

        double critical, temp;
        int randomNum, threshold, speed;






        randomNum = r.nextInt(255);
        //threshold = ;










        return critical;
    }

















}
