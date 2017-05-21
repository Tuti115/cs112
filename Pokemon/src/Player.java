


import java.util.ArrayList;
public class Player
{
    /* Declarations */
    private String player_name;
    private ArrayList<Pokemon> pokemonList= new ArrayList<>();
    private ArrayList<Item> itemList = new ArrayList<>();

    /* Accessor Methods */
    public String getPlayer_name()
    {
        return this.player_name;
    }
    public ArrayList getPokemonList()
    {
        return this.pokemonList;
    }
    public ArrayList getItemList()
    {
        return this.itemList;
    }

    /* Setter Methods */
    public void setPlayer_name(String name)
    {
        this.player_name = name;
    }

    /* Constructors */
    public Player()
    {
        //default constructor
        this.player_name = null;
        this.pokemonList = new ArrayList<Pokemon>();
        this.itemList = new ArrayList<Item>();

    }

    public Player(String name, ArrayList<Pokemon> pokelist, ArrayList<Item> itemlist)
    {
        //main constructor
        this.player_name = name;
        this.pokemonList = pokelist;
        this.itemList = itemlist;
    }

    /* Methods */
    public static Player initializePlayerRed()
    {
        ArrayList<Pokemon> pokelist = new ArrayList<>();
        ArrayList<Item> itemlist = new ArrayList<>();

        Pokemon pikachu = Pokemon.generatePikachu();
        Pokemon charizard = Pokemon.generateCharizard();
        Pokemon blastoise = Pokemon.generateBlastoise();

        Pokemon venasaur = Pokemon.generateVenasaur();
        Pokemon dragonite = Pokemon.generateDragonite();

        pokelist.add(pikachu);
        pokelist.add(charizard);
        pokelist.add(blastoise);

        pokelist.add(venasaur);
        pokelist.add(dragonite);

        Player red = new Player("Red", pokelist, itemlist);

        return red ;
    }

}
