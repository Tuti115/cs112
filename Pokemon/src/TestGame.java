/*

Project: Pokemon
Programmer: Jose A Huerta
Professor: June Porto
Course: CS112 TTH 1:30-3:20

Objective: Design a game to emulate the classic pokemon battle from the third generation

Algorithm:

* Class Pokemon:








 */
public class TestGame
{
    public static void main(String[] args)
    {
        Battle battle = new Battle();

        Player red = Player.initializePlayerRed();
        Pokemon mewtwo = Pokemon.generateMewtwo();

        battle.wildBattle(red, mewtwo);

    }

}