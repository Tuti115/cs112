


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

    public void doMove(Pokemon attacker, int index, Pokemon defender)
    {

        String name = attacker.getMovelist().get(index).getMove_name();
        boolean isSpecialMove = false;
        double dRandom;

        int damage, modifier;

        switch(name)
        {
            case "Recover":
                int random = r.nextInt(50 - 26) + 25 ;
                dRandom = random * .01;

                modifier = (int) (attacker.getbaseHP() * dRandom);

                attacker.addHP(modifier);
                isSpecialMove = true;

                break;

            case "Volt Tackle":
                modifier= (int )(calculateMoveEffectiveness(attacker, index, defender) * .33);
                damage = (int) calculateMoveEffectiveness(attacker, index, defender);

                defender.lowerCurrentHP(damage);
                attacker.lowerCurrentHP(modifier);
                isSpecialMove = true;

                break;

            case "Giga Drain":

                damage = (int) calculateMoveEffectiveness(attacker, index, defender);
                modifier = damage / 2;

                defender.lowerCurrentHP(damage);
                attacker.addHP(modifier);
                isSpecialMove = true;

                break;

            default:
                //did not find anything
                break;
        }

        if(isSpecialMove)
            return;

        damage = (int)calculateMoveEffectiveness(attacker, index, defender);
        defender.lowerCurrentHP(damage);

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
        random = ( (rand.nextInt(100 - 70) + 69 ) * .01 ); //need to get a decimal

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

        move.decrementPP();
        attacker.getMovelist().set(moveNum, move);

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

    public int mewtwoMovePicker(Pokemon mewtwo, Pokemon defender)
    {
        int move;

        if(mewtwo.getCurrentHP() < (mewtwo.getbaseHP() / 4) && mewtwo.getMovelist().get(3).getPp() > 0)
        {
            move = 3;
            return move;
        }

        if(defender.getType1().equals("Water") || defender.getType1().equals("Flying") && mewtwo.getMovelist().get(1).getPp() > 0)
        {
            move = 1;
            return move;
        }

        if(defender.getType1().equals("Flying") || defender.getType1().equals("Dragon")
                || defender.getType1().equals("Grass") || defender.getType1().equals("Ground")
                && mewtwo.getMovelist().get(2).getPp() > 0)
        {
            move = 2;
            return move;
        }

        return 0; //standard mewtwo attack: Psychic
    }
}